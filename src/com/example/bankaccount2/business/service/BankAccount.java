package com.example.bankaccount2.business.service;

import java.util.Calendar;

import android.util.Log;

import com.example.bankaccount2.data.dao.BankAccountDAO;
import com.example.bankaccount2.data.dao.TransactionDAO;
import com.example.bankaccount2.data.entity.BankAccountDTO;
import com.example.bankaccount2.data.entity.TransactionDTO;

public class BankAccount {

	public static BankAccountDAO bankAccountDAO;
	public static TransactionDAO transactionDAO;
	public static Calendar calendar;

	public static BankAccountDTO openAccount(String string) {
		BankAccountDTO bankAccountDTO = new BankAccountDTO();
		bankAccountDTO.setAccountNumber(string);
		bankAccountDAO.save(bankAccountDTO);
		return null;
	}

	public static BankAccountDTO getAccount(String accountNumber) {
		bankAccountDAO.getAccount(accountNumber);
		return null;
	}

	public static void deposit(String accountNumber, double amount,
			String description) {
		BankAccountDTO bankAccountDTO = bankAccountDAO
				.getAccount(accountNumber);
		bankAccountDTO.setBalance(bankAccountDTO.getBalance() + amount);
		bankAccountDAO.save(bankAccountDTO);

		long timestamp = calendar.getTimeInMillis();
		Log.e("sss", timestamp + "");
		TransactionDTO transactionDTO = new TransactionDTO(accountNumber,
				timestamp, amount, description);
		transactionDAO.createTransaction(transactionDTO);
	}

	public static void withdraw(String accountNumber, double amount,
			String description) {
		BankAccountDTO bankAccountDTO = bankAccountDAO
				.getAccount(accountNumber);
		bankAccountDTO.setBalance(bankAccountDTO.getBalance() - amount);
		bankAccountDAO.save(bankAccountDTO);

	}

}
