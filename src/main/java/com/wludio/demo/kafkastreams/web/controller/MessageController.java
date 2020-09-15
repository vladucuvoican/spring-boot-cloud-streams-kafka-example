package com.wludio.demo.kafkastreams.web.controller;

import com.wludio.demo.kafkastreams.model.DemoMessage;
import com.wludio.demo.kafkastreams.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class MessageController {
    private final MessageService messageService;

    @GetMapping("/message")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public DemoMessage greetings(@RequestParam("payload") String message) {
        DemoMessage demoMessage = DemoMessage.builder()
                .payload(message)
                .timestamp(System.currentTimeMillis())
                .build();
        messageService.sendMessage(demoMessage);
        return demoMessage;
    }
}