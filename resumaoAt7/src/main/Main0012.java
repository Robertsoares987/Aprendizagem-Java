package main;

import java.util.Scanner;

import util.MediaSimples;

public class Main0012 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira a nota da primeira avalia��o. ");
		float avaliacao1 = scan.nextFloat();
		System.out.println("Insira a nota da segunda avalia��o.");
		float avaliacao2 = scan.nextFloat();
		System.out.println(MediaSimples.calcularMediaSimples(avaliacao1, avaliacao2));

	}

}
