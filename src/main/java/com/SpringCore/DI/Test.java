package com.SpringCore.DI;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Load Spring container (IoC)
		//ApplicationContext context= new ClassPathXmlApplicationContext("com/SpringCore/DI/bean.xml");
	ApplicationContext context =new AnnotationConfigApplicationContext(JavaConfig.class);
		//Students stud=(Students) context.getBean("student");
	Students stud=(Students) context.getBean(Students.class);	
		System.out.println(stud);
	}

}
