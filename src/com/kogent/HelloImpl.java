package com.kogent;

public class HelloImpl implements Hello{

	private String greeting;
	
	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public HelloImpl(){}
	
	public HelloImpl(String a){
		greeting =a ;
	}
	
	public String sayHello(String s) {
		return greeting + s;
	}

}
