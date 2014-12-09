package spielwiese;

public class ScriptUnterricht {

	public static void main(String[] args) {

		int[] noten = {0, 7, 8, 3, 1, 0};
		int summeNoten = 0;
		int anzahlSchueler = 0;
		float durchschnittsnote;
		int beste = 0;

		for (int i = 0; i < noten.length; i++) {
			summeNoten = summeNoten + (noten[i] * (i + 1));
			anzahlSchueler = anzahlSchueler + noten[i];
		}
								
		durchschnittsnote = (float) summeNoten / anzahlSchueler;
		
//		for (int i = 0; i < noten.length; i++)
		if (noten [0] > 0){
			beste = 1;
		}
		else if (noten [1] > 0){
			beste = 2;
		}		
		else if (noten [2] > 0){
			beste = 3;
		}		
		else if (noten [3] > 0){
			beste = 4;
		}		
		else if (noten [4] > 0){
			beste = 5;
		}		
		else {
			beste = 6;
		}
		
		
		System.out.println("Die beste Note ist eine " + beste);
		System.out.println("Der Durchschnitt ist: " + durchschnittsnote);

	}
}