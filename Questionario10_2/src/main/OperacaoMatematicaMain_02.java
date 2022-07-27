package main;

import java.util.Scanner;

import model.Divisao;
import model.IOperacaoMatematica;
import model.Multiplicacao;
import model.Soma;
import model.Subtracao;

public class OperacaoMatematicaMain_02 {

	private static String operacao;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Para escolher uma operação matemática insira um "
				+ "\ncaractere referente a operação desejada."+"\n"+
				"\nSoma: 1"+"\nSubtração: 2"+"\nMultiplicação: 3"+"\nDivisão: 4"+"\n");
							
		
		
		swicth (operacao){
			case 1:
				IOperacaoMatematica soma = new Soma();
				System.out.println("soma: " + soma.calcula(2, 5));
				break;
			case 2:
				IOperacaoMatematica subtracao = new Subtracao();
				System.out.println("Subtração: " + subtracao.calcula(2, 5));
				break;
			case 3:
				IOperacaoMatematica multiplicacao = new Multiplicacao();
				System.out.println("Multiplicação: " + multiplicacao.calcula(2, 5));
				break;
			case 4:
				IOperacaoMatematica divisao = new Divisao();
				System.out.println("Divisão: " + divisao.calcula(2, 5));
				break;
		}

	}
}
