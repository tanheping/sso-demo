/**
 * Copyright ( @AI ） All Rights Reserved.
 * AI
 */
package com.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 统一认证中心服务端 - 启动类
 *
 * @author AI
 */
@EnableTransactionManagement
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class})
public class AuthCenterAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthCenterAdminApplication.class, args);
	}
}
