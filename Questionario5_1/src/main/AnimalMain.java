package main;

import model.Animal;
import model.Mamifero;

public class AnimalMain {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Mamifero mamifero = new Mamifero();

		animal.setNome("Lia");
		System.out.println("Nome: " + animal.getNome());

		animal.setCor("branco");
		System.out.println("Cor: " + animal.getCor());

		animal.setQuantidadePatas(4);
		System.out.println("N° patas: " + animal.quantidadePatas);

		mamifero.setTipoAlimentacao("ração");
		System.out.println("Alimento: " + mamifero.getTipoAlimentacao());

		System.out.println("-----------------------------------");

		animal.setNome("Bolinha");
		System.out.println("Nome: " + animal.getNome());

		animal.setCor("preto");
		System.out.println("Cor: " + animal.getCor());

		animal.setQuantidadePatas(4);
		System.out.println("N° patas: " + animal.quantidadePatas);

		mamifero.setTipoAlimentacao("sementes de girassóis");
		System.out.println("Alimento: " + mamifero.getTipoAlimentacao());
	}

}
