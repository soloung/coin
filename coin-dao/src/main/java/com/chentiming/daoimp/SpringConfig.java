package com.chentiming.daoimp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "com.timevale.billingsystem")
@ImportResource("classpath:database/datasource.xml")
public class SpringConfig {

}
