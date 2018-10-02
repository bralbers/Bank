package com.brian.albers.bank.exercise;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class BankAccounts {
	static int bankAccountID = 2_000_000;
	private BigDecimal accountBalance;

	public BigDecimal getAccountBalance() {
		return accountBalance.setScale(2, RoundingMode.HALF_UP);
	}

	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance.setScale(2, RoundingMode.HALF_UP);
	}

	public void withdraw(BigDecimal withdrawAmount) {
		if (accountBalance.compareTo(BigDecimal.ZERO) > 0)
			accountBalance.subtract(withdrawAmount.setScale(2, RoundingMode.HALF_UP));
	}

	public void deposit(BigDecimal depositAmount) {
		accountBalance.add(depositAmount.setScale(2, RoundingMode.HALF_UP));
	}
}