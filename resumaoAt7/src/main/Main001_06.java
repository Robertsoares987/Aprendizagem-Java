package main;

import java.util.Scanner;

public class Main001_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Insira um n�mero: ");
		float primeiro = scan.nextFloat();
		System.out.println("Insira um n�mero: ");
		float segundo = scan.nextFloat();
		System.out.println("Insira um n�mero: ");
		float terceiro = scan.nextFloat();

		if (primeiro>segundo && primeiro>terceiro && segundo>terceiro) {
			System.out.println("A soma dos maiores �: "+(primeiro+segundo));
		}
		else if (segundo>primeiro && segundo>terceiro && terceiro>primeiro){
			System.out.println("A soma: "+(segundo+terceiro));
		}
		else {
			System.out.println("O maior n�mero �: "+(primeiro+terceiro));
		}
	}

}
