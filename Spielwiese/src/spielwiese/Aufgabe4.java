package spielwiese;

public class Aufgabe4 {

	public static void main(String[] args) {
		
		 double p = -3.;
		 double q = -4.;
		
		 double teil1, teil2, teil3, ergebnis1, ergebnis2;
		
		 teil1 = (-p/2.);
		 teil2 = ((p/2.)*(p/2.)-q);
		 teil3 = (Math.sqrt(teil2));
		 
		 if (teil2 == 0) 
		 {
			 ergebnis1 = teil1;
			 System.out.println("Ergebnis :"+ergebnis1+"\n");
			 
		 }
		 
		 else if (teil2 < 0) 
		 {
			 
			 System.out.println("Keine Lösung");
		 }
		 
		 
		 else  
		 {
			ergebnis1 = teil1 - teil3;
			ergebnis2 = teil1 + teil3;
			 System.out.println("Lösung 1: "+ergebnis1+"\n");
			 System.out.println("Lösung 2: "+ergebnis2);
		 }
		 
		 
		 
		 
	
	}

}
