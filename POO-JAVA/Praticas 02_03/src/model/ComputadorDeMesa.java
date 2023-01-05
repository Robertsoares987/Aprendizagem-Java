package model;

public class ComputadorDeMesa extends Computador {
	private String fabricanteGabinete;
	private String tipoGabinete;
	private String fonte;

	public String getFabricanteGabinete() {
		return fabricanteGabinete;
	}

	public void setFabricanteGabinete(String fabricanteGabinete) {
		this.fabricanteGabinete = fabricanteGabinete;
	}

	public String getTipoGabinete() {
		return tipoGabinete;
	}

	public void setTipoGabinete(String tipoGabinete) {
		this.tipoGabinete = tipoGabinete;
	}

	public String getFonte() {
		return fonte;
	}

	public void setFonte(String fonte) {
		this.fonte = fonte;
	}

	public ComputadorDeMesa(String fabricante, String processador, String memoriaPrincipal, String memoriaSecundaria,
			String fabricanteGabinete, String tipoGabinete, String fonte) {
		super(fabricante, processador, memoriaPrincipal, memoriaSecundaria);
		this.fabricanteGabinete = fabricanteGabinete;
		this.tipoGabinete = tipoGabinete;
		this.fonte = fonte;
	}

	public String trocarFabricanteGabinete(String novoFabricanteGabinete) {
		return novoFabricanteGabinete;
	}

	public String trocarTipoGabinete(String novoTipoGabinete) {
		return novoTipoGabinete;
	}

	@Override
	public String toString() {
		return "ComputadorDeMesa [fabricanteGabinete=" + fabricanteGabinete + ", tipoGabinete=" + tipoGabinete
				+ ", fonte=" + fonte + "fabricante= " + super.getFabricante() + ", processador = "
				+ super.getProcessador() + ", memoriaPrincipal= " + super.getMemoriaPrincipal()
				+ ", memoriaSecundaria= " + super.getMemoriaSecundaria() + "]";
	}

}
