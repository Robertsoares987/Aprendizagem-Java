package model;

public class Pessoa {
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private String sexo;

	public Pessoa(String nome, int idade, double altura, float peso, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String IMC(double peso, double altura) {
		double imc = peso / (altura * altura);
		String status;
		if (imc < 18.5) {
			status = "baixo do peso normal";
		} else if (18.5 < imc && imc <= 25) {
			status = "Peso Normal";
		} else if (25 < imc && imc <= 30) {
			status = "Acima do peso normal.";
		} else {
			status = "Obesidade";
		}

		return imc + " Status= " + status;
	}

	public String status(String status) {

		return status;
	}

	@Override
	public String toString() {

		return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + ", peso=" + peso + ", sexo=" + sexo
				+ ", IMC= " + IMC(peso, altura) + "]";
	}

}
