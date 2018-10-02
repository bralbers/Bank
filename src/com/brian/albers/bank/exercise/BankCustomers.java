package com.brian.albers.bank.exercise;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public abstract class BankCustomers {
	protected final int INCREASE_CUSTOMER_ID_BY = 5;
	protected static int customerID = 1_000;

	private int taxID;
	private String customerName, address;
	protected BigDecimal moneyAmount, interestRate;

	ArrayList<SavingsAccount> savingsAccount = new ArrayList<SavingsAccount>();
	ArrayList<CheckingAccount> checkingAccount = new ArrayList<CheckingAccount>();

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getTaxID() {
		return taxID;
	}

	public void setTaxID(int taxID) {
		this.taxID = taxID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void addSavingsAccount() {
		savingsAccount.add(new SavingsAccount(moneyAmount, interestRate));
	}

	public void addCheckingAccount() {
		checkingAccount.add(new CheckingAccount(moneyAmount));
	}

	public void removeSavingsAccount(int index) {
		savingsAccount.remove(index);
	}

	public void removeCheckingAccount(int index) {
		checkingAccount.remove(index);
	}

	public void removeAllAccounts(int index) {
		savingsAccount.remove(index);
		checkingAccount.remove(index);
	}

	public void makeSavingsBalanceCorrection(int index, BigDecimal moneyAmount) {
		SavingsAccount savingsAccountModified = savingsAccount.get(index);
		savingsAccountModified.setAccountBalance(moneyAmount.setScale(2, RoundingMode.HALF_UP));
	}

	public void changeSavingsInterestRate(int index, BigDecimal interestRate) {
		SavingsAccount savingsAccountInterestRateModified = savingsAccount.get(index);
		savingsAccountInterestRateModified.setInterestRate(interestRate.setScale(2, RoundingMode.HALF_UP));
	}

	public void changeSavingsBalanceAndInterestRate(int index, BigDecimal moneyAmount, BigDecimal interestRate) {
		SavingsAccount savingsAccountModifiedBothFields = savingsAccount.get(index);
		savingsAccountModifiedBothFields.setAccountBalance(moneyAmount.setScale(2, RoundingMode.HALF_UP));
		savingsAccountModifiedBothFields.setInterestRate(interestRate.setScale(2, RoundingMode.HALF_UP));

	}

	public void makeCheckingBalanceCorrection(int index, BigDecimal moneyAmount) {
		CheckingAccount checkingAccountModified = checkingAccount.get(index);
		checkingAccountModified.setAccountBalance(moneyAmount.setScale(2, RoundingMode.HALF_UP));
	}
}