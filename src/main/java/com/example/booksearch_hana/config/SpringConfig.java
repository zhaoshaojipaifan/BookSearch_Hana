package com.example.booksearching_hana.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({MyBatisConfig.class, JdbcConfig.class})
@ComponentScan(value = "com.example.booksearching_hana.service")
public class SpringConfig {
}

