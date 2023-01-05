package main;

import model.Circulo;
import model.IFormaGeometrica;
import model.Quadrado;
import model.Retangulo;

public class FormaGeometricaMain {

	public static void main(String[] args) {
		IFormaGeometrica circulo = new Circulo();
		
		// cast
		//((classe concreta)circulo)		
		((Circulo)circulo).raio = 40;
		System.out.println("Circulo: area -> " + circulo.area());
		System.out.println("Circulo: comprimento -> " + circulo.comprimento());
		
		Quadrado quadrado = new Quadrado();
		quadrado.comprimento = 10;
		quadrado.largura = 10;
		
		System.out.println("Quadrado: area -> " + quadrado.area());
		
		Retangulo retangulo = new Retangulo();
		retangulo.comprimento = 20;
		retangulo.largura = 10;
		
		System.out.println("Retangulo: area -> " + retangulo.area());
	}

}
