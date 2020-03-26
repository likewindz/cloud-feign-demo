package cn.likewindz.cloud.api.order.feign;

import cn.likewindz.cloud.api.member.MemberApiService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author likeWind
 * @date created in 22:05 2020/3/26
 * @description
 */
@FeignClient(value = "cloud-api-member")
public interface MemberFeignClient extends MemberApiService {
}
