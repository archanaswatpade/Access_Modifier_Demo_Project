package com.rbi.bankdemo.orch;

import com.rbi.bankdemo.hdfc.HdfcBank;

public class BankManagement {

	public static void main(String[] args) {
		
		HdfcBank h1=new HdfcBank("HDFC","HDFC0293",100);
		h1.dispayBalance();
		h1.addMoney(200);
		h1.dispayBalance();
		h1.withdrawMoney(100);
		h1.dispayBalance();
		h1.displayAllDetails();
		h1.setBranchId("Pune-203");
		h1.displayAllDetails();
		
	}

}
