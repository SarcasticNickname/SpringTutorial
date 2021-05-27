package com.tutorialspoint;
import org.springframework.context.annotation.*;

@Configuration
@Scope("prototype")
public class ConfigB {
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public B b() {
		return new B();
	}
}
