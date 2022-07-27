package model;

public class Assistente extends Funcionario {

	public Assistente(String nome, int matricula, double salario_base) {
		super(nome, matricula, salario_base);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaSalario() {
		return super.getSalario_base();
	}

	public String toString() {
		return "Nome: " + super.getNome() + ", Matrícula: " + super.getMatricula() + ", Salario: "
				+ this.calculaSalario();
	}
}