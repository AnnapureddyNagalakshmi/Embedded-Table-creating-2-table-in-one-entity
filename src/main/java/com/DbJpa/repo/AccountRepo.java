package com.DbJpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DbJpa.entity.Account;
import com.DbJpa.entity.AccountPK;

public interface AccountRepo extends JpaRepository<Account, AccountPK>{

}
