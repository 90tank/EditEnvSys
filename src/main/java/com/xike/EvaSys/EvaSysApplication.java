package com.xike.EvaSys;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EvaSysApplication {
	private static Logger log = LoggerFactory.getLogger(EvaSysApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(EvaSysApplication.class, args);
		log.info("Evaluation System RUn !!");
	}

}

