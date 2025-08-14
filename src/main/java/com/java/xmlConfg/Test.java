package com.java.xmlConfg;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/java/xmlConfg/bean.xml");
		Students stud=(Students) context.getBean("student");
		System.out.println(stud);
	}

}
