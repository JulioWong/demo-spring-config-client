package com.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class DemoSpringConfigClientApplication implements CommandLineRunner {

	
	private static final Logger log = LoggerFactory.getLogger(DemoSpringConfigClientApplication.class);
	
	@Autowired
    private Environment env;

	
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringConfigClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/*for (String string : env.getActiveProfiles()) {
			log.info("AQUIIIIQ {}", string);
		}*/
	}

}
