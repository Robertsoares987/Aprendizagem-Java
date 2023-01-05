package main;

import model.Amor;
import model.Desejo;

public class SentimentoMain {

	public static void main(String[] args) {
		Amor amor = new Desejo();
		amor.imprimir();

		Amor felicidade = new Amor() {

			@Override
			public void imprimir() {
				System.out.println(toString());

			}

			public String toString() {
				return "Felicidade!";

			}
		};
		felicidade.imprimir();

	}

}
