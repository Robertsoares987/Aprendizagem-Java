package main;

import model.Animal;

public class Main01 {

	public static void main(String[] args) {
		Animal animal = new Animal( "Fofão", 30F, 4, 
							"caramelo", "domestico", 20 );
		
		animal.setNome("Fofinho");
		animal.setVelocidadeMedia(30);
		
		System.out.println(animal.getNome());
		
		animal.imprimir();
	}

}
