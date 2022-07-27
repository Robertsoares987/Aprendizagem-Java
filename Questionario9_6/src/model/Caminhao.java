package model;

public class Caminhao extends Veiculo {
	private int eixos;

	public Caminhao(String placa, int ano, int eixos) {
		super(placa, ano);
		this.eixos = eixos;
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}

	public void exibirDador() {
		System.out.println(
				"Caminhao \nPlaca = " + this.getPlaca() + "\nAno = " + this.getAno() + "\nEixos = " + this.getEixos());
	}
}