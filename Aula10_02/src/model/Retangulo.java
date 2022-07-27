package model;

public class Retangulo implements IFormaGeometrica {

	public double largura;
	public double comprimento;
	
	@Override
	public double area() {
		return this.largura * this.comprimento;
	}

	@Override
	public double comprimento() {
		return comprimento;
	}

}
