package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*
  * @Description: TODO
  * @author: lxl
  * @date:
  */
@SpringBootApplication
@EnableEurekaServer
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
