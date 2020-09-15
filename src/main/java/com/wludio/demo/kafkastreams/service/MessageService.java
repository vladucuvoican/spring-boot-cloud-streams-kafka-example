package com.wludio.demo.kafkastreams.service;

import com.wludio.demo.kafkastreams.config.MessageStreams;
import com.wludio.demo.kafkastreams.model.DemoMessage;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

@Slf4j
@RequiredArgsConstructor
@Service
public class MessageService {
    private final MessageStreams messageStreams;

    public void sendMessage(final DemoMessage demoMessage) {
        log.info("Sending demoMessage {}", demoMessage);
        MessageChannel messageChannel = messageStreams.outboundDemoMessage();
        messageChannel.send(MessageBuilder
                .withPayload(demoMessage)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());
    }
}