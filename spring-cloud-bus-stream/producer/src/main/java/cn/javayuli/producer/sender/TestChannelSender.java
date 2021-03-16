package cn.javayuli.producer.sender;

import cn.javayuli.producer.channel.TestChannel;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding({TestChannel.class})
public class TestChannelSender {
}
