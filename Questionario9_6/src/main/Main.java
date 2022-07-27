package main;

import model.Caminhao;
import model.Onibus;
import model.Veiculo;

public class Main {

	public static void main(String[] args) {

		Veiculo caminhao = new Caminhao("JFK-0031", 2010, 3);
		caminhao.exibirDador();
		System.out.println("--------------------------------------------");
		Veiculo onibus = new Onibus("WAR-1010", 2009, 50);
		onibus.exibirDador();

	}

}