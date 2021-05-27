package com.tutorialspoint;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String [] args) {
		ConfigurableApplicationContext ctx = 
				new ClassPathXmlApplicationContext("Beans.xml");
		CustomEventPublisher ev = (CustomEventPublisher)ctx.getBean("customEventPublisher"); 
		ev.publish();
		ev.publish();
	}
}
