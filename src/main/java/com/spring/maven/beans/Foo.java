package com.spring.maven.beans;

public class Foo {
	private String name;

	public Foo() {
		super();
		
	}

	public Foo(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Foo [name=" + name + "]";
	}
}
