package model;

public class Cliente implements Comparable<Cliente> {
	private String cpf;
	private String nome;
	private String dataNasc;
	private String endereco;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Cliente(String cpf, String nome, String dataNasc, String endereco) {
		this.cpf = cpf;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.endereco = endereco;
	}

	@Override
	public int compareTo(Cliente temp) {
		return String.valueOf(this.getCpf()).compareToIgnoreCase(String.valueOf(temp.getCpf()));
	}

	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", dataNasc=" + dataNasc + ", endereco=" + endereco + "]";
	}

}
