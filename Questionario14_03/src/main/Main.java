
package main;

import java.util.ArrayList;

import java.util.List;

import model.Aluno;

import model.Professor;

import model.Turma;

public class Main {

	public static void main(String[] args) {

		Turma turma = new Turma();
		Professor professor = new Professor();

		System.out.println("------------Bem-vindo a turma de TSI------------");

		turma.setCodigo("00001");

		turma.setSala("01");

		turma.setHorario("19h");

		professor.setNome("Gustavo");

		professor.setTitulcao("Doutor");

	
		System.out.println(turma.toString());

		System.out.println(professor.toString());
		
		System.out.println("------------Lista de alunos------------");
	
		List<Aluno> lista = new ArrayList<Aluno>();
		

		Aluno aluno = new Aluno();

		aluno.setNome("Ana");

		aluno.setMatricula(001);

		lista.add(aluno);

	 aluno = new Aluno();

		aluno1.setNome("Bruno");

		aluno1.setMatricula(002);

		lista.add(aluno1);

		Aluno aluno2 = new Aluno();

		aluno2.setNome("Carlos");

		aluno2.setMatricula(003);

		lista.add(aluno2);

		Aluno aluno3 = new Aluno();

		aluno3.setNome("Francisco");

		aluno3.setMatricula(004);

		lista.add(aluno3);

		Aluno aluno4 = new Aluno();

		aluno4.setNome("Gustavo");

		aluno4.setMatricula(005);

		lista.add(aluno4);

		
		for (int i = 0; i < lista.size(); i++) {

			System.out.println(lista.get(i).toString());

		

		}

	}

}