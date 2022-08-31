package com.SpringRest.SpringRest;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApplication.class, args);
		//ApplicationContext context=new ClassPathXmlApplicationContext("pom.xml");
	}

}
