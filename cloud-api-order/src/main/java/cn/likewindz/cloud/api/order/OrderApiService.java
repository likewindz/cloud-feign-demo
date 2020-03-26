package cn.likewindz.cloud.api.order;

import cn.likewindz.cloud.api.order.entity.OrderEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author likeWind
 * @date created in 21:34 2020/3/26
 * @description
 */
public interface OrderApiService {

    /**
     * 传入商品名和userId 通过userId判断会员等级 确认打折情况
     */
    @GetMapping("getOrder")
    OrderEntity get(@RequestParam("productName") String productName,@RequestParam("userId") Long userId);

}
