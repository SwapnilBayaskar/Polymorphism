package com.MethodOverriding;

public class AxisBank extends Bank{
	
		public void calculateRateOfInterest(int intPrincipal, int intPeriod) {
		
		int intInterest = 4000;
		float floatInterestRate;
		
		floatInterestRate = intInterest * 100 / intPrincipal * intPeriod;
		
		System.out.println("Rate of interest in HDFC : "+floatInterestRate+" %");
		
	}

}
