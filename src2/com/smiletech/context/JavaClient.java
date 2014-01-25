package com.smiletech.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kogent.Hello;

public class JavaClient {

	public static void main(String[] args) throws Exception {
		try{
			ApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
			
			Hello bean1 = (Hello)context.getBean("hello");
			
			System.out.println(bean1.sayHello(args[0]));
			
		} catch (Exception el) {
			System.out.println("" + el);
		}
	}
}