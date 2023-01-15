package com.strategy.cases;

import java.util.Scanner;

public class TestPay {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("You need to pay $25 for mobile phone");
		System.out.println("Please select payment method:");
		System.out.println("1 - Mastercard");
		System.out.println("2 - visacard");
		System.out.println("3 - PayPal");
		
		int code = in.nextInt();
		in.close();
		
		
		PayManager payManager = null;
		
		if(code == 1 ) {
			payManager = new PayManager(new MasterCard());
		}else if(code == 2 ) {
			payManager = new PayManager(new VisaCard());
		}else if(code == 3) {
			payManager = new PayManager(new PayPal());
		}
		
		payManager.doPay(25);
	}

}
