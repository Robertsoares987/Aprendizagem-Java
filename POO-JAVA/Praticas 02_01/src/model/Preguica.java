package model;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);

	}

	@Override
	public String emitirSom() {
		return "ressoa, preguiça";
	}

}
