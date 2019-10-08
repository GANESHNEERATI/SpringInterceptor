package com.telusko.demo;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		registry.addInterceptor(new AdminInterceptor())//
		.addPathPatterns("/admin/*")//
		  .excludePathPatterns("/admin/oldLogin");
		
		registry.addInterceptor(new LogInterceptor());
		
		registry.addInterceptor(new OldLoginInterceptor()).addPathPatterns("/admin/oldLogin");
		
		
		//super.addInterceptors(registry);
	}
	

}
