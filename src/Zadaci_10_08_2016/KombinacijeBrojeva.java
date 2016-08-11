package Zadaci_10_08_2016;
/*
 * Napisati program koji ispisuje sve mogu�e kombinacije
 *  za biranje dva broja u rasponu od 1 do 7. 
 *  Tako�er, program ispisuje broj svih mogu�ih kombinacija.  
 *  Dakle, program treba da ispi�e sve mogu�e parove brojeva u datom rasponu, 
 *  krenuv�i sa 1 2, 1 3, 1 4, itd. Broj mogu�ih kombinacija je 21. 
 */
public class KombinacijeBrojeva {

	public static void main(String[] args) {
	
		//broj kombinacija
		int kombinacije =0;

		//for petlja za provjeru brojeva od 1 do 7
	for (int i = 1; i <= 7; i++){
		
		//for petlja za drugi broj kombinacije
		for (int j=i; j<=7; j++){
			
			//uslov dok brojevi nisu isti broj kombinacija se povecava
			if (i!=j){
			
				System.out.print("["+i+" "+j + "] " );
				kombinacije++;
			}
		}
	}
	System.out.println("\nBroj mogucih kombinacija je "+ kombinacije);


}
}
