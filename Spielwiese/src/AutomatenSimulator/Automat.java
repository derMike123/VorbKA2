package AutomatenSimulator;

public class Automat {

	private int zustand = 1;					// Startzustand

	public void schalten(char zeichen) {

		switch (zustand) {						//Switch case Abfrage für den Zustand 1

		case 1:
			switch (zeichen) {					//innerhalb des Zustands warten auf Tastendruck a oder b, bei anderen Fehler (default)
			case 'a':							//bei Tastendruck a 
				zustand = 2;					//wechseln in Zustand 2 
				System.out.println(zeichen);
				break;

			case 'b':
				zustand = 3;
				System.out.println(zeichen);
				break;

			default:
				System.out.println("Fehler");
				break;
			}
			break;

		case 2:
			switch (zeichen) {
			case 'z':
				zustand = 4;
				System.out.println(zeichen);
				break;

			default:
				System.out.println("Fehler");
			}
			break;

		case 3:
			switch (zeichen) {
			case 'a':
				zustand = 4;
				System.out.println(zeichen);
				break;

			case 'c':						
			case 'd':
				System.out.println(zeichen);
				break;
				
			default:
				System.out.println("Fehler");
				break;
			}
			break;

		case 4:											//Zustand 4 erreicht
			System.out.println("Ende");
		break;
		
		default:										//Default Wert für jeden anderen Zustand
			System.out.println("Falscher Zustand");
		
		}
		

	}

}