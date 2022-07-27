package model;

public class Gerente extends Funcionario {

	public Gerente(String nome, int matricula, double salario_base) {
		super(nome, matricula, salario_base);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaSalario() {
		return super.getSalario_base() * 2;
	}

	public String toString() {
		return "Nome: " + super.getNome() + ", Matrícula: " + super.getMatricula() + ", Salario: "
				+ this.calculaSalario();
	}

}