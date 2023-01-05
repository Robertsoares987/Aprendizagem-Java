package main;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import model.Computador;
import model.ComputadorDeMesa;
import model.Smartphone;

public class ComputadorMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Computador pcMesa = new ComputadorDeMesa("Dell", "intel i7", "Ram 16GB ", "HD 1TB", "Antec", "compacto",
				"ATX 600w");

		Smartphone smart = new Smartphone("Sansung",
				"1x 3.0 GHz Cortex-X2 + 3x 2.5 GHz Cortex-A710 + 4x 1.8 GHz Cortex-A510", "Ram 8GB", "256GB", "6.1 pol",
				"422 ppi", "Claro");

		System.out.println("Selecione um dispositivo: \nComputador de mesa: digite 1 \nSmartphone: dgite 2");
		int tipoDeDispositivo = scan.nextInt();

		switch (tipoDeDispositivo) {
		case 1:
			System.out.println("Ficha técnica: " + pcMesa.toString());
			System.out.println(
					"Vamos trocar a memoria principal, memoria secundaria e o processador? \nSim: digite 1 \nNão: digite 2 ");
			int trocar1 = scan.nextInt();
			if (trocar1 == 1) {
				pcMesa.trocarMemoriaPrincipal("Ram 8 GB");
				pcMesa.trocarMemoriaSecundaria("HD 500 GB");
				pcMesa.trocarProcessador("Intel i9");
				System.out.println("Ficha técnica da nova máquina: " + pcMesa.toString());
			} else {
				System.out.println("Não houve mudanças na sua máquina.");
			}

			break;
		case 2:
			System.out.println("Ficha técnica: " + smart.toString());
			System.out.println("gostaria de trocar de operadora? \nSim: digite 1 \nNão: digite 2 ");
			int Operadora1 = scan.nextInt();
			if (Operadora1 == 1) {
				smart.trocarOperadora("vivo");
				System.out.println(
						"Sua nova operadora: " + smart.getOperadora() + "\nNova ficha técnica: " + smart.toString());
			} else {
				System.out.println("Sua operadora não mudou");
			}

			break;
		default:
			break;
		}
	}
}
