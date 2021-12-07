package com.zhaodan.blog.api.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: zhaodan
 * @create: 2021-12-14:05
 **/
@Configuration
@EnableTransactionManagement
@MapperScan("com.zhaodan.myblog.mapper")
public class MybatisPlusConfig {
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }
}
