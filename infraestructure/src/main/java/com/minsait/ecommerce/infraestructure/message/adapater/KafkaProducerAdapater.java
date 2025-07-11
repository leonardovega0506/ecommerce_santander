package com.minsait.ecommerce.infraestructure.message.adapater;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.concurrent.CompletableFuture;

@Slf4j
@RequiredArgsConstructor
@Component
public class KafkaProducerAdapater {

    private final KafkaTemplate<String,String> kafkaTemplate;

    public String produceMessage(String message){
        CompletableFuture<SendResult<String,String>> future = kafkaTemplate.send("prueba-topic",message);

        future.thenAccept(r -> {
            log.info("Mensaje enviado al tema: {}",r.getRecordMetadata().topic());
            log.info("particion: {}",r.getRecordMetadata().partition());
            log.info("offset: {}", r.getRecordMetadata().offset());
        }).exceptionally(e ->{
            log.error("Error al enviar el mensaje: {}",e.getMessage());
            return null;
        });
        return message;
    }
}
