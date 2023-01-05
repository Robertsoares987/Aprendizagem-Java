package model;

public class Divisao implements IOperacaoMatematica {

	@Override
	public int calcula(int a, int b) {
		return a/b;
	}

}
