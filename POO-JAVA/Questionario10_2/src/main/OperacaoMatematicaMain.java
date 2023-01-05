package main;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.IOperacaoMatematica;

public class OperacaoMatematicaMain {
	private static Dialog d;

	OperacaoMatematicaMain() {
		Frame f = new Frame();
		d = new Dialog(f, "Dialog Example", true);
		d.setLayout(new FlowLayout());

		Button b = new Button("Somar");
		b.addActionListener(new ActionListener()

		{
			public void actionPerformed(ActionEvent e) {
				int resultado = 0;

				for (Object item : OperacaoMatematicaMain.d.getComponents()) {

					if (item instanceof TextField) {
						resultado += Integer.parseInt(((TextField) item).getText());
					}
				}

				for (Object item : OperacaoMatematicaMain.d.getComponents()) {

					if (item instanceof Label && ((Label) item).getName().equals("resultado")) {
						((Label) item).setText(String.valueOf(resultado));
					}
				}

				// OperacaoMatematicaMain.d.setVisible(false);
			}
		});

		TextField valor1 = new TextField();
		valor1.setText("Digite um valor aqui");

		TextField valor2 = new TextField();
		valor2.setText("Digite um valor aqui");

		d.add(valor1);
		d.add(valor2);

		d.add(new Label("Calcular "));

		Label resultado = new Label("");
		resultado.setName(" resultado");

		d.add(resultado);

		d.add(b);
		d.setSize(300, 300);
		d.setVisible(true);
	}

	public static void mostrarCalculo(IOperacaoMatematica operacao, int a, int b) {
		System.out.println("O resultado �: " + operacao.calcula(a, b));
	}

	public static void main(String args[]) {

		new OperacaoMatematicaMain();

		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * 
		 * 
		 * System.out.println("Digite 1 para soma: "); int opcao1 = scan.nextInt();
		 * 
		 * System.out.println("Digite 2 para subtra��o: "); int opcao2 = scan.nextInt();
		 * 
		 * if (opcao1 == 1) { OperacaoMatematicaMain.mostrarCalculo(new Soma(), 5, 5); }
		 * 
		 * if (opcao2 == 2) OperacaoMatematicaMain.mostrarCalculo(new Subtracao(), 5,
		 * 5);
		 */
	}

}

//int opcao1 = 1; // scan.nextInt();
