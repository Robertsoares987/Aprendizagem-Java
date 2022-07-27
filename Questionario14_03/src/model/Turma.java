package model;

public class Turma {
	
	private String codigo;
	private String sala;
	private String horario;
	public String getCodigo() {

		return codigo;

	}

	public void setCodigo(String codigo) {

		this.codigo = codigo;

	}

	public String getSala() {

		return sala;

	}

	public void setSala(String sala) {

		this.sala = sala;

	}

	public String getHorario() {

		return horario;

	}

	public void setHorario(String horario) {

		this.horario = horario;

	}

	@Override

	public String toString() {

		return "Sala = " + sala +"\nCodigo = " + codigo +  "\nHorário = " + horario;

	}

}
