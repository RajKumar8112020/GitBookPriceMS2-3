package com.coursecube.bookprice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartMyBookPriceMS implements CommandLineRunner{
	
	static Logger log=LoggerFactory.getLogger(StartMyBookPriceMS.class);
	
	public static void main(String args[]) {
		log.info("BookPriceMS - Begin");
		SpringApplication.run(StartMyBookPriceMS.class, args);
		log.info("BookPriceMS - End");
	}

	@Override
	public void run(String... args) throws Exception {
		// Start-UP Tasks
		log.info("BookPriceMS - Launched");
		
	}

}
