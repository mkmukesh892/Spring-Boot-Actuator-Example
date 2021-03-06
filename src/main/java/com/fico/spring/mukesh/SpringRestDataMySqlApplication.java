package com.fico.spring.mukesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fico.spring.mukesh.model.Customer;
import com.fico.spring.mukesh.repository.CustomerRepository;

@SpringBootApplication
public class SpringRestDataMySqlApplication implements CommandLineRunner {

	@Autowired
	CustomerRepository customerRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringRestDataMySqlApplication.class, args);
	}
	@Override
	public void run(String... args)  {
		customerRepository.save(new Customer("Jack", "Smith"));
		customerRepository.save(new Customer("Adam", "Johnson"));
		customerRepository.save(new Customer("Kim", "Smith"));
		customerRepository.save(new Customer("David", "Williams"));
		customerRepository.save(new Customer("Peter", "Davis"));
	}
}
