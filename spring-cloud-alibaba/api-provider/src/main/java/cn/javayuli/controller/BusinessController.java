package cn.javayuli.controller;

import cn.javayuli.service.BusinessService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 业务控制器
 *
 * @author hanguilin
 */
@RestController
@RequestMapping("/business")
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    /**
     * 下订单
     *
     * @param no 订单编号
     * @param goods 物资
     * @return
     */
    @GlobalTransactional
    @PostMapping("/create/order")
    public String doCreateOrder (@RequestParam("no") String no, @RequestParam("goods") String goods) {
        return businessService.createOrder(no, goods);
    }
}
