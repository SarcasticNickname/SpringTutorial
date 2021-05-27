package com.tutorialspoint;
import org.springframework.context.annotation.*;

@Configuration
@Import({ConfigA.class,ConfigB.class})
@Scope("prototype")
public class CConfig {
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public C c() {
		return new C();
	}
}
