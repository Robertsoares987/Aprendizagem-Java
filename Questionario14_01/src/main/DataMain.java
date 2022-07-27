package main;

import model.DataUtil;

public class DataMain {

	public static void main(String[] args) {
		DataUtil.DataCorrente();
		System.out.println(DataUtil.DataCorrente());
		System.out.println(DataUtil.AnoCorrente());
		System.out.println(DataUtil.MesCorrente());
		System.out.println(DataUtil.DiaDoMesCorrente());
		System.out.println(DataUtil.HoraCorrente());
		System.out.println(DataUtil.MinutoCorrente());
		System.out.println(DataUtil.SegundoCorrente());

	}

}
