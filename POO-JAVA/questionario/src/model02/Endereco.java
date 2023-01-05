package model02;

public class Endereco {
	public String longradouro;
	public String numero;
	public String complemento;
	public String bairro;
	public String cidade;
	public String cep;
	
	public Endereco() {
		
	}
	
	public Endereco(String longradouro, String numero, String complemento, 
					String bairro,String cidade,String cep) {
		
		this.longradouro = longradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro= bairro;
		this.cidade= cidade;
		this.cep= cep;
	}
	
	public void imprimir() {
		System.out.println(this.longradouro + ", " +  this.numero+ ", "  +  this.complemento
				+ ", " +  this.bairro + ", " +  this.cidade + ", " +  this.cep);
		
	}
	
}