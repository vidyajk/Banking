package com.lti.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.BankAccount;
import com.lti.repository.BankAccountRepoInterface;
import com.lti.repository.BankAccountRepository;

@Service
public class BankAccountService {
	
	   @Autowired
		private BankAccountRepository bankAccountRepository;

		@Transactional
		public void add(BankAccount bankaccount) {
			bankAccountRepository.add(bankaccount);
		}
		
		public BankAccount fetch(int accountno)
		{
			return bankAccountRepository.fetch(accountno);
		
		}
}
