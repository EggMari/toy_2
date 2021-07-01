package com.eggmari.toy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = {"com.eggmari.toy.controller"})
@SpringBootApplication(scanBasePackages="com.eggmari.toy.controller")
public class ToyprojectApplication {

	public static void main(String[] args) {

		SpringApplication.run(ToyprojectApplication.class, args);
	}

}
