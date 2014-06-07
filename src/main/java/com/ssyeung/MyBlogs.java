package com.ssyeung;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring03.spring03a.App;

import com.ssyeung.sequence.SequenceGenerator;

public class MyBlogs {

	private void testLoad() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
		App generator = (App) context.getBean("sequenceGenerator"); 
	}
	
	public static void main(String[] args) {
        ApplicationContext context =  
                new ClassPathXmlApplicationContext("spring-3m.xml"); 
     
            SequenceGenerator generator = 
                (SequenceGenerator) context.getBean("sequenceGenerator"); 
     
            System.out.println(generator.getSequence()); 
            System.out.println(generator.getSequence()); 		
	} 
	
}
