package cn.javayuli.feign.impl;

import cn.javayuli.feign.RemoteStockService;
import org.springframework.stereotype.Component;

/**
 * 熔断降级
 *
 * @author hanguilin
 */
@Component
public class RemoteStockServiceImpl implements RemoteStockService {

    /**
     * 抛出异常
     */
    private Throwable cause;

    @Override
    public String doDeductionStock(String goods, int number) {
        throw new RuntimeException("调用库存服务失败");
    }

    public Throwable getCause() {
        return cause;
    }

    public void setCause(Throwable cause) {
        this.cause = cause;
    }
}
