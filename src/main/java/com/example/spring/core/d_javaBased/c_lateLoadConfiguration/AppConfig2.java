package com.example.spring.core.d_javaBased.c_lateLoadConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig2 {
	@Bean
	public Student studFactory() {
		return new Student();
	}
}
