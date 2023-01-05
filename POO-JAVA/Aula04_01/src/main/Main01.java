package main;

import model.Mensagem;

public class Main01 {

	public static void main(String[] args) {
		Mensagem mensagem = new Mensagem();
		mensagem.texto = "Alô mundo!";
		mensagem.escrever();
		
		Mensagem mensagem2 = new Mensagem("Bem vindo");
		mensagem.escrever();
	}

}
