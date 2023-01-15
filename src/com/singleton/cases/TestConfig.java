package com.singleton.cases;

public class TestConfig {
	
	public static void main(String[] args) {
		
		Config config1 = Config.getInstance();
		System.out.println("Config1 Reference: "+config1);
		System.out.println(config1.get("classDriver"));
		System.out.println(config1.get("username"));
		System.out.println(config1.get("password"));
		System.out.println("----------------------------");
		
		Config config2 = Config.getInstance();
		System.out.println("Config2 Reference: "+config2);
		System.out.println(config2.get("classDriver"));
		System.out.println(config2.get("username"));
		System.out.println(config2.get("password"));
		
		
		
	}

}
