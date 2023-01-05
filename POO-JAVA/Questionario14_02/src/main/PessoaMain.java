package main;

import model.Pessoa;

public class PessoaMain {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Robert", 28, 1.93, 87, "masculino");
		System.out.println(pessoa.toString());

	}

}
