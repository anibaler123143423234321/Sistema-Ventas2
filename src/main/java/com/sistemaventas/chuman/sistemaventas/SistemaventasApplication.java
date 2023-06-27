package com.sistemaventas.chuman.sistemaventas;

import com.sistemaventas.chuman.sistemaventas.config.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({FileStorageProperties.class})
public class SistemaventasApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaventasApplication.class, args);
	}
}
