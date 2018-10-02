package com.brian.albers.bank.exercise;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CheckingAccount extends BankAccounts {
	private final int ACCOUNT_ID_INCREASE = 7;

	private int checkNumber = 1;
	private int checkingAccountID;

	public int nextCheckNumber() {
		return checkNumber;
	}

	public CheckingAccount() {

	}

	public CheckingAccount(BigDecimal checkingBalance) {
		setAccountBalance(checkingBalance.setScale(2, RoundingMode.HALF_UP));
		checkingAccountID = bankAccountID;
		bankAccountID += ACCOUNT_ID_INCREASE;
	}

	@Override
	public void withdraw(BigDecimal withdrawAmount) {
		BigDecimal checkingAccountBalance = getAccountBalance();
		checkingAccountBalance.subtract(withdrawAmount);
		setAccountBalance(checkingAccountBalance);
		checkNumber++;
	}

	@Override
	public String toString() {
		return "CheckingAccount: checkingAccountID=" + checkingAccountID + ", checkingBalance=" + getAccountBalance();
	}
}