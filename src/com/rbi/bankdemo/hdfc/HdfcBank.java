package com.rbi.bankdemo.hdfc;

import com.rbi.bankdemo.Bank;

public class HdfcBank extends Bank{
	
	String branchId;
	final String name="HDFC";
	

	public HdfcBank(String nameInput, String ifscInput, double balanceInput) {
		super(nameInput, ifscInput, balanceInput);

	}
	
	public double withdrawMoney(double amountWithdraw) {
		balance=balance-amountWithdraw-charge();
		return balance;
	}
	private double charge() {
		return 0.20;
	}
	
	public void setBranchId(String branchInput) {
		branchId=branchInput;
	}
	
	public void displayAllDetails() {
		System.out.println("BankName : "+name+" IFCSCode : "+ifscCode+" Balance "+balance+" BranchId : "+branchId);
	}
	
}
