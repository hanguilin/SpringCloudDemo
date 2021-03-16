package cn.javayuli.config.reader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ConfigReaderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigReaderApplication.class, args);
    }
}
