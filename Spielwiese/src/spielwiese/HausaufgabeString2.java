package spielwiese;

public class HausaufgabeString2 {

	public static void main(String[] args) {

		String a = "Hallo, ich bin der fest vorgegebene Text."; //Vorgegebener Text
		String b = "";											//Variable in die Text hineigeschrieben wird
		int lWort = 0;											//Variable die immer die länge eines Wortes + Leerzeichen übergeben bekommt
											
		for (int i = 0; i < a.length(); i++) {					//Durchläuft den String "a" in kompletter Länge der Zeichenkette 
			if (a.charAt(i) == ' ') {							//bei Leerzeichen in Zeichenkette
				for (int j = i - 1; j >= lWort; j--) {			//Durchlaufe den String "a" rückwärts ab dem Zeichen vor dem Leerzeichen und schreibe das in "b" bis zu der Stelle von "lWort".
					b = b + a.charAt(j);						//hier werden die Zeichen von "a" in "b" geschrieben
				}
				b = b + " ";									//Leerzeichen an geschriebenes Wort anhängen
				lWort = b.length();								//lWort wird auf die länge von "b" gesetzt, also hinter das Leerzeichen.
			}
		}

		for (int k = a.length() - 1; k >= lWort; k--) {			//Progr. kommt nun an diese Stelle da am Ende von "a" kein Leerzeichen mehr kommt
			b = b + a.charAt(k);								//letztes Wort wird geschrieben
		}
		System.out.println(b);									//String "b" wird ausgegeben
	}
}
