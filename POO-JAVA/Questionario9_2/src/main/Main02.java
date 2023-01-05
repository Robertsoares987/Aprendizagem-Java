package main;

import model.Elevador;

public class Main02 {

	public static void main(String[] args) {
		Elevador elevador = new Elevador();

		elevador.inicializar(4, 10);
		elevador.entrar(3);
		elevador.entrar(2);

		elevador.subir(3);
		elevador.subir(3);
		elevador.subir(5);

		elevador.descer(2);
		elevador.descer(12);

		elevador.sair(2);
		elevador.sair(2);

	}

}