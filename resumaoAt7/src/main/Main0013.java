package main;

import java.util.Scanner;

public class Main0013 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Para saber se poderá votar " + "responda as seguintes perguntas ");
		System.out.println("Qual é o ano atual? ");
		int anoAtual = scan.nextInt();
		System.out.println("Em que ano você nasceu? ");
		int anoNascimento = scan.nextInt();

		if ((anoAtual - anoNascimento) >= 16) {
			System.out.println("Você poderá votar este ano.");
		} else {
			System.out.println("Você não poderá votar este ano.");
		}

	}

}
