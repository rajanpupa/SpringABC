package com.kogent;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloClient {

	public static void main(String[] args) throws Exception {
		try {
			System.out.println("Stage 1. Create a resource with a beans definition xml(hello.xml)");
			Resource res = new ClassPathResource("hello.xml");
			
			//checking the file existence
			if(res.exists()){
				System.out.println("file exists.");
			}else{
				System.out.println("file not exists.");
				System.exit(5);
			}
			
			System.out.println("Stage 2. Create bean factory with the classpath resource");
			BeanFactory factory = new XmlBeanFactory(res);
			
			System.out.println("Stage 3. Get the dependent bean");
			Hello bean1 = (Hello) factory.getBean("hello");
			String s = bean1.sayHello(args[0]);
			
			System.out.println(s);
		} catch (Exception el) {
			System.out.println("" + el);
		}
	}
}
