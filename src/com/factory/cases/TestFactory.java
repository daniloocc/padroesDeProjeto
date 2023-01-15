package com.factory.cases;

import java.util.Scanner;

public class TestFactory {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please select fly:");
		System.out.println("1: Banshee");
		System.out.println("2: B747");
		System.out.println("3: A380");
		int type = in.nextInt();
		
		Fly fly = FlyFactory.create(type);
		fly.shoot();
	}

}
