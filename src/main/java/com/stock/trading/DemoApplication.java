package com.stock.trading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class })
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
//	@Bean//(name=“entityManagerFactory”)
//	public LocalSessionFactoryBean sessionFactory() {
//	LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//	return sessionFactory;
//	}

}

// top 10 best and worst performing stocks for today
// stock chart for 1D, 1M, 1Y
// get stock current market price(if possible)
// Save the Buyed stocks in holding 
