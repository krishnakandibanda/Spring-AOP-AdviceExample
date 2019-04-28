package com.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.component.ProductService;
import com.app.config.AppConfig;

public class Test {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ProductService ps =context.getBean(ProductService.class);
		
		ps.getProductInfo();
		
		//context.close();
		
		
	}
}
