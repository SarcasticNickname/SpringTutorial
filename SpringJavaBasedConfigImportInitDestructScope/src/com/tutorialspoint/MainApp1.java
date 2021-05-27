package com.tutorialspoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.web.socket.sockjs.client.AbstractXhrTransport;

public class MainApp1 {
	public static void main(String [] args) {
	ApplicationContext ctx = 
			new AnnotationConfigApplicationContext(CConfig.class);
	A a = ctx.getBean(A.class);
	B b = ctx.getBean(B.class);
	C c = ctx.getBean(C.class);
	System.out.println(a.toString() + " " + b.toString() + " " + c.toString());
	}
	
}
