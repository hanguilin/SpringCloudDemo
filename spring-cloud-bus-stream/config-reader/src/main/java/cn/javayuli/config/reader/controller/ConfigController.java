package cn.javayuli.config.reader.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigController {

    @Value("${name}")
    public String name;

    @GetMapping("/config")
    public String doConfig() {
        return "name: " + name;
    }
}
