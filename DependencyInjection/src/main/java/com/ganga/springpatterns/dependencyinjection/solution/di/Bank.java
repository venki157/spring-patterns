package com.ganga.springpatterns.dependencyinjection.solution.di;

public interface Bank {

	/**
	 * Withdraws money from the given account.
	 * @param acctNo
	 * @param balance
	 */
	public void withdraw(long acctNo, int balance);
}
