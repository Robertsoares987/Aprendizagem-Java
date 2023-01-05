package main;

import java.util.Scanner;

public class Main0018 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira o valor do salario fixo.");
		int salarioFixo = scan.nextInt();
		System.out.println("Insira o valor total de vendas.");
		int vendas = scan.nextInt();
		if (vendas <= 1500) {
			
			System.out.println("O salario total é R$ "
			+(salarioFixo+( vendas *0.03)));

		} else if(vendas>1500) {
		int vendaMaior= (vendas-1500);
		System.out.println(salarioFixo+ (vendaMaior*0.05)+((vendas-vendaMaior)*0.03));
		}
	}

}
