package com.tutorialspoint;

public class B {
	
	public void init() {
		System.out.println("Initializing B.");
	}
	
	public void destroy() {
		System.out.println("Destroying B");
	}
	
	@Override
	public String toString() {
		return "Class B";
	}
}
