package model;

public class Animal {
	private String nome;
	private String cor;
	private int quantidadePatas;
	private float velocidadeMedia;
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQuantidadePatas() {
		return quantidadePatas;
	}

	public void setQuantidadePatas(int quantidadePatas) {
		this.quantidadePatas = quantidadePatas;
	}

	public float getVelocidadeMedia() {
		return velocidadeMedia;
	}

	public void setVelocidadeMedia(float velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}
	
	public Animal() {		
	}
	
	public Animal(String nome, String cor, int quantidadePatas,
			float velocidadeMedia){
		this.nome = nome;
		this.cor = cor;
		this.quantidadePatas = quantidadePatas;
		this.velocidadeMedia = velocidadeMedia;
	}
}





