package model;

public class Professor implements IColaborador{

	@Override
	public double obtemSalario() {
		return IColaborador.valorBaseHora * cargaHoraria();
	}

	@Override
	public double cargaHoraria() {
		return 20;
	}
}
