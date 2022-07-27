package main;

import model.Animal;
import model.Peixe;

public class Main01 {

	public static void main(String[] args) {
		Animal animal = new Animal("Pequeno", "preto", 4, 20);
		
		System.out.println(animal.getNome());
		
		animal.setNome("Valente"); 
		
		System.out.println(animal.getNome());
		
		//// criando um peixe
		
		Peixe peixe = new Peixe("Nemo", "amarelo", 0, 25, 
				"barbatana pequena");
		
		System.out.println(peixe.getNome());

		peixe.setNome("Tutubarão");
		
		System.out.println(peixe.getNome());
	}

}




