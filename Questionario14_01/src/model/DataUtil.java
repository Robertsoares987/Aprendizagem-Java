package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataUtil {

	public static String DataCorrente() {
		Calendar c = Calendar.getInstance();
		return ("Data corrente: " + c.getTime());
	}

	public static String AnoCorrente() {
		int c = Calendar.getInstance().getWeekYear();
		return ("Data corrente: " + c);
	}

	public static String MesCorrente() {
		Date Mes = Calendar.getInstance().getTime();
		String c = new SimpleDateFormat("MM").format(Mes);
		return ("Mês corrente: " + c);
	}

	public static String DiaDoMesCorrente() {
		Date diaMes = Calendar.getInstance().getTime();
		String c = new SimpleDateFormat("dd").format(diaMes);
		return ("Dia do mês corrente: " + c);
	}

	public static String HoraCorrente() {
		Date hora = Calendar.getInstance().getTime();
		String c = new SimpleDateFormat("HH").format(hora);
		return ("Hora corrente: " + c);
	}

	public static String MinutoCorrente() {
		Date Minuto = Calendar.getInstance().getTime();
		String sdf = new SimpleDateFormat("mm").format(Minuto);
		return ("Minuto corrente: " + sdf);
	}

	public static String SegundoCorrente() {
		Date segundo = Calendar.getInstance().getTime();
		String c = new SimpleDateFormat("ss").format(segundo);
		return ("Segundo corrente: " + c);
	}

}
