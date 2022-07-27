package main;

import model.Circulo;
import model.Figura;
import model.Quadrado;
import model.Retangulo;
import model.Triangulo;

public class Main {

	public static void main(String[] args) {

		Figura retangulo = new Retangulo("Cinza", 10, 20);
		retangulo.setCor("Cinza");
		System.out.println(retangulo);

		Figura triangulo = new Triangulo(10, 20, "Azul");
		triangulo.setCor("Azul");
		System.out.println(triangulo);

		Figura quadrado = new Quadrado(10, 10, "Marrom");
		quadrado.setCor("Marrom");
		System.out.println(quadrado);

		Figura circulo = new Circulo(7, "Verde");
		circulo.setCor("Roxo");
		System.out.println(circulo);

	}

}