package main;

import model.ContaImposto;

public class Main01 {
	public static void main(String [] args){
		ContaImposto contaImposto = 
				new ContaImposto(100, 100000, "000.000.000-00", 0.1F);
		
		contaImposto.depositar(50);
		
		System.out.println("Saldo atual: " + contaImposto.getSaldo());
		System.out.println("Imposto: " + contaImposto.calcularImposto());
		
		contaImposto.sacar(120);
		
		System.out.println("Saldo atual: " + contaImposto.getSaldo());
		System.out.println("Imposto: " + contaImposto.calcularImposto());		
	}
}
