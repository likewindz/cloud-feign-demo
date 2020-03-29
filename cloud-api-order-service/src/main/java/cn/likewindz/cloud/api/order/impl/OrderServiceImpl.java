package cn.likewindz.cloud.api.order.impl;

import cn.likewindz.cloud.api.order.OrderApiService;
import cn.likewindz.cloud.api.order.entity.OrderEntity;
import cn.likewindz.cloud.api.order.feign.MemberFeignClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author likeWind
 * @date created in 21:59 2020/3/26
 * @description
 */
@RestController
public class OrderServiceImpl implements OrderApiService {

    @Resource
    private MemberFeignClient memberFeignClient;

    @Override
//    @HystrixCommand(fallbackMethod = "fallback",commandProperties = {
//            @HystrixProperty(name ="execution.isolation.thread.timeoutInMilliseconds",value = "3000")
//    })
    public OrderEntity get(String productName, Long userId) {
        OrderEntity orderEntity = new OrderEntity(UUID.randomUUID().toString(), userId, productName, memberFeignClient.discount(userId));
        return orderEntity;
    }
//    public OrderEntity fallback(String productName, Long userId){
//        System.out.println("服务降级");
//        return null;
//    }
}
