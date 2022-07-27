package main;

import model01.Calculadora;

public class main01 {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora(10,20,30);
	
		calculadora.imprimir();
		
		System.out.println("Soma: " + calculadora.soma());
		System.out.println("subtracao: " +  calculadora.subtracao());
		System.out.println("multiplicacao : "+ calculadora.multiplic());
		System.out.println("divisao: " + calculadora.divisao());
	}

}
