package com.nw.se.webserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	private static final Logger logger= LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {

		logger.info("moi");
		logger.trace("moi");
		logger.debug("moi");
		logger.warn("moi");
		SpringApplication.run(Main.class, args);
	}

}
