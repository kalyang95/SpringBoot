package com.atm;

public class AtmMain {

	public static void main(String[] args) {
		ATM atm = new ATM();
		Customer c1 = new Customer(atm);
		Customer c2 = new Customer(atm);
		c1.start();
		c2.start();
	}

}
