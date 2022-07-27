package model;

public class NotaFiscal {

	int numero;

	String resumo;

	Pagamento pagamento;

	public NotaFiscal(int numero, String resumo, Pagamento pagamento) {

		super();

		this.numero = numero;

		this.resumo = resumo;

		this.pagamento = pagamento;

	}

	public void imprimirNota() {

		System.out.println("Nota Fiscal Numero:\n" + numero);

		System.out.println("Resumo da compra:\n" + resumo);

		System.out.println("Forma de Pagamento:" + pagamento.imprimir());

	}

	public int getNumero() {

		return numero;

	}

	public void setNumero(int numero) {

		this.numero = numero;

	}

	public String getResumo() {

		return resumo;

	}

	public void setResumo(String resumo) {

		this.resumo = resumo;

	}

	public Pagamento getPagamento() {

		return pagamento;

	}

	public void setPagamento(Pagamento pagamento) {

		this.pagamento = pagamento;

	}

}