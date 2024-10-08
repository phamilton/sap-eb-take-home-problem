package com.sap.sap_eb_take_home_problem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = {"com.sap.sap_eb_take_home_problem.*"})
public class SapEbTakeHomeProblemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SapEbTakeHomeProblemApplication.class, args);
	}

}
