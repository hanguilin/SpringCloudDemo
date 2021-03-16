package cn.javayuli.consumer.listener;

import cn.javayuli.consumer.channel.TestChannel;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding({TestChannel.class})
public class TestChannelListener {

    @StreamListener(TestChannel.CHANNEL)
    public void doListener(Object object) {
        System.out.println("接收到" + object.toString());
    }
}
