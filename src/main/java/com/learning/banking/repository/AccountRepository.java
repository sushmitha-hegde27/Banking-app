package com.learning.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.banking.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{
	
	

}
