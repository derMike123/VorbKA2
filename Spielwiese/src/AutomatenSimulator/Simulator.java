package AutomatenSimulator;
import java.util.Scanner;
public class Simulator {

	public static void main(String[] args) {
		
		Automat ersterAutomat = new Automat();	 	//Ein Automat wird erzeugt und er hat automatisch den Zustand 1, wie in Klasse Simulator eingestellt
		Scanner scanner = new Scanner (System.in); 	//hier wird auf eingabe gewartet, java.util bedeutet das der namensraum also Scanner bereitgestellt wird.
		
		for (;true;)	{							//(zählvariable, abbruchbedingung, zählewrt) "true" weil, Schleife läuft solange der wert WAHR ist, dh. ist die Abbruchbedingung erreicht wird Schleife abgebrochen
		
			String eingabe = scanner.next();		//wartet auf zeicheneingabe
			
			if (eingabe.equals("Ende")){
				break;								//wenn "Ende" eingegeben wird dann wird das break ausgeführt, if ist keine Schleife, also wird die for Schleife von dem break beendet, und somit die Abfrage und das Programm.
			}
				
			ersterAutomat.schalten (eingabe.charAt(0));
			
			
		}
		
	}

}
