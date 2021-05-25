package com.tutorialspoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class MainApp {
	ApplicationContext  ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
	HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
}
