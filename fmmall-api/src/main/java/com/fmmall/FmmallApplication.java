package com.fmmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: hexiang
 * @date: 2022/5/7
 * @description: fmmall 项目启动类
 */
@MapperScan("com.fmmall.mapper")
@SpringBootApplication
public class FmmallApplication {
    public static void main(String[] args) {
        SpringApplication.run(FmmallApplication.class, args);
    }
}
