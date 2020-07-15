package com.wxf.sc.clientdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MyClientdemo {
    public static void main(String[] args) {
        System.out.println("客户端启动");
        SpringApplication.run(MyClientdemo.class,args);
    }
}
