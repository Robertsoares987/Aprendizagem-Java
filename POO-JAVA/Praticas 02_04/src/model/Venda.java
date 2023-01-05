package model;

public class Venda {
	private double totalVendido;
	private RegraDePagamento pagamento;

	public void setPagamento(RegraDePagamento pagamento) {
		this.pagamento = pagamento;
	}

	public double calcularTotal() {
		if (this.pagamento instanceof PagamentoAVista)
			return this.totalVendido - this.pagamento.pagar(this);
		else
			return this.totalVendido + this.pagamento.pagar(this);
	}

	public double getTotalVendido() {
		return totalVendido;
	}

	public void setTotalVendido(double totalVendido) {
		this.totalVendido = totalVendido;
	}
}