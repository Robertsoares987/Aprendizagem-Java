package model;

public class Quadrado implements IFormaGeometrica {

	public double largura;
	public double comprimento;
	
	@Override
	public double area() {
		return this.largura * comprimento;
	}

	@Override
	public double comprimento() {
		return comprimento;
	}
}
