package model;

public class Coordenador implements IColaborador {
	
	@Override
	public double obtemSalario() {
		return IColaborador.valorBaseHora * cargaHoraria();
	}

	@Override
	public double cargaHoraria() {
		return 30;
	}
}
