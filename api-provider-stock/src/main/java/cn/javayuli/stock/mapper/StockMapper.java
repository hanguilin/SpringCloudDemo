package cn.javayuli.stock.mapper;

import cn.javayuli.stock.entity.Stock;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 库存Mapper
 *
 * @author hanguilin
 */
@Mapper
public interface StockMapper extends BaseMapper<Stock> {
}
