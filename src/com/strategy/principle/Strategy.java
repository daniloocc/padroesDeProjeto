package com.strategy.principle;


/**
 * Padrão Strategy Permite representar uma operação a ser realizada sobre os elementos de uma estrutura de objetos.
 * Permite definir novas operações sem alterar as classes dos elementos sobre os quais opera.
 * Permite que o algoritmo varie intependentemente dos cliente que o utilizam
 * @author Danilo
 *
 */
public abstract class Strategy {
	
	public abstract double calculate(double a, double b);

}
