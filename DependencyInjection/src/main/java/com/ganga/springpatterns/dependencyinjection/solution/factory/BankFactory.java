package com.ganga.springpatterns.dependencyinjection.solution.factory;

public class BankFactory {

	public static MyBank getInstance(String type) {
		if ("my".equals(type)) {
			return new MyBank();
		} 
		return new AnyBank();
	}

}
