package main;

import model.NotaFiscal;

import model.Pagamento;

import model.PagamentoEmCartao;

import model.PagamentoEmDinheiro;

public class main02 {

	public static void main(String[] args) {

		Pagamento pagamentoDinheiro = new PagamentoEmDinheiro(20, 50, 30);

		NotaFiscal notaDinheiro = new NotaFiscal(102030, "Luvas cirúrgicas", pagamentoDinheiro);

		notaDinheiro.imprimirNota();

		System.out.println("----------------------------------------------------------------");

		Pagamento pagamentocartao = new PagamentoEmCartao(50, "Master", "001");

		NotaFiscal notaCartao = new NotaFiscal(203030, "Camiseta", pagamentocartao);
		notaCartao.imprimirNota();

	}

}