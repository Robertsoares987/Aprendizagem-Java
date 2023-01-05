package model;

public class PagamentoEmCartao extends Pagamento {

	public String bandeira;

	public String numeroTransacao;

	public PagamentoEmCartao(float valor, String bandeira, String numeroTransacao) {

		super(valor);

		this.bandeira = bandeira;

		this.numeroTransacao = numeroTransacao;

	}

	@Override

	public String imprimir() {

		// TODO Auto-generated method stub

		return " Cart�o \n" + "Valor a pagar: " + super.getValor() + " Bandeira: " + this.bandeira
				+ " Numero da transa��o: "

				+ this.numeroTransacao;

	}

}