package cn.likewindz.cloud.api.member;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author likeWind
 * @date created in 21:49 2020/3/26
 * @description
 */
public interface MemberApiService {

    /**
     * 查看会员打几折
     * @param userId 用户id
     * @return 折数
     */
    @GetMapping("discount")
    Double discount(@RequestParam("userId") Long userId);

}
