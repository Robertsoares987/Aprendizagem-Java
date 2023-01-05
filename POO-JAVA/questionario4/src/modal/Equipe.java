package modal;

public class Equipe {
	public String nome;
	public float pontos;
	
	public Equipe() {
	}
	
	public void adicionarPontos(float pontos) {
		this.pontos = this.pontos  + pontos;
		//this.pontos +=  pontos;

	}
	public void removerPontos(float pontos) {
		this.pontos -= pontos;
	}
	
	public void Equipe1(String nome, float pontos) {
		this.nome = nome; 
		this.pontos= pontos;
	}
	public void Equipe2(String nome, float pontos) {
		this.nome = nome; 
		this.pontos= pontos;
	}
	public void Equipe3(String nome, float pontos) {
		this.nome = nome; 
		this.pontos= pontos;
	}
}