package com.minsait.ecommerce.application.message;

import com.minsait.ecommerce.domain.message.service.CreateMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class MessageCreateHandler {

    private final CreateMessageService createMessageService;

    public String execute(String message){
        return createMessageService.execute(message);
    }
}
