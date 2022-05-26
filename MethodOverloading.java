package com.MethodOverloading;

public class MethodOverloading {
	
	public void carPrice (long longPrice) {
		
		System.out.println("Price of a car : INR "+longPrice);
	}
	
	public void carPrice(double doublePrice) {
		
		System.out.println("Price of a car : INR "+doublePrice+" lacs");
	}
	
	public void carPrice(String strPrice) {
		
		System.out.println("Price of a car : "+strPrice);
	}

}
