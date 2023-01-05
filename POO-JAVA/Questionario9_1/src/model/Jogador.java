package model;

import java.sql.Date;
import java.util.Calendar;

public class Jogador {
	private String nome;
	private String posicao;
	private Calendar dataNasc;
	private String nacionalidade;
	private float altura;
	private float peso;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public Calendar getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Calendar dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public Jogador(String nome, String posicao, Calendar dataNasc, String nacionalidade, float altura, float peso) {
		this.nome = nome;
		this.posicao = posicao;
		this.dataNasc = dataNasc;
		this.nacionalidade = nacionalidade;
		this.altura = altura;
		this.peso = peso;
	}

	@SuppressWarnings("deprecation")
	public int calculeIdade() {
		return Calendar.getInstance().getTime().getYear() - this.dataNasc.getTime().getYear();
	}

	public void aposentadoria() {
		int idade = calculeIdade();

		if (idade >= 40 && this.posicao.equals("Defesa")) {
			System.out.println("Aposentadoria defirida para o jogador com " + idade + " anos");
		} else if (idade < 40 && this.posicao == "Defesa") {
			System.out.println("Ainda faltam " + (40 - idade) + " anos para o jogador aposentar.");
		} else if (idade >= 38 && this.posicao == "Meio-Campo") {
			System.out.println("Aposentadoria defirida para o jogador com " + idade + " anos");
		} else if (idade < 38 && this.posicao == "Meio-Campo") {
			System.out.println("Ainda faltam " + (38 - idade) + " anos para o jogador aposentar.");
		} else if (idade >= 35 && this.posicao == "Atacante") {
			System.out.println("Aposentadoria defirida para o jogador com " + idade + " anos");
		} else if (idade < 35 && this.posicao == "Atacante") {
			System.out.println("Ainda faltam " + (35 - idade) + " anos para o jogador aposentar.");
		} else {
			System.out.println("Não foi disponivel metodo para aposentadoria");
		}
	}

	@Override
	public String toString() {
		String dataNascimento = String.format("%d-%d-%d", dataNasc.getTime().getDate(), dataNasc.getTime().getMonth(),
				dataNasc.getTime().getYear());

		return "Jogador [nome=" + nome + ", posicao=" + posicao + ", dataNasc=" + dataNascimento + ", nacionalidade="
				+ nacionalidade + ", altura=" + altura + ", peso=" + peso + "]";
	}

}