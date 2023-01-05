package model;

public class CartaoDiaDosNamorados extends CartaoWeb {

	public CartaoDiaDosNamorados(String destinatario) {
		super(destinatario);
	}

	@Override
	public void showMessage() {
		System.out.println("Feliz dias dos namorados " + super.destinatario);
	}
}
