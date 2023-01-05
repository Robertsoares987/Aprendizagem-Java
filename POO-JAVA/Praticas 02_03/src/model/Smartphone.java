package model;

public class Smartphone extends Computador {
	private String tamanhoDeTela;
	private String densidadePixels;
	private String operadora;

	public String getTamanhoDeTela() {
		return tamanhoDeTela;
	}

	public void setTamanhoDeTela(String tamanhoDeTela) {
		this.tamanhoDeTela = tamanhoDeTela;
	}

	public String getDensidadePixels() {
		return densidadePixels;
	}

	public void setDensidadePixels(String densidadePixels) {
		this.densidadePixels = densidadePixels;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public String trocarOperadora(String novaOperadora) {
		this.operadora = novaOperadora;
		return this.operadora;
	}

	public Smartphone(String fabricante, String processador, String memoriaPrincipal, String memoriaSecundaria,
			String tamanhoDeTela, String densidadePixels, String operadora) {
		super(fabricante, processador, memoriaPrincipal, memoriaSecundaria);
		this.tamanhoDeTela = tamanhoDeTela;
		this.densidadePixels = densidadePixels;
		this.operadora = operadora;
	}

	@Override
	public String toString() {
		return "Smartphone [tamanhoDeTela=" + tamanhoDeTela + ", densidadePixels=" + densidadePixels + ", operadora="
				+ operadora + ", fabricante= " + super.getFabricante() + ", processador = " + super.getProcessador()
				+ ", memoriaPrincipal= " + super.getMemoriaPrincipal() + ", memoriaSecundaria= "
				+ super.getMemoriaSecundaria() + "]";
	}

}
