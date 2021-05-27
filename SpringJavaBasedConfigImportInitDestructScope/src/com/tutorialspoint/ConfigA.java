package com.tutorialspoint;
import org.springframework.context.annotation.*;

@Configuration
@Scope("prototype")
public class ConfigA {
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public A a() {
		return new A();
	}
}
