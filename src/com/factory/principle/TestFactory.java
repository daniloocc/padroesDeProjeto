package com.factory.principle;

public class TestFactory {

	public static void main(String[] args) {
		Product p = Factory.create(Factory.COMPUTER);
		p.print();
		
		p = Factory.create(Factory.MOUSE);
		p.print();
	}
}
