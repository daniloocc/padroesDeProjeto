package com.singleton.principle;


/**
 * Este padrão garante 
 * @author Danilo
 *
 */
public class Singleton {
	
	private static Singleton instance;
	
	public Singleton() {
	}
	
	public static Singleton getInstance() {
		if( instance == null ) {
			instance = new Singleton();
			// há apensas uma instancia
		}
		return instance;
	}

}
