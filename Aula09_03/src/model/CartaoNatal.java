package model;

public class CartaoNatal extends CartaoWeb {
	
	public CartaoNatal(String destinatario) {
		super(destinatario);
	}

	@Override
	public void showMessage() {
		System.out.println("Feliz natal " + super.destinatario);
	}
}
