package model;

import java.util.Calendar;

public class Mensagem {
	public String texto;
	
	public Mensagem(){		
	}
	
	public Mensagem(String texto){
		this.texto = texto;
	}
	
	public void escrever(){
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(this.texto + " " + calendar.getTime());
	}
}
