package br.com.andre.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.andre")
public class ProjetoSpringBootAndreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoSpringBootAndreApplication.class, args);
	}

}
