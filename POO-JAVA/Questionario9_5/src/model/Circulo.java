package model;

public class Circulo extends Figura {
	private double raio;

	public Circulo() {

	}

	public Circulo(double raio, String cor) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double area() {
		return 2 * this.getRaio() * (Math.PI);
	}

	public double getDiametro() {
		return this.getRaio() * 2;
	}

	@Override
	public String toString() {
		return "Circulo \nRaio  = " + getRaio() + "\nDiametro = " + getDiametro() + "\nArea = " + area() + "\nCor = "
				+ getCor() + "\n";
	}

}