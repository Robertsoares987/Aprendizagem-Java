package main;

import java.util.Scanner;

public class Main0013 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Para saber se poder� votar " + "responda as seguintes perguntas ");
		System.out.println("Qual � o ano atual? ");
		int anoAtual = scan.nextInt();
		System.out.println("Em que ano voc� nasceu? ");
		int anoNascimento = scan.nextInt();

		if ((anoAtual - anoNascimento) >= 16) {
			System.out.println("Voc� poder� votar este ano.");
		} else {
			System.out.println("Voc� n�o poder� votar este ano.");
		}

	}

}
