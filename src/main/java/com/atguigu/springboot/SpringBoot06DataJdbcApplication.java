package com.atguigu.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
public class SpringBoot06DataJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot06DataJdbcApplication.class, args);
    }

}

