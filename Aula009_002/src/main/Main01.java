package main;

import model.Aniversario;
import model.CartaoWeb;
import model.DiaDosNamorados;
import model.Natal;

public class Main01 {

	public static void main(String[] args) {
		CartaoWeb[] cartoes = new CartaoWeb[3];
		
		cartoes[0] = new DiaDosNamorados("Ciclana");
		cartoes[1] = new Natal("Ciclana");
		cartoes[2] = new Aniversario("Ciclana");
		
		for(int i = 0; i < 3; i++){
			cartoes[i].showMessage();
		}
	}

}
