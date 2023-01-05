package model;

public class Aniversario extends CartaoWeb{

	public Aniversario(){		
	}
	
	public Aniversario(String destinatario){
		super.destinatario = destinatario;
	}
	
	@Override
	public void showMessage() {
		System.out.println("Feliz aniversário " + destinatario);
	}
}
