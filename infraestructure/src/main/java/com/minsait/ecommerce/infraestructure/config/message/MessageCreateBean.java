package com.minsait.ecommerce.infraestructure.config.message;

import com.minsait.ecommerce.domain.message.port.IMessageRepository;
import com.minsait.ecommerce.domain.message.service.CreateMessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageCreateBean {

    @Bean
    public CreateMessageService createMessageService(IMessageRepository messageRepository){
        return new CreateMessageService(messageRepository);
    }
}
