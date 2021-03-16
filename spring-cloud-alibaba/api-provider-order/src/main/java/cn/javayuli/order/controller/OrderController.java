package cn.javayuli.order.controller;

import cn.javayuli.order.entity.Order;
import cn.javayuli.order.service.OrderService;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

/**
 * 订单接口
 *
 * @author hanguilin
 */
@RequestMapping("/order")
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 创建订单
     *
     * @param no 订单编号
     * @return
     */
    @PostMapping("/save")
    public String doSaveOrder (@RequestParam("no") String no) {
        Order order = new Order();
        order.setNo(no);
        // 保存订单
        orderService.save(order);
        return "success";
    }

    /**
     * 创建订单
     *
     * @param no 订单编号
     * @return
     */
    @GetMapping("/get")
    public String doGetOrder (@RequestParam("no") String no) {
        Order order = orderService.getOne(Wrappers.lambdaQuery(Order.class).eq(Order::getNo, no));
        return JSON.toJSONString(order);
    }
}
