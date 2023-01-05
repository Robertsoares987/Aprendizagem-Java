package main;

import model.Peixe;

public class Main02 {

	public static void main(String[] args) {
		Peixe peixe = new Peixe("Nemo", 5, 0, "Amarelo", "aquatico",
				10, "Uma barbatana menor do que a outra");
		
		peixe.setVelocidadeMedia(25);
		
		peixe.dadosPeixe();
	}
}
