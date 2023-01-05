package util;

public class SalarioFuncionarios {
	public static double calcularSalario(float salarioFixo, double comissaoFixa, double valorVendas,
			int nCarrosVendidos) {
		return salarioFixo + (nCarrosVendidos * comissaoFixa) + (salarioFixo + (valorVendas * 0.05));
	}

}
