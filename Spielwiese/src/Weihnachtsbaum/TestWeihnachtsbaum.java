package Weihnachtsbaum;

public class TestWeihnachtsbaum {

	public static void main(String[] args) {
		Weihnachtsbaum[] baeume = new Weihnachtsbaum[20];
		Weihnachtsbaum[] array = new Weihnachtsbaum[20];
		Weihnachtsbaum[] array2 = new Weihnachtsbaum[baeume.length];
		

//		for (int i = 0; i < baeume.length; i++)
//			baeume[i] = new Weihnachtsbaum();
//
//		for (int i = 0; i < baeume.length; i++)
//			System.out.println(baeume[i].getGroesse());
//
//		
//		double min = baeume[0].getGroesse();
//		int zaehler=0;
//		
//		for (int j = 0; j < baeume.length; j++){
//			
//						
//		for (int i = 1; i < baeume.length; i++) {
//			
//			if (baeume[i] != null && baeume[i].getGroesse() < min){ 
//				min = baeume[i].getGroesse();
//				array2[zaehler++] = baeume[i];
//				baeume[i] = null;
//			}
//			
//			System.out.println(array2[i]);
//			}
//		}
//		System.out.println("der kleinste Baum ist " + min + " Meter groß");
	
	
	for (int i = 0; i < array.length; i++) {
		array[i] = new Weihnachtsbaum();
	}
	
	}
}
