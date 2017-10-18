package com.rico.springboot.jwt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.rico.springboot.jwt")
public class JwtApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(JwtApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JwtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("rico-springboot-jwt服务已成功启动");
	}
}
