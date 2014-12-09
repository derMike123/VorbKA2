
public class TestKlasse {

	public static void main(String[] args) {
		
		String [][] daten = {
							{"blau",	"ABS S 123", 	"4.2", "1"},
							{"rot", 	"LL LL 133", 	"2.4", "2"},
							{"silber", 	"B CD 99 ", 	"6.8", "4"},
							{"schwarz", "SE X 69 ", 	"1.2", "2"},
							{"weiß", 	"OA XX 69", 	"3.0", "5"}
							};
	
	
	
	Auto [] autos = new Auto[daten.length];
	
		
	for (int i =0; i < daten.length; i++){	
		
	//	autos [i] = new Auto (daten[i][0], daten[i][1], Double.parseDouble(daten[i][2]), Integer.parseInt(daten[i][3]), "Ich bin eine Fahrgestellnummer");
		
		autos [i] = new Auto ("Ich bin eine Fahrgestellnummer");
			
		
		
		System.out.println(autos[i].getFarbe() + "\t" + autos[i].getKennzeichen() + "\t" + autos[i].getHubraum() + "\t" + autos[i].getSitzplaetze() + "\t" +autos[i].getfNr());
	}		

	}
}

