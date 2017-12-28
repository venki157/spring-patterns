package com.ganga.springpatterns.dependencyinjection.solution.factory;

/**
 * ATMService provides services like withdraw, deposit, balance,
 * MiniStatement....etc.
 * 
 * @author gangadarkatakam
 *
 */
public class ATMService {
	
	private MyBank bank;
	
	/**
	 * Note here ATMService is tightly coupled my MyBank.
	 * 
	 */
	ATMService() {
		bank = BankFactory.getInstance("my");
	}
	
	public void withdraw(long acctNo, int amount) {
		bank.withdraw(acctNo, amount);
	}

}
