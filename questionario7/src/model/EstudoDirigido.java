package model;

public class EstudoDirigido extends Avaliacao {

	private String tema;

	private int numeroDePaginas;

	public EstudoDirigido(String nome, double nota, int numPaginas, String tema) {

		super(nome, nota);

		this.numeroDePaginas = numPaginas;

		this.tema = tema;

	}

	@Override

	public String getInfo() {

		// TODO Auto-generated method stub

		return "Nome: " + super.getNome() + " Nota: " + super.getNota() + " numero de páginas: " + this.numeroDePaginas
				+ " tema: " + this.tema;

	}

}
