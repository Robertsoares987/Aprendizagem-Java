package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CadastroCliente {

	public List<Cliente> clientes;

	public CadastroCliente() {
		clientes = new ArrayList<Cliente>();

	}

	public void adicionarClientes(String cpf, String nome, String dataNasc, String endereco) {
		Cliente cliente = new Cliente(cpf, nome, dataNasc, endereco);
		clientes.add(cliente);
	}

	public void ordenarListaCpf() {
		Collections.sort(clientes);
	}

	public void imprimir() {
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
	}

}
