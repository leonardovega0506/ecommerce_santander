package com.minsait.ecommerce.infraestructure.message.adapater;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaConsumerAdapater {

    @KafkaListener(topics =  "prueba-topic", groupId = "consumer")
    public void consumeMessage(String message){
        log.info("Mensaje recibido: {}",message);
    }
}
