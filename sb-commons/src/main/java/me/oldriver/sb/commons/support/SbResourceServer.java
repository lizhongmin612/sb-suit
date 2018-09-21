/**
 * $Id$
 * Copyright(C) 2015-2020 yingu - internet center, All Rights Reserved.
 */
package me.oldriver.sb.commons.support;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author <a href="mailto:lzm8285@163.com">Li Zhongmin</a>
 * @version 1.0 2018年09月21日 22:46:00
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties
public interface SbResourceServer {
}
