package cn.javayuli.feign;

import cn.javayuli.feign.factory.RemoteOrderServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 远程调用库存服务
 *
 * @author hanguilin
 */
@FeignClient(contextId = "remoteOrderService", value = "api-provider-order",
        fallbackFactory = RemoteOrderServiceFallbackFactory.class)
public interface RemoteOrderService {

    /**
     * 创建订单
     *
     * @param no 订单编号
     * @return
     */
    @PostMapping("/order/save")
    String doSaveOrder (@RequestParam("no") String no);
}
