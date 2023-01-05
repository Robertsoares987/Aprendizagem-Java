package main;

import java.util.Scanner;

import model.Conversaocambio;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Conversaocambio conversaocambio = new Conversaocambio();

		System.out.println("Insira o valor em Dolar que " + "gostaria de converter para Real: ");
		conversaocambio.setDolar(scan.nextFloat());
		System.out.println("Valor em real: R$ " + conversaocambio.getDolar() * 4.05);

		System.out.println("Insira o valor em Real que " + "gostaria de converter para Dolar: ");
		conversaocambio.setReal(scan.nextFloat());
		System.out.println("Valor em Dolar: U$$ " + conversaocambio.getReal() / 4.05);

	}
}
