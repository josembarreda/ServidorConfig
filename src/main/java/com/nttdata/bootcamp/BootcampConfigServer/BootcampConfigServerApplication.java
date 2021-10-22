package com.nttdata.bootcamp.BootcampConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class BootcampConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootcampConfigServerApplication.class, args);
	}

}
