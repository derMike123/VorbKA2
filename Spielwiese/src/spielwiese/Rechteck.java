package spielwiese;

public class Rechteck {
	
	private int breite;
	private int hoehe;

	public static void main(String[] args) {

		Rechteck rechteck = new Rechteck();
		rechteck.setBreite(5);
		rechteck.setHoehe(4);

	System.out.println("Breite "+ rechteck.getBreite());
	System.out.println("hoehe " + rechteck.getHoehe());
		
	rechteck.zeichne();
	
	}

		public int getBreite() {
			return breite;
		}

		public void setBreite(int breite) {
			this.breite = breite;
		}

		public int getHoehe() {
			return hoehe;
		}

		public void setHoehe(int hoehe) {
			this.hoehe = hoehe;
		}

		public void zeichne() {
			
			for (int zaehler = 0; zaehler < hoehe; zaehler++){
				
				for (int zaehler2 = 0; zaehler2 < breite; zaehler2++){
					
					if (zaehler == 0) {
						System.out.print("X");
					}
						else if (zaehler == hoehe-1){
							System.out.print("X");
					}
						else {
							System.out.print(" ");
				}}
				
				
				if (zaehler == 0) {
					System.out.print("X");
				}
					else if (zaehler == hoehe-1){
						System.out.print("X");
					}
				
				System.out.print("\n");
				}
			 	
		}
		
			
		}
	
		
