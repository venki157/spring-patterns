package com.ganga.springpatterns.dependencyinjection.problem;

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
		bank = new MyBank();
	}
	
	public void withdraw(long acctNo, int amount) {
		bank.withdraw(acctNo, amount);
	}

}
