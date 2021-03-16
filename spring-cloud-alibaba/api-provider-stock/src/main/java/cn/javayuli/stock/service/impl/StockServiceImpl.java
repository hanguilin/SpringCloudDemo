package cn.javayuli.stock.service.impl;

import cn.javayuli.stock.entity.Stock;
import cn.javayuli.stock.mapper.StockMapper;
import cn.javayuli.stock.service.StockService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 库存服务
 *
 * @author hanguilin
 */
@Service
public class StockServiceImpl extends ServiceImpl<StockMapper, Stock> implements StockService {
}
