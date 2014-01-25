package com.smiletech.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smiletech.ioc.SpringIOC;

public class ThisBean {
	private Foo foo1;
	
	public Foo getFoo(){
		return foo1;
	}
	
	public void setFoo(Foo foo){
		this.foo1 = foo;
	}
	
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("autowirebean.xml");
		ThisBean simple = (ThisBean)factory.getBean("byType");
		System.out.println(simple.getFoo().getName());
	}
	
	public static void main2(){
		ApplicationContext factory = new ClassPathXmlApplicationContext("autowirebean.xml");
		Foo simple = (Foo)factory.getBean("foo1");
		System.out.println(simple.getName());
	}
}
