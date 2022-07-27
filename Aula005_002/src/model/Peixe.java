package model;

public class Peixe extends Animal {
	private String caracteristica;
	
	public String getCaracteristica(){
		return this.caracteristica;
	}
	
	public void setCaracteristica(String caracteristica){
		this.caracteristica = caracteristica;
	}
	
	public Peixe(){		
	}
	
	public Peixe(String nome, String cor,
			int quantidadePatas, float velocidadeMedia,
			String caracteristica){
		super(nome, cor, quantidadePatas, velocidadeMedia);
		this.caracteristica = caracteristica;
	}
}

