package main;

import java.util.Scanner;

public class Main0010 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantas ma��s gostaria de comprar? ");
		int nMacas = scan.nextInt();
		if (nMacas >= 12) {
			System.out.println("O total a pagar � de R$ " + nMacas * 1.00);
		} else {
			System.out.println("O total a pagar � de R$ " + nMacas * 1.30);
		}

	}

}
