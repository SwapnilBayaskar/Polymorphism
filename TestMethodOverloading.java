package com.MethodOverloading;

public class TestMethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading objMethodOverloading = new MethodOverloading();
		
		objMethodOverloading.carPrice(750000);
		objMethodOverloading.carPrice(7.5);
		objMethodOverloading.carPrice("Seven lac fifty thousand");

	}

}
