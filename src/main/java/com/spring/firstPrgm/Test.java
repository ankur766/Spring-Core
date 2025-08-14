package com.spring.firstPrgm;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/firstPrgm/bean.xml");
		HelloWorld hello=(HelloWorld) context.getBean("helloWorld");
		System.out.println(hello.getMessage());
	}

}
