package com.aprilazure.springboot.springbootplayground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * will scan on the current package
 * needs to configure the component scan / import if needs to import other packages 
 */
@SpringBootApplication
public class SpringbootPlaygroundApplication {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringbootPlaygroundApplication.class, args);
		
//		for (String name : applicationContext.getBeanDefinitionNames()) {
//			System.out.println(name);
//		}
	}
	
}
