package com.bocom.sample.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import com.bocom.sample.service.IHelloService;

@Service
public class HelloServiceImpl implements IHelloService{
    Logger log=LoggerFactory.getLogger(HelloServiceImpl.class);
    
    @Value("${dubbo.application.name}")
    private String serviceName;
	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		log.info("-------------{}服务开始------------------",serviceName);
		return String.format("[%s]:Hello,%s", serviceName,name);
	}

}
