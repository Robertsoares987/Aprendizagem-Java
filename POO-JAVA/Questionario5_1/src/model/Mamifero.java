package model;

public class Mamifero extends Animal {
	private String tipoAlimentacao;

	public String getTipoAlimentacao() {
		return this.tipoAlimentacao;
	}

	public void setTipoAlimentacao(String tipoAlimentacao) {
		this.tipoAlimentacao = tipoAlimentacao;
	}

	public Mamifero() {

	}

	public Mamifero(String nome, String cor, int quantidadePatas, String tipoAlimentacao) {
		super(nome, cor, quantidadePatas);
		this.tipoAlimentacao = tipoAlimentacao;

	}

}
