package com.cg.pa.dao;

import com.cg.pa.dto.Credentials;
import com.cg.pa.dto.Customer;

public interface BankDao {

	public Customer signIn(String cstId, String cstPass);

	public void deposit(int depositAmount, Customer customer);

	public void withdraw(int withdrawAmount, Customer customer);

	public Customer transfer(int transferAmount, Customer customer, String reciever);

	public String createAccount(String password, String custName,
			String accType);

}
