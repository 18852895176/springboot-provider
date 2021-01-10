package com.bocom.sample;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bocom.sample.service.IHelloService;

@SpringBootApplication
public class SpringbootConsumerApplication {
	@SuppressWarnings("deprecation")
	@Reference(url = "dubbo://192.168.136.1:20880/com.bocom.sample.service.IHelloService")
	private IHelloService helloService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootConsumerApplication.class, args);
	}

	@Bean
	public ApplicationRunner runner(){
		return args -> System.out.println(helloService.sayHello("Mic"));
	}
}
