/**
 * @Author MY
 * @version: 1.0
 * @project: springBootDefaultTemplate
 * @description : Spring Template project.
 * 
 * @file: ServletInitializer.java
 * @Date : Jul 12, 2018:2018:6:14:42 PM
 * @Updates : Jul 12, 2018:2018:6:14:42 PM
 **/
package com.myApp;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

// TODO: Auto-generated Javadoc
/**
 * The Class ServletInitializer.
 */
public class ServletInitializer extends SpringBootServletInitializer {

	/*
	 * (non-Javadoc)
	 * @see org.springframework.boot.web.servlet.support.SpringBootServletInitializer#configure(org.
	 * springframework.boot.builder.SpringApplicationBuilder)
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ExpenseAppApplication.class);
	}

}
