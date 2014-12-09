package spielwiese;

public class HausaufgabeString3 {

	public static void main(String[] args) {
	

		
		
		
		String a = "Hallo, ich bin der fest vorgegebene Text."; //vorgegebener String a
		String b =""; 											// Noch Platzhalter für den später gedrehten String b
		int tmp = 0; 											//temporäre veränderbare Variable für die Länge eines Wortes + Leerzeichen
		
  		for (int i = 0; i < a.length(); i++) { 					//durchlaufe den kompletten String a
   			if (a.charAt(i) == ' ') {							//finde ein Leerzeichen
 				for (int j = i - 1; j >= tmp; j--) 				//durchlaufe den String a vor dem Leerzeichen rueckwaerts, bis zu der Stelle die in tmp gespeichert ist.
																//beim ersten Wort bis 0, beim zweiten Wort 7 etc.pp. (siehe Debug)
 					b = b + a.charAt(j); 						//schreibe in String b die Zeichen auf, die von a kommen
					b +=  " "; 									//setze ein Leerzeichen nach dem Wort
				}
   				tmp = b.length(); 								//speichert in tmp die aktuelle Stelle des Durchlaufes +1 (wegen Leerzeichen)
				
			}
		
		for (int i = a.length()-1; i >= tmp; i--) { 			//durchlaufe den String vom Ende bis Stelle tmp (da kein Leerzeichen am Ende des letzten Wortes)
			b += a.charAt(i); 									//schreibe das letzte Wort
			
		}
		
		//einzelne Wörter ersetzen
		CharSequence z =",ollaH"; 								//zu ersetzendes Wort
		CharSequence y ="Ollah,"; 								//ersetzendes Wort
		CharSequence x =".txeT"; 								//zu ersetzendes Wort
		CharSequence v ="Txet."; 								//ersetzendes Wort
		String c = b.replace(z,y); 								//neuer String: ersetze mit der Methode replace() z durch y
		String d = c.replace(x, v);								//nochmal neuer String da die replace Methode nur einmal ersetzt (würde sonst vorherige replace() Methode überschreiben) ersetze x durch v 
		
		System.out.println(a + "\n" + d); 						//Ausgabe fertigen String d	"Ollah, hci nib red tsef enebegegrov Txet."
		
	}

}
