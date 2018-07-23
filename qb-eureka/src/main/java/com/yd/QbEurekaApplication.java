package com.yd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *  eureka服务端启动入口
 *
 * @date      2018/7/23
 * @author    YD
 */
@SpringBootApplication
@EnableEurekaServer
public class QbEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(QbEurekaApplication.class, args);
	}
}
