package cn.likewindz.cloud.api.order.impl;

import cn.likewindz.cloud.api.order.OrderApiService;
import cn.likewindz.cloud.api.order.entity.OrderEntity;
import cn.likewindz.cloud.api.order.feign.MemberFeignClient;
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
    public OrderEntity get(String productName, Long userId) {
        OrderEntity orderEntity = new OrderEntity(UUID.randomUUID().toString(), userId, productName, memberFeignClient.discount(userId));
        return orderEntity;
    }
}
