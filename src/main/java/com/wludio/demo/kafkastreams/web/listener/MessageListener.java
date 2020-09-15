package com.wludio.demo.kafkastreams.web.listener;

import com.wludio.demo.kafkastreams.model.DemoMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import static com.wludio.demo.kafkastreams.config.StreamsConstants.DEMO_MESSAGE_INPUT;

@Slf4j
@Component
public class MessageListener {

    @StreamListener(DEMO_MESSAGE_INPUT)
    public void handleGreetings(@Payload DemoMessage demoMessage) {
        log.info("Received message: {}", demoMessage);
    }
}