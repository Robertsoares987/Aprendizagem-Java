package model;

public class Professor {
	private String nome;
	private String titulacao;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTitulcao() {
		return titulacao;
	}

	public void setTitulcao(String titulacao) {
		this.titulacao = titulacao;
	}

	@Override

	public String toString() {

		return "Professor = " + nome + "\nTitulação = " + titulacao;

	}

}
