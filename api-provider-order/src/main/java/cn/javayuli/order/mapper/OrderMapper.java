package cn.javayuli.order.mapper;

import cn.javayuli.order.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单mapper
 *
 * @author hanguilin
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
