package cn.javayuli.consumer.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface TestChannel {

    String CHANNEL = "testChannel";

    @Input(CHANNEL)
    MessageChannel messageChannel();
}
