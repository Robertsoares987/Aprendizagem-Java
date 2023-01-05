package model;

public class Subtracao implements IOperacaoMatematica{

	@Override
	public int calcula(int a, int b) {
		return a-b;
	}

}
