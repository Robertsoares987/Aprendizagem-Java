package model;

public abstract class Avaliacao {

	private String nome;

	private Double nota;

	public Avaliacao(String nome, double nota) {

		this.nome = nome;

		this.nota = nota;
		if (nota <= 0) {
			throw new IllegalArgumentException("Erro! Insira um valor maior que zero para a nota.");
		} else {
			this.nota = nota;
		}

	}

	public String getNome() {
		return this.nome;
	}

	public Double getNota() {

		return (this.nota);

	}

	public abstract String getInfo();

}