package com.yd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 *  config服务端启动入口
 *
 * @date      2018/7/23
 * @author    YD
 */
@SpringBootApplication
@EnableConfigServer
public class QbConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(QbConfigApplication.class, args);
	}
}
