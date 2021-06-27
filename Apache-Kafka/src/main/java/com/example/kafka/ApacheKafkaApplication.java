package com.example.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
@ComponentScan(basePackages  = {"com.example.controller","com.example.producer","com.example.consumer"})
public class ApacheKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApacheKafkaApplication.class, args);
	}

}
