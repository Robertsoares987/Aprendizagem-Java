package model;

public class CartaoAniversario extends CartaoWeb {

	public CartaoAniversario(String destinatario) {
		super(destinatario);
	}

	@Override
	public void showMessage() {
		System.out.println("Feliz aniversário " + super.destinatario);
	}
}
