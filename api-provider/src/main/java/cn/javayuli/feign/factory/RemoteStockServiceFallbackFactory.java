package cn.javayuli.feign.factory;

import cn.javayuli.feign.RemoteStockService;
import cn.javayuli.feign.impl.RemoteStockServiceImpl;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;


/**
 * factory
 *
 * @author hanguilin
 */
@Component
public class RemoteStockServiceFallbackFactory implements FallbackFactory<RemoteStockService> {

    @Override
    public RemoteStockService create(Throwable throwable) {
        RemoteStockServiceImpl remoteStockService = new RemoteStockServiceImpl();
        remoteStockService.setCause(throwable);
        return remoteStockService;
    }
}
