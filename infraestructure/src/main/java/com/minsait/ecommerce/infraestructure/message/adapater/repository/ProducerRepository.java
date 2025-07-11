package com.minsait.ecommerce.infraestructure.message.adapater.repository;

import com.minsait.ecommerce.domain.message.port.IMessageRepository;
import com.minsait.ecommerce.infraestructure.message.adapater.KafkaProducerAdapater;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ProducerRepository implements IMessageRepository {

    private final KafkaProducerAdapater kafkaProducerAdapter;

    @Override
    public String publishMessage(String message) {
        return kafkaProducerAdapter.produceMessage(message);
    }
}
