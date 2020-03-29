package cn.likewindz.cloud.api.member.impl;

import cn.likewindz.cloud.api.member.MemberApiService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author likeWind
 * @date created in 21:54 2020/3/26
 * @description
 */
@RestController
public class MemberServiceImpl implements MemberApiService {


    @Override
    @HystrixCommand(fallbackMethod = "fallback")
    public Double discount(Long userId) {
        System.out.println(String.format("查看会员%d 的打折情况",userId));
        return new Random().nextDouble();
    }
    public Double fallback(Long userId) {
        System.out.println("执行fallback");
        return 0d;
    }

}
