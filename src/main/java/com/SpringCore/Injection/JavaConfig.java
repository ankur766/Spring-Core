package com.SpringCore.Injection;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public Address address()
	{
		
		Address add= new Address();
		add.setStreet("501B");
		add.setCity("patna");
		add.setState("Bihar");
		return add;
	}
	
	
	@Bean
	public Students students ()
	{	
		Students st= new Students();
		st.setId(101);
		st.setName("Ankur Kumar");
		st.setAddress(address());
		return st;
		
	        
	        
	}
	

}
