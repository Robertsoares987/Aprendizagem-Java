package main;

import model.Automovel;
import model.Chocolate;
import model.IProduto;

public class ProdutoMain {

	public static void main(String[] args) {
		System.out.println("------------------ Automóvel -------------------");
		IProduto automovel = new Automovel();
		System.out.println("Modelo: " + automovel.getNome() + "\nMarca: " + automovel.getMarca() + "\nPreço: R$ "
				+ automovel.getPreco());

		System.out.println("------------------ Chocolate -------------------");
		IProduto chocolate = new Chocolate();
		System.out.println("Nome: " + chocolate.getNome() + "\nMarca: " + chocolate.getMarca() + "\nPreço: R$ "
				+ chocolate.getPreco());
	}

}
