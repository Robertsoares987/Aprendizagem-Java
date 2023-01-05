package main;

import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int soma = 0;
		
		while(soma < 10){
			System.out.println("Entre com um numero");
			soma = soma + scan.nextInt();
			// soma += scan.nextInt();
		}
		
		System.out.println("Soma = " + soma);
	}

}
