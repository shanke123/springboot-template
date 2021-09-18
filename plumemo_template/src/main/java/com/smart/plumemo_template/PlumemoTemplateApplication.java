package com.smart.plumemo_template;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan({"com.smart.plumemo_template.demo.mybatisplusindex.dao","com.smart.plumemo_template.plumemo.*.dao"})
@SpringBootApplication
public class PlumemoTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlumemoTemplateApplication.class, args);
    }

}
