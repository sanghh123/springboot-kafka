package com.atguigu.springboot.springbootkafka.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumer2 {

    @KafkaListener(topics = "BASIC_BINLIST_HJ_TOPIC")
    public void consumerTopic(String msg){
        System.out.println("收到消息：" + msg);
    }
}
