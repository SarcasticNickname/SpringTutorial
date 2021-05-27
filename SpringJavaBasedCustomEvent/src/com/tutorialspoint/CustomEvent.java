package com.tutorialspoint;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEvent extends ApplicationEvent{

	public CustomEvent(Object source) {
		super(source);
	}
	
	@Override
	public String toString() {
		return "My Cystom Event";
	}
}
