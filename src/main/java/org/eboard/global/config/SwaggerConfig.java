package org.eboard.global.config;

import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket api() {
		return null;
	}
	
	private Set<String> getConsumeContentTypes() {
		return null;
	}
	
	private Set<String> getProduceContentTypes() {
		return null;
	}
	
	private ApiInfo getApiInfo() {
		return null;
	}
}
