package model;

public class Seminario extends Avaliacao {

	private String tema;

	private double tempoDuracao;

	public Seminario(String nome, double nota, double tempo, String tema) {

		super(nome, nota);

		this.tempoDuracao = tempo;

		this.tema = tema;

	}

	@Override

	public String getInfo() {

		return "Nome: " + super.getNome() + " Nota: " + super.getNota() + " tempo de dura��o: " + this.tempoDuracao
				+ " tema: " + this.tema;

	}

}
