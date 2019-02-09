package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.lti.entity.BankAccount;

public class BankAccountRepository implements BankAccountRepoInterface {
	
	@PersistenceContext
     private EntityManager entityManager;

	public void add(BankAccount bankaccount) {
		entityManager.persist(bankaccount);
	}
	
	@Override
	public BankAccount fetch(int accountno) {
		return entityManager.find(BankAccount.class,accountno);
	}
	

}
