package com.example.bankaccount2.data.entity;

public class TransactionDTO {

	private long timestamp;

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public TransactionDTO(String accountNumber, long timestamp, double amount,
			String description) {
		this.timestamp = timestamp;
	}

	public long getTimestamp() {
		// TODO Auto-generated method stub
		return this.timestamp;
	}

}
