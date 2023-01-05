package main02;

import model02.Endereco;
import model02.Pessoa;

public class main02 {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa( "robert", "056.045.301-90", null);
		
		pessoa.imprimir();
	
	
		pessoa.endereco = new Endereco();
		pessoa.endereco.longradouro = "quadra 44";
		pessoa.endereco.numero = "25";
		pessoa.endereco.complemento = "Del lago";
		pessoa.endereco.bairro= "Itapoa";
		pessoa.endereco.cidade="Brasilia";
		pessoa.endereco.cep="71591370";
		
		pessoa.endereco.imprimir();
	}

}
