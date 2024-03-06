package com.learning.core.day4;

public class D04P01 {
	public class BankAccount {
	    private int accNo;
	    private String custName;
	    private String accType;
	    private float balance;

	    public BankAccount(int accNo, String custName, String accType, float initialBalance) {
	        this.accNo = accNo;
	        this.custName = custName;
	        this.accType = accType;
	        
	        if ((accType.equals("Savings") && initialBalance < 1000) ||
	            (accType.equals("Current") && initialBalance < 5000)) {
	            throw new LowBalanceException("Initial balance is below the minimum required balance");
	        }

	        if (initialBalance < 0) {
	            throw new NegativeAmountException("Initial balance cannot be negative");
	        }

	        this.balance = initialBalance;
	    }

	    public void deposit(float amt) {
	        if (amt < 0) {
	            throw new NegativeAmountException("Deposit amount cannot be negative");
	        }

	        balance += amt;
	    }

	    public float getBalance() {
	        if (balance < 0) {
	            throw new NegativeAmountException("Balance is negative");
	        }

	        if ((accType.equals("Savings") && balance < 1000) ||
	            (accType.equals("Current") && balance < 5000)) {
	            throw new LowBalanceException("Balance is below the minimum required balance");
	        }

	        return balance;
	    }
	}

	@SuppressWarnings("serial")
	class LowBalanceException extends RuntimeException {
	    public LowBalanceException(String message) {
	        super(message);
	    }
	}

	@SuppressWarnings("serial")
	class NegativeAmountException extends RuntimeException {
	    public NegativeAmountException(String message) {
	        super(message);
	   }
	}

}
