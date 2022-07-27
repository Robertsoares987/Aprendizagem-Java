package model;

public class Quadrado extends Retangulo {

	public Quadrado() {

	}

	public Quadrado(double lado1, double lado2, String cor) {

		super(cor, lado2, lado1);

	}

	@Override
	public String toString() {
		return "Quadrado \nLado 1 = " + getLado1() + "\nLado2 = " + getLado2() + "\nArea = " + area() + "\nCor = "
				+ getCor() + "\n";
	}

}