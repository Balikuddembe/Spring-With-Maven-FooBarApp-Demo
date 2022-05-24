package com.spring.maven.beans;

public class Bar {
	private int age;
	private String name;
	private Foo foo;
	
	public Bar() {
		super();
		
	}

	public Bar(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Foo getFoo() {
		return foo;
	}

	public void setFoo(Foo foo) {
		this.foo = foo;
	}

	@Override
	public String toString() {
		return "Bar [age=" + age + ", name=" + name + ", foo=" + foo + "]";
	}
}
