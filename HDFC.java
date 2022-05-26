package com.MethodOverriding;

public class HDFC extends Bank{
	
	public void calculateRateOfInterest(int intPrincipal, int intPeriod) {
		
		int intInterest = 3500;
		float floatInterestRate;
		
		floatInterestRate = intInterest * 100 / intPrincipal * intPeriod;
		
		System.out.println("Rate of interest in HDFC : "+floatInterestRate+" %");
		
	}
	

}
