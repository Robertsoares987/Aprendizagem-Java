package main;

import model.Bimestre;

import model.EstudoDirigido;

import model.Prova;

import model.Seminario;

public class BimestreTesteMain {

	public static void main(String[] args) {

		Bimestre bimestre = new Bimestre();

		try {

			bimestre.setIdbimestre("1");

			bimestre.setAv1(new Prova("jo�o", 2, 40, 20, true));

			bimestre.setIdbimestre("2");

			bimestre.setAv2(new Seminario("jo�o", 8, 35, "Estrutura de dados"));

			bimestre.setIdbimestre("1");

			bimestre.setAv3(new EstudoDirigido("jo�o", 0, 5, "UML"));

			bimestre.imprimirAvaliacoes();
		} catch (IllegalArgumentException e) {
			System.out.println(e);

		}

	}

}
