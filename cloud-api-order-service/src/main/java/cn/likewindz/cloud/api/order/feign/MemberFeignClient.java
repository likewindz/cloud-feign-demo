package cn.likewindz.cloud.api.order.feign;

import cn.likewindz.cloud.api.member.MemberApiService;
import cn.likewindz.cloud.api.order.hystrix.MemberHystrix;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author likeWind
 * @date created in 22:05 2020/3/26
 * @description
 */
@FeignClient(value = "cloud-api-member",fallback = MemberHystrix.class)
public interface MemberFeignClient extends MemberApiService {
}
