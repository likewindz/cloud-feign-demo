package cn.likewindz.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author likeWind
 * @date created in 17:46 2020/3/29
 * @description
 */
@RestController
@RefreshScope
public class ConfigReadController {

    @Value("${user.name}")
    private String userName;

    @GetMapping("getUserName")
    public String getUserName(){
        System.out.println(this);
        return this.userName;
    }

}
