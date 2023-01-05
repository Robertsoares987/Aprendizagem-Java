package model;

public class ContaBancaria {
	private float saldo;
	private long numeroConta;
	private String cpf;
	
	public float getSaldo(){
		return this.saldo;
	}
	
	public ContaBancaria(float saldo, long numeroConta, String cpf){ 
		this.saldo = saldo;
		this.numeroConta = numeroConta;
		this.cpf = cpf;
	}
	
	public void depositar(float valor){
		this.saldo = this.saldo + valor;
	}
	
	public void sacar(float valor){
		this.saldo = this.saldo - valor;
	}
}
