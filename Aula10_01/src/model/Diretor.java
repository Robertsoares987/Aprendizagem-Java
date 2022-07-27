package model;

public class Diretor implements IColaborador {
	
	@Override
	public double cargaHoraria(){
		return 40;
	}
	
	@Override
	public double obtemSalario(){
		return IColaborador.valorBaseHora * cargaHoraria();
	}
}
