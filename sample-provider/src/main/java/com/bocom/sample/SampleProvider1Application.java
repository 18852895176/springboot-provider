package com.bocom.sample;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@DubboComponentScan("com.bocom.sample")
@SpringBootApplication
public class SampleProvider1Application {

	public static void main(String[] args) {
		SpringApplication.run(SampleProvider1Application.class, args);
	}

}
