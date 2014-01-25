package com.smiletech.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIOC {

	private String 			name;
	private int 			age;
	private float 			salary;
	private boolean 		isDeveloper;
	private String 			address;
	private String			city;
	private int				phone;
	
	public static void main(String [] args){
		ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
		SpringIOC simple = (SpringIOC)factory.getBean("injectIOC");
		System.out.println(simple);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public boolean isDeveloper() {
		return isDeveloper;
	}

	public void setIsDeveloper(boolean isDeveloper) {
		this.isDeveloper = isDeveloper;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Name 		: " + name +"\n"
			+  "Age  		: " + age  +"\n"
			+  "Salary		: "+ salary+"\n"
			+  "Is Developer	: "+ isDeveloper+"\n"
			+  "Address 	: " + address+"\n"
			+  "City 		: " + city+"\n"
			+ " Phone 		: "+ phone;
	}
}
