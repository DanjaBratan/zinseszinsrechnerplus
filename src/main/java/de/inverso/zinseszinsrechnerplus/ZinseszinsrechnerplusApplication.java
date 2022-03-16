package de.inverso.zinseszinsrechnerplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("de.inverso.zineszinsrechnerplus") //zusätzlicher Scan
public class ZinseszinsrechnerplusApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZinseszinsrechnerplusApplication.class, args);
	}

}
