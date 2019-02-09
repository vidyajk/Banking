package com.lti.repository;

import com.lti.entity.BankAccount;

public interface BankAccountRepoInterface {

	void add(BankAccount bankaccount);

	BankAccount fetch(int accountno);

}