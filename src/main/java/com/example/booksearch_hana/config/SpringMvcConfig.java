package com.example.booksearching_hana.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
//等同于<context:component-scan base-package="com.itheima.controller"/>
@ComponentScan("com.example.booksearching_hana.controller")
//等同于<mvc:annotation-driven/>，还不完全相同
@EnableWebMvc
public class SpringMvcConfig {
}

