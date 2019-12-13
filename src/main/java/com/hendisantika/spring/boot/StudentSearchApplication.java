package com.hendisantika.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentSearchApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(StudentSearchApplication.class, args);
	}

	/**
	 * It is generally considered best practice to put exposed beans in
	 * configuration classes, which are logically grouped.
	 * 
	 * For example, you might have several configuration classes with a number
	 * of beans contained within each. Here we create the bean in Main class
	 * just for simplicity
	 */

}
