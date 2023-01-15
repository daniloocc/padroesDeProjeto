package com.strategy.cases;

public class PayManager {
	
	private Pay pay;
	
	public PayManager( Pay pay ) {
		this.pay = pay;
	}
	
	public void doPay(double price) {
		pay.pay(price);
	}

}
