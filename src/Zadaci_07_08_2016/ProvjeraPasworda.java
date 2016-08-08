package Zadaci_07_08_2016;

import java.util.Scanner;

/*
 * Neke web stranice forsiraju odreðena pravila za passworde. 
 * Napisati metodu koja provjerava da li je unijeti string validan password. 
 * Pravila da bi password bio validan su sljedeæa: 
 * 1. Password mora biti saèinjen od najmanje 8 karaktera. 
 * 2. Password smije da se sastoji samo od slova i brojeva. 
 * 3. Password mora sadržati najmanje 2 broja. 
 * Napisati program koji pita korisnika da unese password te mu ispisuje 
 * "password je validan" ukoliko su sva pravila ispoštovana ili 
 * "password nije validan" ukoliko pravila nisu ispoštovana.

 */
public class ProvjeraPasworda {
	public static void main(String[] args) {
		
	
	Scanner input = new Scanner(System.in);
    System.out.print("Unesite password : ");
    String pass = input.nextLine();
    
    //uslov za provjeru pasworda
    if (provjeriPassword(pass)) {
        System.out.println("Password je validan.");
        } 
    else {
        System.out.println("Password nije validan. ");    
        }
    input.close();

    
}
//boolean metoda za povjeru
public static boolean provjeriPassword(String password) {
   
	boolean provjeriPassword = true;
	//uslov ako se password sastoji manje od 8 karaktera
    if (password.length() < 8) {
        provjeriPassword = false;
    	} 
    else {
        int brojac = 0;
        for (int i = 0; i < password.length(); i++) {
           
        	// uslov da karakter mora biti slovo ili broj
        	if (Character.isDigit(password.charAt(i)) || Character.isLetter(password.charAt(i))) {
              
        		// uslov  za brojanje brojeva
        		if (Character.isDigit(password.charAt(i))) {
                    brojac++;
                }
            } 
        	//ukoliko ne zadovaljava uslov da ima slova il brojeve
        	else {
                provjeriPassword = false;
                break;
            }
        }//zatvaranje for petlje

        //uslov ako u passwordu ima manje od dva broja
        if (brojac < 2) {
            provjeriPassword = false;
        }

    }

    return provjeriPassword;

}

}

