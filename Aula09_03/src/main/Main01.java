package main;

import model.CartaoAniversario;
import model.CartaoDiaDosNamorados;
import model.CartaoNatal;
import model.CartaoWeb;

public class Main01 {

	public static void main(String[] args) {
		CartaoWeb[] cartoes = new CartaoWeb[3];
		
		cartoes[0] = new CartaoNatal("Gustavo");
		cartoes[1] = new CartaoAniversario("Vanessa");
		cartoes[2] = new CartaoDiaDosNamorados("Luciene");	
				
		for (CartaoWeb cartaoWeb : cartoes) {
			cartaoWeb.showMessage();
		}
	}
}
