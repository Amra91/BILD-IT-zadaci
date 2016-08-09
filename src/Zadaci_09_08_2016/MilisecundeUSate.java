package Zadaci_09_08_2016;
/*
 * Napisati metodu koja pretavara milisekunde u sate, minute i sekunde. 
 * Metoda treba da koristi sljedeæi 
 * header: public static String convertMillis(long millis). 
 * Metoda treba da vraæa vrijeme kao string u formatu sati:minute:sekunde.  
 * Na primjer convertMillis(100000) treba da vrati 0:1:40.
 */
public class MilisecundeUSate {

	public static void main(String[] args) {
		
		System.out.println(convertMillis(100000));
		
		// predstavlja tacno vrijeme (UTC+1)
		System.out.println(convertMillis(System.currentTimeMillis()));
	}

	public static String convertMillis (long millis){
		
		long sec = millis/1000;		//ukupno sekundi
		long min = sec/60;			//ukupno minuta
		long sat = min/(60*60);		//ukupno sati
		
		// vraca  sate:minute:sekunde
		return sat%24 + ":" + min%60 + ":" + sec%60;
	}
	
	
}
