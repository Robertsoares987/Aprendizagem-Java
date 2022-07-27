package model02;

public class Pessoa {

	public String nome;
	public String cpf;
	public Endereco endereco;
	
	public Pessoa() {
		
	}
	public Pessoa(String nome, String cpf, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	public void imprimir() {
		System.out.println(this.nome + " - " + this.cpf + " " + this.endereco);
	}
}
