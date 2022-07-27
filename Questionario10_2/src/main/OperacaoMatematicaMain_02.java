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
		
		System.out.println("Para escolher uma opera��o matem�tica insira um "
				+ "\ncaractere referente a opera��o desejada."+"\n"+
				"\nSoma: 1"+"\nSubtra��o: 2"+"\nMultiplica��o: 3"+"\nDivis�o: 4"+"\n");
							
		
		
		swicth (operacao){
			case 1:
				IOperacaoMatematica soma = new Soma();
				System.out.println("soma: " + soma.calcula(2, 5));
				break;
			case 2:
				IOperacaoMatematica subtracao = new Subtracao();
				System.out.println("Subtra��o: " + subtracao.calcula(2, 5));
				break;
			case 3:
				IOperacaoMatematica multiplicacao = new Multiplicacao();
				System.out.println("Multiplica��o: " + multiplicacao.calcula(2, 5));
				break;
			case 4:
				IOperacaoMatematica divisao = new Divisao();
				System.out.println("Divis�o: " + divisao.calcula(2, 5));
				break;
		}

	}
}
