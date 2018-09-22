/**
 * $Id$
 * Copyright(C) 2015-2020 yingu - internet center, All Rights Reserved.
 */
package me.oldriver.sb.service.user.controller;

import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author <a href="mailto:lzm8285@163.com">Li Zhongmin</a>
 * @version 1.0 2018年09月21日 23:32:00
 */
@RestController
public class UserController {


	// inject the template as ListOperations
	@Resource(name="redisTemplate")
	private ValueOperations<String, String> valueOps;

	@GetMapping("/setUserName")
	public String setUserName(){
		valueOps.set("myname","james");
		String name = valueOps.get("myname");



		for(int i = 0;i<100;i++) {
			valueOps.set("test_"+i,"james_"+i);
		}
		return name;
	}
}
