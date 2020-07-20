package com.liaowh.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan({"com.liaowh.springcloud.dao"})
public class MyBatisConfig {
}
