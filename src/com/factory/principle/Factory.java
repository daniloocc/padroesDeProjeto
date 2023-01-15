package com.factory.principle;

public class Factory {
	
	public static final int COMPUTER = 0;
	public static final int MOUSE = 1;
	
	public static Product create(int type) {
		Product p = null;
		
		if( type == COMPUTER ) {
			p = new Computer();
		}else if ( type == MOUSE ) {
			p = new Mouse();
		}		
		return p;
	}

}
