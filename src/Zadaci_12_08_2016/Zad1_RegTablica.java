package Zadaci_12_08_2016;
/*
 * Pretpostavimo da se registarska tablica za auto sastoji:
 * od tri uppercase karaktera i 4 broja u sljedeæem formatu AAA-1234. 
 * Napisati program koji nasumièno generiše tablicu.
 */
public class Zad1_RegTablica {
	
	public static void main(String[] args) {
	
	
		//a,b,c su prva tri slova registarske tablice
		// uzeta u obiz ASCI kod od 65 do 90
		//koji predstavljaju velika slova
		int a = 65 + (int)(Math.random()*26);	
		int b = 65 + (int)(Math.random()*26);
		int c = 65 + (int)(Math.random()*26);
		
		// ostala 4 broja koja mogu biti od 0 do 9 random
		int br1 = (int)(Math.random()*10);
		int br2 = (int)(Math.random()*10);
		int br3 = (int)(Math.random()*10);
		int br4 = (int)(Math.random()*10);
		
		System.out.println("Registarska tablica: ");
		System.out.print( (char)a + "" + (char)b + ""+ (char)c+ "-"+ br1 + br2 + br3 + br4 );
	
	}

	
}
