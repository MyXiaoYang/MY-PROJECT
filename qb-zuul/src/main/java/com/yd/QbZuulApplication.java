package com.yd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  网关启动入口
 *
 * @date      2018/7/23
 * @author    YD
 */
@SpringBootApplication
@EnableZuulProxy
public class QbZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(QbZuulApplication.class, args);
	}

}
