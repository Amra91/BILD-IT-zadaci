package Zadaci_06_08_2016;
/*
 * Napisati program koji pita korisnika da unese neki string te mu ispisuje 
 *  te mu ispisuje sve karaktere koji se nalaze na neparnim pozicijama. 
 *  Na primjer, ako korisnik unese string Beijing Chicago, program vraæa BiigCiao.
 */
import java.util.Scanner;

public class Zadatak4 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Molimo unesite string.");
		//unos stringa
		String str = in.nextLine();
		
		//glavna metoda koja provjerava string i printa 
		doTheLogic(str);
		in.close();
	}
	
	public static void doTheLogic (String str){
		//string sprema u niz karaktera
		char[] array = new char[str.length()];
		for(int i=0; i<array.length; i++){
			array[i] = str.charAt(i);
		}
		//metoda za printanje novog niza karaktera
		printCharacters(array);
		
	}
	//metoda za printanje nepranih karaktera
	public static void printCharacters(char[] array){
		System.out.print("Karakteri na neparnim pozicijama su:  ");
		for(int i=0; i<array.length; i+=2){
			
			System.out.print(array[i]);
		}
	}
	
		


}
