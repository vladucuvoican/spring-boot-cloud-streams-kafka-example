package com.wludio.demo.kafkastreams.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

import static com.wludio.demo.kafkastreams.config.StreamsConstants.DEMO_MESSAGE_INPUT;
import static com.wludio.demo.kafkastreams.config.StreamsConstants.DEMO_MESSAGE_OUTPUT;

public interface MessageStreams {

    @Input(DEMO_MESSAGE_INPUT)
    SubscribableChannel inboundDemoMessage();

    @Output(DEMO_MESSAGE_OUTPUT)
    MessageChannel outboundDemoMessage();
}