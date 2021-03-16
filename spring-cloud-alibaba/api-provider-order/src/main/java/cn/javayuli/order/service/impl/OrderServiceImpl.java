package cn.javayuli.order.service.impl;

import cn.javayuli.order.entity.Order;
import cn.javayuli.order.mapper.OrderMapper;
import cn.javayuli.order.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 订单服务
 *
 * @author hanguilin
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService  {
}
