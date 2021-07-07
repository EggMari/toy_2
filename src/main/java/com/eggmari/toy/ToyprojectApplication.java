package com.eggmari.toy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@ComponentScan({"com.eggmari.toy.configuration", "com.eggmari.toy.controller", "com.eggmari.toy.service"})
@SpringBootApplication(scanBasePackages = {"com.eggmari.toy.controller", "com.eggmari.toy.service", "com.eggmari.toy.configuration"})
@EnableJpaRepositories(basePackages = {"com.eggmari.toy.repository"})
public class ToyprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToyprojectApplication.class, args);
	}

}
