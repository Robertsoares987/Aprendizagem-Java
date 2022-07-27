package util;

public class Conversor {
	public static float MinutoSegundos(float minutos) {
		return (minutos*60);
	}
	public static float horasMinuto(float hora) {
		return (hora*60);
	}
	public static float diasHoras(float dias) {
		return (dias*24);
	}
	public static float semanaDias(float semana) {
		return (semana*7);
	}
	public static float mesDias(float mes) {
		return (mes*30);
	}
	public static float anoDias(float ano) {
		return (ano*365);
	}
}
