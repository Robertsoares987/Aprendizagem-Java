package main;

import java.util.Scanner;

import model.PagamentoAPrazo;
import model.PagamentoAVista;
import model.Venda;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Venda vendaAVista = new Venda();
		Venda vendaAPrazo = new Venda();

		System.out.println("O total a pagar é de R$ 80,00");
		System.out
				.println("Escolha a forma de pagamento:\nPagamento a vista = Digite 1\nPagamento a prazo = Digite 2 ");
		int formaDePagamento = scan.nextInt();
		vendaAVista.setTotalVendido(80);
		vendaAPrazo.setTotalVendido(80);

		vendaAVista.setPagamento(new PagamentoAVista());
		vendaAPrazo.setPagamento(new PagamentoAPrazo());
		switch (formaDePagamento) {
		case 1:
			System.out.println("Venda a vista, valor total: " + "R$ " + vendaAVista.calcularTotal());
			break;
		case 2:
			System.out.println("Venda a prazo, valor total: " + "R$ " + vendaAPrazo.calcularTotal());
			break;
		default:
			break;
		}

	}
}
