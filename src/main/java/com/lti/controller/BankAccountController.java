package com.lti.controller;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.BankAccount;
import com.lti.service.BankAccountService;

@RestController
@CrossOrigin

public class BankAccountController {

		@Autowired
		private BankAccountService bankAccountService;
		
		@RequestMapping(path="/bankaccount/add", method = RequestMethod.POST)
		public String add(@RequestBody BankAccount bankaccount) {
		
			return "{\"status\" : \"Bank details recorded successfullyyy!!\"}";
			
		}
		
		
		@RequestMapping(path="/bankccount/{accountno}", method = RequestMethod.GET)
		public BankAccount fetch(@PathVariable("accountno") int accountno) {
			return bankAccountService.fetch(accountno);
		}


}
