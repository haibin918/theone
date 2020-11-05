package com.theone;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@MapperScan({"com.theone.*.mapper", "com.theone.biz.*.mapper"})
@ImportResource({"classpath:spring-dubbo.xml", "classpath:dubbo-consumer.xml", "classpath:dubbo-provider.xml", "classpath:spring-mcq.xml"})
public class TheoneMainApplication {

	public static void main(String[] args) {
		System.setProperty("java.specification.version", "1.8");
		SpringApplication.run(TheoneMainApplication.class, args);
	}

}
