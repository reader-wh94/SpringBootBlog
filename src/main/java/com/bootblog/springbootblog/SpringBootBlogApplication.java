package com.bootblog.springbootblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.bootblog.springbootblog")
public class SpringBootBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBlogApplication.class, args);
    }

}
