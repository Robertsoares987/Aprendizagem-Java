package model;

public class Mamifero {
	public String nome;
	private String cor;
	private int quantidadePatas;
	private String tipoAlimentacao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getTipoAlimentacao() {
		return tipoAlimentacao;
	}

	public void setTipoAlimentacao(String tipoAlimentacao) {
		this.tipoAlimentacao = tipoAlimentacao;
	}

	public Mamifero() {

	}

	public Mamifero(String nome, String cor, int quantidadePatas, String tipoAlimentacao) {
		this.nome = nome;
		this.cor = cor;
		this.quantidadePatas = quantidadePatas;
		this.tipoAlimentacao = tipoAlimentacao;
	}

	public void imprimir() {
		System.out.print("Nome: " + this.nome + ", " + "Cor: " + this.cor + ", " + "N° Patas: " + this.quantidadePatas
				+ ", Tipo de Alimentação: ");
	}

}
