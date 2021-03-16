package cn.javayuli.stock.controller;

import cn.javayuli.stock.entity.Stock;
import cn.javayuli.stock.service.StockService;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Wrapper;

/**
 * 库存接口
 *
 * @author hanguilin
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    private StockService orderService;

    /**
     * 扣减库存
     *
     * @param goods 物资
     * @param number 扣除量
     * @return
     */
    @GetMapping("/deduct")
    public String doDeductionStock(@RequestParam("goods") String goods, @RequestParam("number") int number) {
        Stock stock = orderService.getOne(Wrappers.lambdaQuery(Stock.class).eq(Stock::getGoods, goods));
        Integer stockNumber = stock.getNumber();
        Integer left = stockNumber - number;
        if (stockNumber == 0 || left < 0) {
            throw new RuntimeException("商品数量不足");
        }
        stock.setNumber(left);
        orderService.updateById(stock);
        return "success";
    }
}
