package main;

import java.util.Scanner;

import model.ContadorDePessoas;

public class Main {

	public static void main(String[] args) {

		ContadorDePessoas cont = new ContadorDePessoas(35);

		Scanner scan = new Scanner(System.in);

		System.out.println("Insira a quantidade de pessoas que entraram no restaurante: ");

		int pessoas = scan.nextInt();

		cont.registraEntrada(pessoas);

		System.out.println("Insira a quantidade de pessoas que saíram do restaurante: ");

		pessoas = scan.nextInt();

		cont.registraSaida(pessoas);

		cont.mostrarRelatorio();

	}

}
