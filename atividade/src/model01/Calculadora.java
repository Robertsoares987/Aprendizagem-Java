package model01;

public class Calculadora {
	public float valor1;
	public float valor2;
	public float valor3;

	public Calculadora() {
	}

	public Calculadora(float valor1) {
		this.valor1 = valor1;
	}

	public Calculadora(float valor1, float valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	public Calculadora(float valor1, float valor2, float valor3) {
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.valor3 = valor3;
	}

	public float soma() {
		return valor1 + valor2 + valor3;
	}

	public float subtracao() {
		return valor1 - valor2 - valor3;

	}

	public float multiplic() {
		return (valor1 * valor2 * valor3);

	}

	public float divisao() {
		return (valor1 / valor2 / valor3);
	}

	public void imprimir() {
		System.out.println(this.valor1 + "" + this.valor2 + "" + this.valor3);
	}
}