package com.DbJpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.DbJpa.repo.AccountRepo;
import com.DbJpa.service.AccountService;

@SpringBootApplication
public class EmbededTablesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(EmbededTablesApplication.class, args);
		AccountService repo=context.getBean(AccountService.class);
		repo.saveData();
		repo.getDataUsingPK();
	}

}
