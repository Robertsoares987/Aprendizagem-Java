package model;

public class Horario {
	public int hora;
	public int minuto;
	public int segundo;
	
	public Horario(){		
	}
	
	public Horario(int h){ 
		this(h, 0, 0); 	
	}
	
	public Horario(int h, int m) { 
		this(h, m, 0); 
	}
	
	public Horario(int h, int m, int s){
		this.hora = h;
		this.minuto = m;
		this.segundo = s;
	}
	
	public Horario (Horario horario){
		this(horario.hora, horario.minuto, horario.segundo);
	}
	
	public int getHora(){
		return this.hora;
	}
	
	public int getMinuto(){
		return this.minuto;
	}
	
	public int getSegundo(){
		return this.segundo;
	}
	
	public void setHorario(int h, int m, int s){
		this.hora = h;
		this.minuto = m;
		this.segundo = s;
	}
	
	public void setHora(int h){
		this.hora = h;
	}
	
	public void setMinuto(int m){
		this.minuto = m;
	}
	
	public void setSegundo(int s){
		this.segundo = s;
	}	
}
