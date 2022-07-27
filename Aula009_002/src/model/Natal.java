package model;

public class Natal extends CartaoWeb{

	public Natal(){		
	}
	
	public Natal (String destinatario){
		super.destinatario = destinatario;
	}
	
	@Override
	public void showMessage() {
		System.out.println("Feliz Natal " + destinatario);
	}
}
