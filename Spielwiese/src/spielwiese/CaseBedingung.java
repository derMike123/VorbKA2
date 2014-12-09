package spielwiese;

import java.util.Scanner;

public class CaseBedingung {
	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Bitte Alter eingeben ");
		int alter = s.nextInt();

		
		
		switch (alter)		{
		
		case 1: 
			alter = 1;
			System.out.println("Größe = 50-74");
			break;
		
		case 2: 
			alter = 2;
			System.out.println("Größe = 81-92");
			break;
		
		case 3: 
			alter = 3;
			System.out.println("Größe = 93-98");
			break;
		
		case 4: 
			alter = 4;
			System.out.println("Größe = 99-104");
			break;
		
		case 5: 
			alter = 5;
			System.out.println("Größe = 105-110");
			break;
		
		case 6: 
			alter = 6;
			System.out.println("Größe = 111-116");
			break;
		
		case 7: 
			alter = 7;
			System.out.println("Größe = 117-122");
			break;
		
		case 8: 
			alter = 8;
			System.out.println("Größe = 123-128");
			break;
		
		case 9: 
			alter = 9;
			System.out.println("Größe = 129-134");
			break;
		
		case 10: 
			alter = 10;
			System.out.println("Größe = 135-140");
			break;
		
		case 11: 
			alter = 11;
			System.out.println("Größe = 141-146");
			break;
		
		case 12: 
			alter = 12;
			System.out.println("Größe = 147-152");
			break;
		
		case 13: 
			alter = 13;
			System.out.println("Größe = 153-158");
			break;
		
		case 14: 
			alter = 14;
			System.out.println("Größe = 159-164");
			break;
		
		case 15: 
			alter = 15;
			System.out.println("Größe = 165-170");
			break;
		
		case 16: 
			alter = 16;
			System.out.println("Größe = 171-176");
			break;
		
		default:
			System.out.println("Kein Kind mehr.");
		
		}
		
	}

}
