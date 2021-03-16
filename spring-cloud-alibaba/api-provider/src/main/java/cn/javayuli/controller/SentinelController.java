package cn.javayuli.controller;

import cn.javayuli.service.SentinelService;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 限流测试
 * @author hanguilin
 */
@RestController
public class SentinelController {

    @Autowired
    private SentinelService sentinelService;

    /**
     * 请求资源
     */
    @GetMapping("/getSource")
    public void doGetSource () {
        sentinelService.handleRquest();
    }

    /**
     * 请求资源
     */
    @GetMapping("/hello")
    public String doHello (@RequestParam("s") long s) {
        return sentinelService.hello(s);
    }

    /**
     * 请求资源
     */
    @GetMapping("/testReq")
    @SentinelResource("testSource")
    public String doTest () {
        return "test";
    }
}
