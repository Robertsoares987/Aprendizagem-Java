package main;

import model.Assistente;
import model.Funcionario;
import model.Gerente;
import model.Vendedor;

public class MainTeste {

	public static void main(String[] args) {
		Funcionario gerente = new Gerente("Jose", 001, 2000);
		System.out.println("Cargo: Gerente, " + gerente.toString());

		Funcionario assistente = new Assistente("Silvio", 10, 2000);
		System.out.println("Cargo: Assistente, " + assistente.toString());

		Funcionario vendedor = new Vendedor("Sousa", 20, 2000);
		System.out.println("Cargo: Vendedor, " + vendedor.toString());
	}

}