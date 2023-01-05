package main;

import util.Conversor;

public class Main001_06 {

	public static void main(String[] args) {

		System.out.println("convertendo minutos para segundos " + Conversor.MinutoSegundos(2));
		System.out.println("convertendo horas para minutos " + Conversor.horasMinuto(2));
		System.out.println("convertendo dias para horas " + Conversor.diasHoras(2));
		System.out.println("convertendo semana para dias " + Conversor.semanaDias(2));
		System.out.println("convertendo mês para dias " + Conversor.mesDias(2));
		System.out.println("convertendo ano para dias " + Conversor.anoDias());
	}

}
