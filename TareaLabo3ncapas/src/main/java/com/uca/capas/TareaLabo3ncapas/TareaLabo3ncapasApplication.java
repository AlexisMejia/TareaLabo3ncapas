package com.uca.capas.TareaLabo3ncapas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages=("com.uca.capas.controller"))
@ComponentScan(basePackages=("com.uca.capas..domain"))
public class TareaLabo3ncapasApplication {

	public static void main(String[] args) {
		SpringApplication.run(TareaLabo3ncapasApplication.class, args);
	}

}
