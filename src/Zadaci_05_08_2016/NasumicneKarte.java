package Zadaci_05_08_2016;
/*
 * Napisati program koji simulira nasumièno izvlaèenje karte iz špila od 52 karte. 
 * Program treba ispisati koja karta je izvuèena (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q ili K) 
 * te znak u kojem je data karta (Srce, Pik, Djetelina, Kocka). 
 * Primjer: Karta koju ste izvukli je 10 u znaku kocke.
 */
public class NasumicneKarte {
	
	public static void main(String[] args) {
		
	
	System.out.print("Karta koju ste izvukli je " + karta() + " u znaku " + znak() +".");

}
	public static String karta (){
		String []karte= {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		int vrijednost =(int)( Math.random()*13);
		return karte[vrijednost];
	}
	
	public static String znak(){
		String[] znakovi = {"srce","pik","djetelina","kocka"};
		
		
		int znak = (int)(Math.random()*4);
		return znakovi[znak];
	}

}
