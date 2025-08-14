package com.SpringCore.DI;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	//using Setter
//	@Bean
//	public Students students()
//	{
//		 Students s = new Students();
//	        s.setId(101);
//	        s.setName("Ankur");
//	        return s;
//	}
	//using constructor
	@Bean
	public Students students ()
	{
		 return new Students(101,"Ankur Kumar");
	
	        
	        
	}
	

}
