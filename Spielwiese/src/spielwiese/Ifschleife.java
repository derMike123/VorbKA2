package spielwiese;

import java.util.Scanner;

public class Ifschleife {
	
	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Bitte Größe eingeben");
		int groesse = s.nextInt();
		
		
		
		if (groesse <= 74){
			System.out.println("Jünger als 1 Jahr");
		}
		
		else if (groesse <= 80) {
			System.out.println("1 Jahr");
		}
		else if (groesse <= 86) {
			System.out.println("18 Monate");
		}
		else if (groesse <= 92) {
			System.out.println("2 Jahre");
		}
		else if (groesse <= 98) {
			System.out.println("3 Jahre");
		}
		else if (groesse <= 104) {
			System.out.println("4 Jahre");
		}
		else if (groesse <= 110) {
			System.out.println("5 Jahre");
		}
		else if (groesse <= 116) {
			System.out.println("6 Jahre");
		}
		else if (groesse <= 122) {
			System.out.println("7 Jahre");
		}
		else if (groesse <= 128) {
			System.out.println("8 Jahre");
		}
		else if (groesse <= 134) {
			System.out.println("9 Jahre");
		}
		else if (groesse <= 140) {
			System.out.println("10 Jahre");
		}
		else if (groesse <= 146) {
			System.out.println("11 Jahre");
		}
		else if (groesse <= 152) {
			System.out.println("12 Jahre");
		}
		else if (groesse <= 158) {
			System.out.println("13 Jahre");
		}
		else if (groesse <= 164) {
			System.out.println("14 Jahre");
		}
		else if (groesse <= 170) {
			System.out.println("15 Jahre");
		}
		else if (groesse <= 176) {
			System.out.println("16 Jahre");
		}
		else {
			System.out.println("Das ist kein Kind");
		}
			
	}

	
	

}
