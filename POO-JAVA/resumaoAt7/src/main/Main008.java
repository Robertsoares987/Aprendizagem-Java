package main;

import java.util.Scanner;

import javax.print.attribute.standard.Media;

import util.MediaNotas;

public class Main008 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("calculo de média final do aluno.");
		System.out.println("-------------------------------------");
		System.out.println("Insira um valor de 0 a 10 para nota N1 : ");
		float nota1 = scan.nextFloat();
		System.out.println("Insira um valor de 0 a 10 para a nota N2: ");
		float nota2 = scan.nextFloat();
		System.out.println("Insira um valor de 0 a 10 para a nota N4: ");
		float nota3 = scan.nextFloat();
		System.out.println("A média final do aluno é: " + MediaNotas.calcularMedia(nota1, nota2, nota3));

	}

}
