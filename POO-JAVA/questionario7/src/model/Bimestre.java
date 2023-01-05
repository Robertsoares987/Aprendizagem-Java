package model;

public class Bimestre {

	private String idbimestre;

	private Avaliacao av1;

	private Avaliacao av2;

	private Avaliacao av3;

	public String getIdbimestre() {

		return idbimestre;

	}

	public void setIdbimestre(String idbimestre) {

		this.idbimestre = idbimestre;

	}

	public Avaliacao getAv1() {

		return av1;

	}

	public void setAv1(Avaliacao av1) {

		this.av1 = av1;

	}

	public Avaliacao getAv2() {

		return av2;

	}

	public void setAv2(Avaliacao av2) {

		this.av2 = av2;

	}

	public Avaliacao getAv3() {

		return av3;

	}

	public void setAv3(Avaliacao av3) {

		this.av3 = av3;

	}

	public void imprimirAvaliacoes() {

		System.out.println(av1.getInfo());

		System.out.println(av2.getInfo());

		System.out.println(av3.getInfo());

	}

}
