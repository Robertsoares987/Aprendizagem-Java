package model;

public class Circulo implements IFormaGeometrica {
	
	public static final float PI = 3.14F;
	
	public double raio;
	
	@Override
	public double area() {
		return this.PI * raio * raio;
	}
	
	@Override
	public double comprimento(){
		return 2 * this.PI * raio;
	}
}
