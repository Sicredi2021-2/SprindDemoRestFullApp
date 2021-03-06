package br.pucrs.sicredi.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"br.pucrs.sicredi"})
public class SpringRestControllerFullAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestControllerFullAppApplication.class, args);
	}

}
