package main;

import java.util.Scanner;

public class Main0014 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira o primeiro n�mero.");
		int primeiro = scan.nextInt();
		System.out.println("Insira o segundo n�mero.");
		int segundo = scan.nextInt();

		if (primeiro > segundo) {
			System.out.println(primeiro + " � o maior n�mero");

		} else {
			System.out.println(segundo + " � o maior n�mero");
		}
	}

}
