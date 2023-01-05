package main;

import java.util.Scanner;

public class Main009 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira um número qualquer: ");
		int numero = scan.nextInt();

		if (numero >= 0) {
			System.out.println("O número " + numero + " é positivo.");
		} else {
			System.out.println("O número " + numero + " é negativo.");
		}
	}

}
