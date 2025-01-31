package com.scope.singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
	
	@Bean
	@Scope(value="singleton")
	public HelloWorld getHellow() {
		return new HelloWorld();
	}

}
