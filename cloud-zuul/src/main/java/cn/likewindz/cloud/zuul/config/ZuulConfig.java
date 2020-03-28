package cn.likewindz.cloud.zuul.config;

import cn.likewindz.cloud.zuul.filter.TokenFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author likeWind
 * @date created in 15:14 2020/3/28
 * @description
 */
@Configuration
public class ZuulConfig {

    @Bean
    public TokenFilter tokenFilter(){
        return new TokenFilter();
    }

}
