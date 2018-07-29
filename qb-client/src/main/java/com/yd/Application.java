package com.yd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *  客服端启动入口
 *
 * @date      2018/7/23
 * @author    YD
 */
@SpringBootApplication
// @MapperScan(basePackages = "com.yd.dao")
// @EnableCaching
@EnableEurekaClient
//@EnableDiscoveryClient
public class Application {



	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}



}
