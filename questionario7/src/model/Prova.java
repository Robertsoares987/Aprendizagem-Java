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

		return "Nome: " + super.getNome() + " Nota: " + super.getNota() + " tempo de dura��o: " + this.tempoDuracao
				+ " Quantidade de quest�es: "

				+ this.quantidadeDeQuestoes + " consulta: " + this.consultaAutorizada;

	}

}
