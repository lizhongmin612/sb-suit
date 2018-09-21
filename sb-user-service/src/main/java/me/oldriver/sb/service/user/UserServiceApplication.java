/**
 * $Id$
 * Copyright(C) 2015-2020 yingu - internet center, All Rights Reserved.
 */
package me.oldriver.sb.service.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author <a href="mailto:lzm8285@163.com">Li Zhongmin</a>
 * @version 1.0 2018年09月21日 22:40:00
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceApplication {

	public static void main(String[] args) {
		System.out.println("启动");
		SpringApplication.run(UserServiceApplication.class, args);
	}
}
