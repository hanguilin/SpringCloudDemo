package cn.javayuli.feign.impl;

import cn.javayuli.feign.RemoteOrderService;
import org.springframework.stereotype.Component;

/**
 * 熔断降级
 *
 * @author hanguilin
 */
@Component
public class RemoteOrderServiceImpl implements RemoteOrderService {

    /**
     * 抛出异常
     */
    private Throwable cause;

    public Throwable getCause() {
        return cause;
    }

    public void setCause(Throwable cause) {
        this.cause = cause;
    }

    @Override
    public String doSaveOrder(String no) {
        throw new RuntimeException("调用订单服务失败");
    }
}
