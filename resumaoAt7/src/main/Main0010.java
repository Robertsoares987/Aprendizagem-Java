package main;

import java.util.Scanner;

public class Main0010 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantas maçãs gostaria de comprar? ");
		int nMacas = scan.nextInt();
		if (nMacas >= 12) {
			System.out.println("O total a pagar é de R$ " + nMacas * 1.00);
		} else {
			System.out.println("O total a pagar é de R$ " + nMacas * 1.30);
		}

	}

}
