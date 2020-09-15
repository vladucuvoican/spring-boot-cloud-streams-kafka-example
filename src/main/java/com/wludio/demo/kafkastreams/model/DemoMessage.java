package com.wludio.demo.kafkastreams.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class DemoMessage {

    private long timestamp;
    private String payload;
}