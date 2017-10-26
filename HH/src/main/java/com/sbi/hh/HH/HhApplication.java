package com.sbi.hh.HH;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories({"com.sbi.hh.dao"})
@ComponentScan({"com.sbi.hh.controller","com.sbi.hh.service"})
@EntityScan({"com.sbi.hh.Entity"})
public class HhApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(HhApplication.class, args);
	}
}
