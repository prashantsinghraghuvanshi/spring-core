package dev.prashant.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "dev.prashant.pojo")
@PropertySource("classpath:application.properties")         // to read application.properties file
public class MyConfiguration {

}
