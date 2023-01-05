package model;

public class PagamentoAVista implements RegraDePagamento {
	@Override
	// pagamento vista tem desconto de 10%
	public double pagar(Venda v) {
		return v.getTotalVendido() * 0.1;
	}
}