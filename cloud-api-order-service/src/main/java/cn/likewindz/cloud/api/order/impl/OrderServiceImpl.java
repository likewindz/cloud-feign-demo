package cn.likewindz.cloud.api.order.impl;

import cn.likewindz.cloud.api.order.OrderApiService;
import cn.likewindz.cloud.api.order.entity.OrderEntity;
import cn.likewindz.cloud.api.order.feign.MemberFeignClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author likeWind
 * @date created in 21:59 2020/3/26
 * @description
 */
@RestController
public class OrderServiceImpl implements OrderApiService {

    @Autowired
    private MemberFeignClient memberFeignClient;

    @Override
    @HystrixCommand(fallbackMethod = "fallback")
    public OrderEntity get(String productName, Long userId) {
        OrderEntity orderEntity = new OrderEntity(UUID.randomUUID().toString(), userId, productName, memberFeignClient.discount(userId));
        return orderEntity;
    }

//    // 返回类型和方法签名必须和 get 中的一致
//    public OrderEntity fallback(String productName,Long userId){
//        System.out.println("购买失败，会员服务正在维护中");
//        return null;
//    }
}
