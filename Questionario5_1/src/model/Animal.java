package model;

public class Animal {
	public String nome;
	public String cor;
	public int quantidadePatas;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQuantidadePatas() {
		return quantidadePatas;
	}

	public void setQuantidadePatas(int quantidadePatas) {
		this.quantidadePatas = quantidadePatas;
	}

	public Animal() {

	}

	public Animal(String nome, String cor, int quantidadePatas) {
		this.nome = nome;
		this.cor = cor;
		this.quantidadePatas = quantidadePatas;
	}

}
