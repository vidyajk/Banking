package com.lti.banking.repotesting;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.lti.bankingproject.BankingProjectApplication;
import com.lti.entity.BankAccount;
import com.lti.repository.BankAccountRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=BankingProjectApplication.class)
@Rollback(false)
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class BankAccountRepoTesting {
	
	    @Autowired
		private BankAccountRepository bankAccountRepository;
		
	    @Test
		@Transactional
		public void add() {
			BankAccount bankaccount = new BankAccount();
		    bankaccount.setTitle("Ms");
		    bankaccount.setFirstname("Vidya");
		    bankaccount.setMiddlename("Ashok");
		    bankaccount.setLastname("Kshirsagar");
		    bankaccount.setFathername("Ashok Kshirsagar");
		    bankaccount.setMobileno("9538294511");
		    bankaccount.setEmailid("kshirvidya@gmail.com");
		    bankaccount.setAadharno("555568996556");
	
		    bankAccountRepository.add(bankaccount);
		
		
	
	}

	

}
