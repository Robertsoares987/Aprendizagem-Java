package main;

import model.IColaborador;
import model.Professor;
import model.Diretor;
import model.Coordenador;

public class ColaboradorMain {

	public static void main(String[] args) {
		IColaborador professor = new Professor();
		System.out.println("Salario do professor: " + professor.obtemSalario());
		
		IColaborador diretor = new Diretor();
		System.out.println("Salario do diretor: " + diretor.obtemSalario());
		
		Coordenador coordenador = new Coordenador();
		System.out.println("Salario do diretor: " + coordenador.obtemSalario());

	}

}
