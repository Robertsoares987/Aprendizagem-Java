package model;

public class ContaImposto extends ContaBancaria {

	private float percentualImposto;
	
	public ContaImposto(float saldo, long numeroConta, String cpf,
							float  percentualImposto) {
		
		super(saldo, numeroConta, cpf);
		
		this.percentualImposto = percentualImposto;		
	}
	
	public float calcularImposto(){
		return super.getSaldo() * this.percentualImposto;
	}
}
