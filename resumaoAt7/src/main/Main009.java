package main;

import java.util.Scanner;

public class Main009 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira um n�mero qualquer: ");
		int numero = scan.nextInt();

		if (numero >= 0) {
			System.out.println("O n�mero " + numero + " � positivo.");
		} else {
			System.out.println("O n�mero " + numero + " � negativo.");
		}
	}

}
