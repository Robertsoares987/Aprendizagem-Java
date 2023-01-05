package main;

import util.Calcule;

public class Main002_06 {

	public static void main(String[] args) {

		System.out.println("2 + 5: " + Calcule.soma(2, 5));
		System.out.println("2 + 5 + 3: " + Calcule.somaTres(2, 5, 3));
		System.out.println("7 -  5: " + Calcule.subtracaoDois(7, 5));
		System.out.println("7 - 1 - 5: " +  Calcule.subtracaoTres(7, 1, 5));
		System.out.println("2 * 5:  " +Calcule.multiplicaDois(2, 5) );
		System.out.println("2 * 5 * 3:  " +Calcule.multiplicaTres(2, 5, 3));
		System.out.println("20 / 2 :  " +Calcule.divideDois(20, 2) );
		System.out.println("20 / 2 / 5:  " +Calcule.divideTres(20, 2, 5));
	}

}
