package Weihnachtsbaum;

public class Weihnachtsbaum {

	private double groesse;

	
	
	public double getGroesse() {
		return groesse;
	}
	
	
	//Constructor sind zum setzen der Atribute zuständig bzw weisst werte zu
	
	public Weihnachtsbaum(){
		
		groesse = (int)(110+Math.random()*70) / 100.;
		
	}
}
