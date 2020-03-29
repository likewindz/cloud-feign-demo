package cn.likewindz.cloud.api.order.hystrix;

import cn.likewindz.cloud.api.order.feign.MemberFeignClient;
import org.springframework.stereotype.Component;

/**
 * @author likeWind
 * @date created in 18:40 2020/3/28
 * @description
 */
@Component
public class MemberHystrix implements MemberFeignClient {
    @Override
    public Double discount(Long userId) {
        System.out.println("降级了奥");
        return 0d;
    }
}
