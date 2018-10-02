package com.brian.albers.bank.exercise;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BusinessCustomer extends BankCustomers {

	private int businessCustomerID;

	public void AddToAllAccounts(BigDecimal moneyAmount) {
		for(int index =0; index < savingsAccount.size(); index++) {
			SavingsAccount savingsAccountModified = savingsAccount.get(index);
			CheckingAccount checkingAccountModified = checkingAccount.get(index);
			savingsAccountModified.deposit(moneyAmount.setScale(2, RoundingMode.HALF_UP));
			checkingAccountModified.deposit(moneyAmount.setScale(2, RoundingMode.HALF_UP));
		}
	}
	
	public BusinessCustomer() {
		setCustomerName("N/A");
		setAddress("N/A");
		setTaxID(0);
		businessCustomerID = customerID;
		customerID += INCREASE_CUSTOMER_ID_BY;
	}

	public BusinessCustomer(String customerName, String address, int taxID) {
		setCustomerName(customerName);
		setAddress(address);
		setTaxID(taxID);
		businessCustomerID = customerID;
		customerID += INCREASE_CUSTOMER_ID_BY;
	}

	@Override
	public String toString() {
		return "BusinessCustomer [businessCustomerID=" + businessCustomerID + ", customerName=" + getCustomerName()
				+ ", address=" + getAddress() + ", taxID=" + getTaxID() + "]";
	}
}