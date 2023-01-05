package model;

public class PagamentoAPrazo implements RegraDePagamento {
	@Override
	// a prazo a prazo tem um juros de 15% do valor total
	public double pagar(Venda v) {
		return v.getTotalVendido() * 0.05;
	}
}
