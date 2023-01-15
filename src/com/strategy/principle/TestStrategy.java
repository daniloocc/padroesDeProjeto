package com.strategy.principle;

public class TestStrategy {
	
	public static void main(String[] args) {
		
		Context ctx = new Context(new Addition());
		
		double result = ctx.doCalculate(4, 2);
		
		System.out.println("Addition: "+ result);
		
		ctx = new Context(new Subtraction());
		
		result = ctx.doCalculate(4, 2);
		
		System.out.println("Subtraction: "+ result);
		
	}

}
