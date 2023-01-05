
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

		aluno.setNome("Bruno");
		aluno.setMatricula(002);
		lista.add(aluno);

		aluno.setNome("Carlos");
		aluno.setMatricula(003);
		lista.add(aluno);

		aluno.setNome("Francisco");
		aluno.setMatricula(004);
		lista.add(aluno);
		
		aluno.setNome("Gustavo");
		aluno.setMatricula(005);
		lista.add(aluno);

		
		for (int i = 0; i < lista.size(); i++) {

			System.out.println(lista.get(i).toString());

		

		}

	}

}