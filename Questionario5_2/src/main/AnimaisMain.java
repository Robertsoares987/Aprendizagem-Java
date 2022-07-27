package main;

import model.Mamifero;
import model.Peixe;

public class AnimaisMain {

	public static void main(String[] args) {

		Mamifero mamifero = new Mamifero();
		Peixe peixe = new Peixe();

		mamifero.setNome("Camelo");
		System.out.println("Nome: " + mamifero.getNome());

		mamifero.setCor("Amarelo");
		System.out.println("Cor: " + mamifero.getCor());

		mamifero.setQuantidadePatas(4);
		System.out.println("N° patas: " + mamifero.getQuantidadePatas());

		mamifero.setTipoAlimentacao("Carnívoro");
		System.out.println("Alimento: " + mamifero.getTipoAlimentacao());

		System.out.println("-------------------------------------------");

		peixe.setNome("Tubarão");
		System.out.println("Nome: " + peixe.getNome());

		peixe.setQuantidadePatas(0);
		System.out.println("N° patas: " + peixe.getQuantidadePatas());

		peixe.setCor("Cinzento");
		System.out.println("Cor: " + peixe.getCor());

		// mamifero.setTipoAlimentacao("Carnívoro");
		// System.out.println("Alimento: " + mamifero.getTipoAlimentacao());

		System.out.println("-------------------------------------------");

		mamifero.setNome("Urso-do-canadá");
		System.out.println("Nome: " + mamifero.getNome());

		mamifero.setQuantidadePatas(4);
		System.out.println("N° patas: " + mamifero.getQuantidadePatas());

		mamifero.setCor("Vermelho");
		System.out.println("Cor: " + mamifero.getCor());

		mamifero.setTipoAlimentacao("Mel");
		System.out.println("Alimento: " + mamifero.getTipoAlimentacao());

	}

}
