package model;

public class Multiplicacao implements IOperacaoMatematica {

	@Override
	public int calcula(int a, int b) {
		return a*b;
	}

}
