package com.training.S2_SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class S2SpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(S2SpringBootApplication.class, args);

		Coach coach = context.getBean("cricketCoach", Coach.class);
		Coach coach1 = context.getBean("cricketCoach", Coach.class);
		System.out.println(coach.hashCode());
		System.out.println(coach1.hashCode());

		Animal animal = context.getBean("hello", Animal.class);
		System.out.println(animal.Sound());


	}

}
