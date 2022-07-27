package main;

import java.util.Scanner;

import model.Pessoa;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Pessoa pessoa = new Pessoa();

		System.out.println("insira a idade da pessoa: ");
		pessoa.setIdade(scan.nextInt());

		if (pessoa.getIdade() > 18) {
			System.out.println(pessoa.idade + " é maior de 18 anos");
		} else {
			System.out.println(pessoa.idade + " é menor de 18 anos");
		}
	}
}
