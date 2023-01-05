package main;

import java.util.ArrayList;
import java.util.Scanner;

import model.Animal;
import model.Cachorro;
import model.Cavalo;
import model.Preguica;

public class TesteAnimais {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ArrayList<Animal> lista = new ArrayList<Animal>();
		String nome = null;
		int idade = 0;
		int tipoAnimal = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Qual é o nome do animal? ");
			nome = scan.next();

			System.out.println("Qual é a idade do animal? ");
			idade = scan.nextInt();

			System.out.println(
					"Digite o numero relacionado ao tipo de animal.\nCavalo = 1 , Cachorro = 2 , preguiça = 3");
			tipoAnimal = scan.nextInt();

			switch (tipoAnimal) {
			case 1:
				Animal cavalo = new Cavalo(nome, idade);
				lista.add(cavalo);
				break;
			case 2:
				Animal cachorro = new Cachorro(nome, idade);
				lista.add(cachorro);
				break;
			case 3:
				Animal preguica = new Preguica(nome, idade);
				lista.add(preguica);
				break;
			default:
				break;
			}

			for (Animal animal : lista) {
				System.out.print(animal.getNome() + ", " + animal.getIdade() + " anos, " + animal.emitirSom() + "\n");

			}

		}
	}
}
