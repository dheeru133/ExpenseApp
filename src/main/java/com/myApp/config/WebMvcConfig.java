/**
 * @Author MY
 * @version: 1.0
 * @project: springBootDefaultTemplate
 * @description : Spring Template project.
 *
 * @file: WebMvcConfig.java
 * @Date : Jul 12, 2018:2018:6:06:39 PM
 * @Updates : Jul 12, 2018:2018:6:06:39 PM
 **/
package com.myApp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

}
