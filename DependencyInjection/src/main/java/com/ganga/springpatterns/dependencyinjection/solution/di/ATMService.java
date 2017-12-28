package com.ganga.springpatterns.dependencyinjection.solution.di;

/**
 * ATMService provides services like withdraw, deposit, balance,
 * MiniStatement....etc.
 * 
 * Spring provides "Interface segregation principle" which allows client to interact with
 * interface and doesn't worry about the type of implementation. 
 * 
 * @author gangadarkatakam
 *
 */
public class ATMService {
	
	private Bank bank;
	
	/**
	 * Note here ATMService is loosely coupled as we are passing Bank implementation
	 * in the constructor using constructor-based injection.
	 * This class can be tested with any type of bank.
	 * 
	 * One issue with constructor based injection is, One should know the bank and pass bank object
	 * during ATM object construction.
	 * 
	 */
	ATMService(Bank bank) {
		this.bank = bank;
	}
	
	/**
	 * Another way resolving dependency using setter based instruction. 
	 * You can construct ATM without Bank and the bank can be set later point of time.
	 * 
	 * @param bank
	 */
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	
	/**
	 * Withdraw money from the account by invoking the respective bank.
	 * @param acctNo
	 * @param amount
	 */
	public void withdraw(long acctNo, int amount) {
		bank.withdraw(acctNo, amount);
	}

}
