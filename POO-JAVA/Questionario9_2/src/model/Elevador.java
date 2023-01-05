package model;

public class Elevador {
	private int andarAtual;
	private int totalAndares;
	private int capacidadePessoasNoElevador;
	private int qtdPessoasNoElevador;

	public Elevador() {

	}

	public void inicializar(int capacidadeElevador, int totalAndares) {
		this.capacidadePessoasNoElevador = capacidadeElevador;
		this.totalAndares = totalAndares;
//		totalAndares = 4;
//		capacidadeElevador = 5;
	}

	public void entrar(int qtdPessoasDesejamEntrar) {
		if (this.qtdPessoasNoElevador + qtdPessoasDesejamEntrar <= this.capacidadePessoasNoElevador) {
			this.qtdPessoasNoElevador += qtdPessoasDesejamEntrar;
		} else {
			System.out.println("Limite excedido.");
		}
	}

	public void subir(int andarDesejadoSubir) {
		if (this.andarAtual + andarDesejadoSubir <= this.totalAndares) {
			this.andarAtual += andarDesejadoSubir;
		} else {
			System.out.println("Erro! Andar não existe.");
		}
	}

	public void sair(int qtdPessoasParaSair) {
		if (this.qtdPessoasNoElevador - qtdPessoasParaSair >= 0) {
			this.qtdPessoasNoElevador -= qtdPessoasParaSair;
		} else {
			System.out.println("Não há pessoas para desembarque.");

		}
	}

	public void descer(int andarDesejadoParaDescer) {
		if (this.andarAtual - andarDesejadoParaDescer >= 0) {
			this.andarAtual -= andarDesejadoParaDescer;
			System.out.println("Descendo para o " + andarDesejadoParaDescer + "° andar");
		} else {
			System.out.println("Erro! Andar não existe.");
		}
	}

}