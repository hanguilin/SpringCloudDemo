package cn.javayuli.producer.channel;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

public interface TestChannel {

    String CHANNEL = "testChannel";

    @Output(CHANNEL)
    MessageChannel messageChannel();
}
