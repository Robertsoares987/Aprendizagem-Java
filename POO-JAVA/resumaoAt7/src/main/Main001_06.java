package main;

import java.util.Scanner;

public class Main001_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira um número: ");
		float primeiro = scan.nextFloat();
		System.out.println("Insira um número: ");
		float segundo = scan.nextFloat();
		System.out.println("Insira um número: ");
		float terceiro = scan.nextFloat();

		if (primeiro>segundo && primeiro>terceiro && segundo>terceiro) {
			System.out.println("A soma dos maiores é: "+(primeiro+segundo));
		}
		else if (segundo>primeiro && segundo>terceiro && terceiro>primeiro){
			System.out.println("A soma: "+(segundo+terceiro));
		}
		else {
			System.out.println("O maior número é: "+(primeiro+terceiro));
		}
	}

}
