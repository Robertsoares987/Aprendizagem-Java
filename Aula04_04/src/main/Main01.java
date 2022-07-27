package main;

import model.Horario;

public class Main01 {

	public static void main(String[] args) {
		Horario horario = new Horario(20, 35);
		
		System.out.println("Hora " + horario.getHora());
		System.out.println("Minuto " + horario.getMinuto());
		
		horario.setMinuto(37);
		
		System.out.println("Novo horario: " + 
				horario.getHora() + ":" + horario.getMinuto());
		
	}

}
