package com.alphago.springcloud.service.impl;

import com.alphago.springcloud.service.IMessageProvider;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

@EnableBinding(Source.class)   //定义消息的推送管道
public class MessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output;   //消息发送管道

    @Override
    public String send() {

        String serial = UUID.randomUUID().toString();
        boolean result = output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*********serial: " + serial + "******result: " + result + "*****");
        return String.valueOf(result);
    }
}
