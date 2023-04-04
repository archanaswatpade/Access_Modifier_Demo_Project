package com.rbi.bankdemo;

public class Bank {

	protected String name;
	protected String ifscCode;
	protected double balance;
	
	protected Bank(String nameInput,String ifscInput,double balanceInput){
		
		name=nameInput;
		ifscCode=ifscInput;
		balance=balanceInput;
		
	}
	
	public void addMoney(double balanceAmount) {
		balance=balanceAmount;
	}
	
	public double withDrawMoney(double amountWithdraw) {
		
		balance=balance-amountWithdraw-charge();
		return balance;
	}
	
	private double charge() {
		return 0.10;
	}
	
	public void dispayBalance() {
		
		System.out.println("Balance : "+balance);
	}
	
	
}
