package cn.likewindz.cloud.config.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author likeWind
 * @date created in 19:48 2020/3/29
 * @description
 */
@RestController("test")
public class TestController {

    @GetMapping
    public String get(){
        return this.toString();
    }

}
