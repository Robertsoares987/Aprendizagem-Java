package model;

public class Vendedor extends Funcionario {

	public Vendedor(String nome, int matricula, double salario_base) {
		super(nome, matricula, salario_base);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaSalario() {
		return super.getSalario_base() + (super.getSalario_base() * 0.15);
	}

	public String toString() {
		return "Nome: " + super.getNome() + ", Matrícula: " + super.getMatricula() + ", Salario: "
				+ this.calculaSalario();
	}
}