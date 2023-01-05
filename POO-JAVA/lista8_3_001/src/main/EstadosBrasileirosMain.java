package main;

import model.EstadosBrasileiros;

public class EstadosBrasileirosMain {

	public static void main(String[] args) {
		System.out.println("---------Estados brasileiros da Região Norte----------");
		System.out.println(EstadosBrasileiros.RegiaoNorte.Acre);
		System.out.println(EstadosBrasileiros.RegiaoNorte.Amazonas);
		System.out.println(EstadosBrasileiros.RegiaoNorte.Amapa);
		System.out.println(EstadosBrasileiros.RegiaoNorte.Para);
		System.out.println(EstadosBrasileiros.RegiaoNorte.Rondonia);
		System.out.println(EstadosBrasileiros.RegiaoNorte.Roraima);
		System.out.println(EstadosBrasileiros.RegiaoNorte.Tocantins);

		System.out.println("\n---------Estados brasileiros da Região Nordeste----------");
		System.out.println(EstadosBrasileiros.RegiaoNordeste.Maranhao);
		System.out.println(EstadosBrasileiros.RegiaoNordeste.Piaui);
		System.out.println(EstadosBrasileiros.RegiaoNordeste.Ceara);
		System.out.println(EstadosBrasileiros.RegiaoNordeste.RioGrandedoNorte);
		System.out.println(EstadosBrasileiros.RegiaoNordeste.Paraiba);
		System.out.println(EstadosBrasileiros.RegiaoNordeste.Pernambuco);
		System.out.println(EstadosBrasileiros.RegiaoNordeste.Alagoas);
		System.out.println(EstadosBrasileiros.RegiaoNordeste.Sergipe);

		System.out.println("\n---------Estados brasileiros da Região Centro-Oeste--------");
		System.out.println(EstadosBrasileiros.RegiaoCentroOeste.Goias);
		System.out.println(EstadosBrasileiros.RegiaoCentroOeste.MatoGrosso);
		System.out.println(EstadosBrasileiros.RegiaoCentroOeste.MatoGrossodoSul);
		System.out.println(EstadosBrasileiros.RegiaoCentroOeste.DistritoFederal);

		System.out.println("\n---------Estados brasileiros da Região Sudeste----------");
		System.out.println(EstadosBrasileiros.RegiaoSudeste.EspiritoSanto);
		System.out.println(EstadosBrasileiros.RegiaoSudeste.MinasGerais);
		System.out.println(EstadosBrasileiros.RegiaoSudeste.RiodeJaneiro);
		System.out.println(EstadosBrasileiros.RegiaoSudeste.SaoPaulo);

		System.out.println("\n---------Estados brasileiros da Região Sul--------------");
		System.out.println(EstadosBrasileiros.RegiaoSul.Parana);
		System.out.println(EstadosBrasileiros.RegiaoSul.SantaCatarina);
		System.out.println(EstadosBrasileiros.RegiaoSul.RioGrandedoSul);

	}

}
