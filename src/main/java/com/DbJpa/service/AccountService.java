package com.DbJpa.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.DbJpa.entity.Account;
import com.DbJpa.entity.AccountPK;
import com.DbJpa.repo.AccountRepo;

@Service
public class AccountService {
	
	private AccountRepo accRepo;
	public AccountService(AccountRepo accRepo) {	//Injected repository using service constructor
		this.accRepo=accRepo;
	}
	public void saveData() {
		AccountPK pk=new AccountPK();
		pk.setAccId(104);
		pk.setAccType("Savings");
		pk.setHolderName("TCS");
		
		Account a=new Account();
		a.setBranchName("Ammerpet");
		a.setMinBal(5000.00);
		a.setAccPk(pk);
		accRepo.save(a);
	}
		public void getDataUsingPK() {
		AccountPK pk=new AccountPK();
		pk.setAccId(101);
		pk.setAccType("Current");
		pk.setHolderName("WIPRO");
		Optional<Account> findById=accRepo.findById(pk);
		if(findById.isPresent()) {
			System.out.println(findById.get());
		}
		}
	
	}

