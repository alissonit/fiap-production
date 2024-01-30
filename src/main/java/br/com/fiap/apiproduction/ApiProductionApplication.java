package br.com.fiap.apiproduction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiProductionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiProductionApplication.class, args);
	}

}
