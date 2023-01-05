package model;

public class Onibus extends Veiculo {

	private int assentos;

	public Onibus(String placa, int ano, int assentos) {
		super(placa, ano);
		this.assentos = assentos;
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}

	public void exibirDador() {
		System.out.println("Onibus \nPlaca = " + this.getPlaca() + "\nAno = " + this.getAno() + "\nAssentos = "
				+ this.getAssentos() + "\n");
	}

}