package model;

public class ContadorDePessoas {

	public int limitePessoas; 

	public int qtdePresentes = 0; 

	public int qtdeTotal = 0; 

	int qtd = 0;

	public ContadorDePessoas(int limite) {

		this.limitePessoas = limite;

	}

	public void registraEntrada(int quantidade) {

		if (qtdePresentes < limitePessoas) {

			qtd = quantidade;

			if (qtd + qtdePresentes > limitePessoas || qtd < 0) {

				System.out.println("Erro! Não é permitido ultrapassar o limite de pessoas! "
						 + (qtd + qtdePresentes)
						+ " informados, máximo de " + limitePessoas);

			}

			else {

				qtdePresentes += qtd;

				qtdeTotal += qtd;

			}

		}

		else {

			System.out.println("Limite atingido. Não é permitido ultrapassar o limite de pessoas.");

		}

	}

	public void registraSaida(int quantidade) {
		
		qtd = quantidade;

		if (qtdePresentes - qtd < 0) {

			System.out.println("Erro! Não há número negativo para quantidade de pessoas. "
					+ (qtd - qtdePresentes) + );

		}

		else if (qtd < 0) {

			System.out.println("Erro! Não há número negativo para quantidade de pessoas. "
					+ (qtd - qtdePresentes) );
		}

		else {
			qtdePresentes -= qtd;

		}

	}

	public void mostrarRelatorio() {
		System.out.println("Há " + qtdePresentes + " pessoas presentes no restaurante.");

		System.out.println("Recebemos " + qtdeTotal + " pessoas no restaurante.");

	}

}