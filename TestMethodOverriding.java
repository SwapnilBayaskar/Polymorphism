package com.MethodOverriding;

public class TestMethodOverriding {

	public static void main(String[] args) {
		
		Bank objBank = new Bank();
		SBI objSBI = new SBI();
		HDFC objHDFC = new HDFC();
		AxisBank objAxisBank = new AxisBank();
		
		objBank.calculateRateOfInterest(50000, 2);
		
		objSBI.calculateRateOfInterest(50000, 2);
		
		objHDFC.calculateRateOfInterest(50000, 2);
		
		objAxisBank.calculateRateOfInterest(50000, 2);
	
	
	}

}
