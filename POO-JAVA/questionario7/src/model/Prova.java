package model;

public class Prova extends Avaliacao {

	private Double tempoDuracao;

	private int quantidadeDeQuestoes;

	private boolean consultaAutorizada;

	public Prova(String nome, double nota, double tempo, int qtdQuestoes, boolean consulta) {

		super(nome, nota);

		this.tempoDuracao = tempo;

		this.quantidadeDeQuestoes = qtdQuestoes;

		this.consultaAutorizada = consulta;

	}

	@Override

	public String getInfo() {

		return "Nome: " + super.getNome() + " Nota: " + super.getNota() + " tempo de duração: " + this.tempoDuracao
				+ " Quantidade de questões: "

				+ this.quantidadeDeQuestoes + " consulta: " + this.consultaAutorizada;

	}

}
