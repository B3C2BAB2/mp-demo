package com.b3c2bab2.mpdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.b3c2bab2.mpdemo.mapper")
public class MpDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(MpDemoApplication.class, args);
	}
}
