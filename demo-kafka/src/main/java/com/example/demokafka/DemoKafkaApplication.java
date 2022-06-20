package com.example.demokafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DemoKafkaApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoKafkaApplication.class, args);
	}

}
