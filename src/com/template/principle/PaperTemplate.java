package com.template.principle;

/**
 * Template pattern adia as etapas de um algoritmo para uma subclasse.
 * Definimos o esqueleto do algoritmo e adiamos algumas etapas para as subclasses
 * @author Danilo
 *
 */
public abstract class PaperTemplate {
	
	public void print() {
		System.out.println("Print A4 paper");
	}

}
