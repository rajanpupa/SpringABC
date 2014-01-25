package com.smiletech.autowire;

public class Foo {
	private String name;
	
	public Foo(){}
	
	public Foo(String str){
		name=str;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
