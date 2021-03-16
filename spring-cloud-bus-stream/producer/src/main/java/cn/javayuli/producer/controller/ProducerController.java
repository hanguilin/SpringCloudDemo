package cn.javayuli.producer.controller;

import cn.javayuli.producer.channel.TestChannel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Autowired
    private TestChannel testChannel;

    @GetMapping("/send")
    public String doTest(String msg) {
        testChannel.messageChannel().send(MessageBuilder.withPayload(msg).build());
        return "已经发送消息[" + msg + "]";
    }
}
