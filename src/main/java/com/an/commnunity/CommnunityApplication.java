package com.an.commnunity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CommnunityApplication {
	public static void main(String[] args) {
		SpringApplication.run(CommnunityApplication.class, args);
	}

}
