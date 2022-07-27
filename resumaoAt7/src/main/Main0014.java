package main;

import java.util.Scanner;

public class Main0014 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira o primeiro número.");
		int primeiro = scan.nextInt();
		System.out.println("Insira o segundo número.");
		int segundo = scan.nextInt();

		if (primeiro > segundo) {
			System.out.println(primeiro + " é o maior número");

		} else {
			System.out.println(segundo + " é o maior número");
		}
	}

}
