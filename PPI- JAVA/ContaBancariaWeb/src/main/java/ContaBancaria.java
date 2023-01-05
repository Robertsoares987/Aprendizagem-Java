
public class ContaBancaria {
	private int saldo;  // valor eh zero
	private Cliente cliente;
	private int id;
	private static int contador;

	public ContaBancaria(Cliente cliente) {
		this.id = ++contador;
		this.cliente = cliente;
	}

	public int getSaldo() {
		return saldo;
	}

	public int depositar(int valorDeposito) {
		if (valorDeposito >= 0) {
			saldo += valorDeposito;
		}
		return saldo;		
	}

	public int sacar(int valorSaque) {
		if (valorSaque >= 0 && valorSaque <= saldo) {
			saldo -= valorSaque;
		}
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public int getId() {
		return id;
	}

}
