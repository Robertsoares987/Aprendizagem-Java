package main;

import java.util.Scanner;

import model.CadastroCliente;
import model.Cliente;

public class ClienteMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		CadastroCliente cadastroCliente = new CadastroCliente();

		for (int i = 0; i < 3; i++) {
			System.out.println("Insira CPF: ");
			String cpf = scan.next();
			System.out.println("Insira nome: ");
			String nome = scan.next();
			System.out.println("Insira a data de nascimento: ");
			String dataNasc = scan.next();
			System.out.println("Insira o endereço: ");
			String endereco = scan.next();
			System.out.println("------------------------------- ");

			cadastroCliente.adicionarClientes(cpf, nome, dataNasc, endereco);
		}
		cadastroCliente.ordenarListaCpf();

		cadastroCliente.imprimir();

	}

}
