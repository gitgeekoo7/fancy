package com.idea.fancy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.idea.fancy.dao")
public class FancyApplication{

	public static void main(String[] args) {
		SpringApplication.run(FancyApplication.class, args);
	}
	
	

}
