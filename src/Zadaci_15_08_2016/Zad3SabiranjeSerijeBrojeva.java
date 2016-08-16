package Zadaci_15_08_2016;
/*
 * Napisati program koji sabira sljedeæu seriju 
 * 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 ..... + 95/97 + 97/99.
 */
public class Zad3SabiranjeSerijeBrojeva {

	public static void main(String[] args) {
		
		// varijabla za prikaz sume
		double sum=0;
		
		/*
		 * for petlja krece od 1 do 98,
		 * tako da zadnji broj je (97/99) 
		 * i uvecava se za 2,
		 * tako da dobivamo neparne brojeve
		 */
		for (double i=1; i<98; i+=2){
		// sumi dodavamo kolicnik od brojeva (i/(i+2)
			
			sum +=(i/(i+2));
		}
		
		// printamo sumu zaokruyenu na 3 decimale
		System.out.printf("%1.3f", sum );
	}
}
