package main;

import java.util.Scanner;

public class Main01 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor");
		float valor1 = scan.nextFloat();
		
		float valor2 = 0;
		
		do {
			System.out.println("Informe o segundo valor");
			valor2 = scan.nextFloat();
		} while (valor2 == 0 ) ;
		
		float resultado = valor1 / valor2;
		
		System.out.println("Resutado da divisão: " + resultado);
	}
}
