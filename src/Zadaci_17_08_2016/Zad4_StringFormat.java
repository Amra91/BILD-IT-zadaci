package Zadaci_17_08_2016;
/*
 * Napisati metodu sa sljede�im headerom: public static String format(int number, int width) 
 * koja vra�a string broja sa prefiksom od jedne ili vi�e nula. Veli�ina stringa je width argument. 
 * Na primjer, ukoliko pozovemo metodu format(34, 4) metoda vra�a 0034,ukoliko pozovemo format(34, 5) metoda vra�a 00034. 
 * Ukoliko je uneseni broj ve�i nego width argument, metoda vra�a samo string broja. 
 * Npr. ukoliko pozovemo format(34, 1) metoda vra�a 34.
 */
public class Zad4_StringFormat {
	
	public static void main(String[] args) {
	
		System.out.println( format(34,5));
	}
	public static String format (int number, int width){
		
		// kreiranje string varijable
		String str="";
		
		// while petlja za dodjeljivanje 0 ukoliko je sirina argumenta veca od brojaca jedinica
		while (width>counter(number)){
			
			// dodavanje stringu 0
			str+="0";
			width--;
		}
		// vraca string format
		return str+ ""+ number;
		
	}
	// brojac jedinica odredjenog broja
	public static int counter (int n){
		
		int counter =0;
		
		// while za brojanje jedinica broja
		while (n!=0){
			counter++;
			n/=10;
		}
		return counter;
	}

}
