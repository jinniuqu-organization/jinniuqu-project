package com.kxj.bigscreen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kxj.bigscreen.dao")
public class BigscreenApplication {

    public static void main(String[] args) {
        SpringApplication.run(BigscreenApplication.class, args);
    }

}
