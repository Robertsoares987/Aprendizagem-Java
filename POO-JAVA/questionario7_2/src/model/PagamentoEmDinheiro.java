package model;

public class PagamentoEmDinheiro extends Pagamento {

	public float valorRecebido;

	public float troco;

	public PagamentoEmDinheiro(float valor, float valorRecebido, float troco) {

		super(valor);

		this.valorRecebido = valorRecebido;

		this.troco = troco;

	}

	@Override

	public String imprimir() {

		// TODO Auto-generated method stub

		return " Dinheiro \n" + "Valor a pagar: " + super.getValor() + " Valor recebido: " + this.valorRecebido
				+ " Troco: "

				+ this.troco;

	}

}
