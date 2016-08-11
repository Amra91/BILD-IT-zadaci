package Zadaci_10_08_2016;

import java.util.Scanner;

/*
 * Napisati metodu koja pronalazi broj ponavljanja odreðenog karaktera u stringu. 
 * Metoda treba da koristi sljedeæi header: 
 * public static int count(String str, char a). 
 * Na primjer, ukoliko pozovemo metodu na sljedeæi naèin: 
 * count("Welcome", e) metoda treba da vrati 2. 
 * Napisati program koji pita korisnika da unese string 
 * i koji karakter želi da prebroji u datom stringu 
 * te mu ispiše koliko se puta odreðeni karakter ponovio u zadatom stringu.
 */
public class PonavljanjeKaraktera {
	
public static void main(String[] args) {
	
	Scanner unos = new Scanner (System.in);
	
	System.out.println("Unesite string: ");
	String str = unos.nextLine(); 		//unos stringa
	
	System.out.println("Unesite slovo za pretragu");
	char ch = unos.next().charAt(0); 	//unos jednog slova 
	
	//if uslov ako brojac vraca 0 da nema tog karaktera u stringu 
	if (count(str,ch)==0){
		System.out.println("Trazeni karakter nije pronadjen u stringu.");
	}
	else{
		System.out.println(ch + " se ponovio " +count(str,ch) + " puta.");
	}
	unos.close();
	 

}
//metoda za provjeru koliko se puta neko slovo ponovo
	public static int count(String str, char a){
		
		//brojac
		int count = 0;
		
		for (int i = 0; i <str.length(); i++) {
			
			//if uslov ako je trazeni karakter jednak slovu u stringu
			if (str.charAt(i)==a){
				count++;
			}
		}
		return count;

}

}
