
public class Auto {

	private String farbe;
	private String kennzeichen;
	private double hubraum;
	private int sitzplaetze;
	private String fNr;
	
	
	
	public String getfNr() {
		return fNr;
	}
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	public String getKennzeichen() {
		return kennzeichen;
	}
	public void setKennzeichen(String kennzeichen) {
		this.kennzeichen = kennzeichen;
	}
	public double getHubraum() {
		return hubraum;
	}
	public void setHubraum(double hubraum) {
		this.hubraum = hubraum;
	}
	public int getSitzplaetze() {
		return sitzplaetze;
	}
	public void setSitzplaetze(int sitzplaetze) {
		this.sitzplaetze = sitzplaetze;
	}
	
	public Auto(String farbe, String kennzeichen, double hubraum, int sitzplaetze, String fNr) {
		this.farbe = farbe;
		this.kennzeichen = kennzeichen;
		this.hubraum = hubraum;
		this.sitzplaetze = sitzplaetze;
		this.fNr = fNr;
		}
	
	public Auto (String fNr){
		this (null, null, 0.0, 0, fNr); //Rest wird standardmässig an die andere dazu passende Klasse übergeben, nur fNr wird gesetzt und die anderen bekommen standard Werte
		
	}
}
