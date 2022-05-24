package com.spring.maven;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.maven.beans.Bar;
import com.spring.maven.beans.Foo;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		context.start();
		Foo f = context.getBean("foo",Foo.class);
		System.out.println(f);
		
		Bar b = context.getBean("bar",Bar.class);
		System.out.println(b);
		
		context.stop();
		context.close();

	}

}
