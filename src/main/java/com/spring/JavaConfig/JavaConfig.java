package com.spring.JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //marks this class as spring Configuration
public class JavaConfig {
	@Bean //define a spring Bean
	public Students student()
	{//Creating Object and return Object
		return new Students(101,"Ankur Kumar");
	}

}
