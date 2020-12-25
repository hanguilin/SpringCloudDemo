package cn.javayuli.feign.factory;

import cn.javayuli.feign.RemoteOrderService;
import cn.javayuli.feign.RemoteStockService;
import cn.javayuli.feign.impl.RemoteOrderServiceImpl;
import cn.javayuli.feign.impl.RemoteStockServiceImpl;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;


/**
 * factory
 *
 * @author hanguilin
 */
@Component
public class RemoteOrderServiceFallbackFactory implements FallbackFactory<RemoteOrderService> {

    @Override
    public RemoteOrderService create(Throwable throwable) {
        RemoteOrderServiceImpl remoteOrderService = new RemoteOrderServiceImpl();
        remoteOrderService.setCause(throwable);
        return remoteOrderService;
    }
}
