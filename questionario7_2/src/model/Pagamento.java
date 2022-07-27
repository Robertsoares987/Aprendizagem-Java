package model;

public abstract class Pagamento {

	private float valor;

	public Pagamento(float valor) {

		this.valor = valor;

	}

	public float getValor() {

		return this.valor;

	}

	public abstract String imprimir();

}