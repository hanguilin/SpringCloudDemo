package cn.javayuli.service.impl;

import cn.javayuli.feign.RemoteOrderService;
import cn.javayuli.feign.RemoteStockService;
import cn.javayuli.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 创建订单业务方法
 *
 * @author hanguilin
 */
@Service
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    private RemoteOrderService remoteOrderService;

    @Autowired
    private RemoteStockService remoteStockService;

    /**
     * 下订单
     *
     * @param no 订单编号
     * @param goods 物资
     * @return
     */
    @Override
    public String createOrder(String no, String goods) {
        remoteOrderService.doSaveOrder(no);
        remoteStockService.doDeductionStock(goods, 1);
        return "success";
    }
}
