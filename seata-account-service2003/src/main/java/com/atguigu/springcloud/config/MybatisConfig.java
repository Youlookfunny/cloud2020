package com.atguigu.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@MapperScan("com.atguigu.springcloud.dao")
@Configuration
public class MybatisConfig {
}
