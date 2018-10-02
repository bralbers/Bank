package com.brian.albers.bank.exercise;

import java.math.BigDecimal;

public class SavingsAccount extends BankAccounts {
	private final int ACCOUNT_ID_INCREASE = 7;

	private BigDecimal interestRate = new BigDecimal(0.0);
	private int savingsAccountID;

	public BigDecimal getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}

	public SavingsAccount() {

	}

	public SavingsAccount(BigDecimal savingsBalance) {
		setAccountBalance(savingsBalance);
		savingsAccountID = bankAccountID;
		bankAccountID += ACCOUNT_ID_INCREASE;
	}

	public SavingsAccount(BigDecimal savingsBalance, BigDecimal interestRate) {
		setAccountBalance(savingsBalance);
		setInterestRate(interestRate);
		savingsAccountID = bankAccountID;
		bankAccountID += ACCOUNT_ID_INCREASE;
	}

	@Override
	public String toString() {
		return "SavingsAccount: savingsAccountID=" + savingsAccountID + ", savingsBalance=" + getAccountBalance()
				+ ", interestRate=" + interestRate;
	}
}
