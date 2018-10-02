package com.brian.albers.bank.exercise;

import java.math.BigDecimal;

public class PrivateCustomer extends BankCustomers {

	private final BigDecimal CHANGE_ACCOUNT_TO = new BigDecimal(0.00);
	
	private int privateCustomerID;

	public void SetCheckingAndSavingsAccountToZero() {
		for(int index =0; index < savingsAccount.size(); index++) {
			SavingsAccount savingsAccountModified = savingsAccount.get(index);
			CheckingAccount checkingAccountModified = checkingAccount.get(index);
			savingsAccountModified.setAccountBalance(CHANGE_ACCOUNT_TO);
			checkingAccountModified.setAccountBalance(CHANGE_ACCOUNT_TO);
		}
	}
	
	public PrivateCustomer() {
		setCustomerName("N/A");
		setAddress("N/A");
		setTaxID(0);
		privateCustomerID = customerID;
		customerID += INCREASE_CUSTOMER_ID_BY;
	}

	public PrivateCustomer(String customerName, String address, int taxID) {
		setCustomerName(customerName);
		setAddress(address);
		setTaxID(taxID);
		privateCustomerID = customerID;
		customerID += INCREASE_CUSTOMER_ID_BY;
	}

	@Override
	public String toString() {
		return "PrivateCustomer [privateCustomerID=" + privateCustomerID + ", customerName=" + getCustomerName()
				+ ", address=" + getAddress() + ", taxID=" + getTaxID() + "]";
	}
}