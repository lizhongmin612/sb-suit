/**
 * $Id$
 * Copyright(C) 2015-2020 yingu - internet center, All Rights Reserved.
 */
package me.oldriver.sb.service.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisSentinelConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

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

	/**
	 * Lettuce
	 */
	@Bean
	public RedisConnectionFactory lettuceConnectionFactory() {
		System.out.println("加载lettuce");
		RedisSentinelConfiguration sentinelConfig = new RedisSentinelConfiguration()
				.master("mymaster")
				.sentinel("192.168.2.107", 36379)
				.sentinel("192.168.2.107", 36380)
				.sentinel("192.168.2.107", 36381);
		return new LettuceConnectionFactory(sentinelConfig);
	}

	@Bean
	public RedisTemplate redisTemplate(){
		RedisTemplate redisTemplate = new RedisTemplate();
		redisTemplate.setConnectionFactory(lettuceConnectionFactory());
		return redisTemplate;
	}
}
