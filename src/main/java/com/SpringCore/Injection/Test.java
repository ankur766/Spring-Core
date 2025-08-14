package com.SpringCore.Injection;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Load Spring container (IoC)
		//ApplicationContext context= new ClassPathXmlApplicationContext("com/SpringCore/Injection/bean.xml");
		//Students stud=(Students) context.getBean("student");
		ApplicationContext context =new AnnotationConfigApplicationContext(Annotations.class);

	Students stud=(Students) context.getBean(Students.class);	
		System.out.println(stud);
	}

}
