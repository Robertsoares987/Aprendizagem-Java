package main;

import java.util.Calendar;

import model.Jogador;

public class Main {

	public static void main(String[] args) {
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.set(1980, 01, 01);

		Jogador jogador = new Jogador("João", "Atacante", dataNascimento, "Brasileira", 190, 85);
		System.out.println(jogador.toString());

		jogador.aposentadoria();

	}

}