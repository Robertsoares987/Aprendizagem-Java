package model;

public class Peixe extends Animal {
	
	private String caracteristica;
	
	public void setCaracteristica(String caracteristica){
		this.caracteristica = caracteristica;
	}
	
	public String getCaracteristica(){
		return caracteristica;
	}
	
	public void setVelocidadeMedia(float velocidadeMedia){
		super.setVelocidadeMedia(velocidadeMedia + 1);
	}
	
	public Peixe(String nome, float comprimento, int numeroPatas, 
			String cor, String ambiente, 
			float velocidadeMedia, String caracteristica){
		
		super(nome, comprimento, numeroPatas, 
				cor, ambiente, velocidadeMedia);
		
		this.caracteristica = caracteristica;
	}
	
	public void dadosPeixe(){
		super.imprimir();
		
		System.out.println("caracteristica: " + this.caracteristica);
	}
}
