package cn.javayuli.feign;

import cn.javayuli.feign.factory.RemoteStockServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 远程调用库存服务
 *
 * @author hanguilin
 */
@FeignClient(contextId = "remoteStockService", value = "api-provider-stock",
        fallbackFactory = RemoteStockServiceFallbackFactory.class)
public interface RemoteStockService {

    /**
     * 扣减库存
     *
     * @param goods 物资
     * @param number 扣除量
     * @return
     */
    @GetMapping("/stock/deduct")
    String doDeductionStock(@RequestParam("goods") String goods, @RequestParam("number") int number);
}
