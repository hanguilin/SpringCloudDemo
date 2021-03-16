package cn.javayuli.service;

/**
 * 创建订单业务方法
 *
 * @author hanguilin
 */
public interface BusinessService {

    /**
     * 下订单
     *
     * @param no 订单编号
     * @param goods 物资
     * @return
     */
    String createOrder(String no, String goods);
}
