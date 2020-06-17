package com.liaowh.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

    @Value("${spring.application.name}")
    private String name;

    @RequestMapping("/config")
    public String getConfig(){
        return name;
    }
}
