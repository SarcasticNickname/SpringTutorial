package com.tutorialspoint;

public class A {
	
	public void init() {
		System.out.println("Initializing A.");
	}
	
	public void destroy() {
		System.out.println("Destroying A");
	}
	
	@Override
	public String toString() {
		return "Class A";
	}
}
