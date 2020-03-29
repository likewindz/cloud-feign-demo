package cn.likewindz.cloud.api.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author likeWind
 * @date created in 22:13 2020/3/26
 * @description
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class MemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class,args);
    }

}
