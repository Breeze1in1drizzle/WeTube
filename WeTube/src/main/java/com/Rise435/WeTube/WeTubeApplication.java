package com.Rise435.WeTube;

import javax.servlet.MultipartConfigElement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;

@SpringBootApplication
@Configuration
@MapperScan("com.Rise435.WeTube.mappers")
public class WeTubeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeTubeApplication.class, args);
	}

	@Bean
	public MultipartConfigElement multipartConfigration() {
		MultipartConfigFactory mcf
			= new MultipartConfigFactory();
		DataSize maxFileSize = DataSize.ofBytes(100 * 1024 * 1024);
		DataSize maxRequestSize = DataSize.ofBytes(100 * 1024 * 1024);
		mcf.setMaxFileSize(maxFileSize);
		mcf.setMaxRequestSize(maxRequestSize);
		MultipartConfigElement mce
			= mcf.createMultipartConfig();
		return mce;
	}
	
	
}
