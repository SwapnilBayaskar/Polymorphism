package com.MethodOverriding;

public class SBI extends Bank {
	
	public void calculateRateOfInterest(int intPrincipal, int intPeriod) {
		
		int intInterest = 3000;
		float floatInterestRate;
		
		floatInterestRate = intInterest * 100 / intPrincipal * intPeriod;
		
		System.out.println("Rate of interest in SBI : "+floatInterestRate+" %");
	}

}
