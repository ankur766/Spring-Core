package com.spring.JavaConfig;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//loging  Spring context from java config class
		//Javaconfing   use  AnnotationConfigApplicationContext
		ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class);
		//get bean from context
		Students stud=(Students) context.getBean(Students.class);
		System.out.println(stud);
	}

}
