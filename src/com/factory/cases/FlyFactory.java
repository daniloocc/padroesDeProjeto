package com.factory.cases;

public class FlyFactory {
	
	public static final int BANSHEE = 1;
	public static final int B747 = 2; 
	public static final int A380 = 3;
	
	public static Fly create(int type) {
		Fly fly = null;
		
		if( type == BANSHEE ) {
			fly = new Banshee();
		}else if(type == B747) {
			fly = new B747();
		}else if(type == A380) {
			fly = new A380();
		}
		
		return fly;
	}

}
