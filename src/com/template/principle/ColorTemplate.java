package com.template.principle;

public class ColorTemplate extends PaperTemplate {
	
	@Override
	public void print() {
		super.print();
		System.out.println("Set the color of A4 paper RED");
	}

}
