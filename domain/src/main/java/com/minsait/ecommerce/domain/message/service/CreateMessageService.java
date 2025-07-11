package com.minsait.ecommerce.domain.message.service;

import com.minsait.ecommerce.domain.message.port.IMessageRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateMessageService {

    private final IMessageRepository messageRepository;

    public String execute(String message){
        return messageRepository.publishMessage(message);
    }
}
