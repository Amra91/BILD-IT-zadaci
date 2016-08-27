package Zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *  (Remove duplicates) 
 *  Write a method that removes the duplicate elements from an array list of integers using the following header:
	public static void removeDuplicate(ArrayList<Integer> list)
	Write a test program that prompts the user to enter 10 integers to a list 
	and displays the distinct integers separated by exactly one space.
 */
public class RemoveDuplicates {
	
	static Scanner in = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		ArrayList <Integer> list = new ArrayList<>();
		
		System.out.println("Unesite 10 cijelih brojeva:");
		//dodavanje elemenata u listu
		for (int i=0; i<10; i++){
			int j =checkIn();
			list.add(j);
		}
		
		System.out.println("Niz od 10 brojeva:");
		print(list);
		
		removeDuplicate(list);
		System.out.println("\nPoslije brisanja duplih brojeva:");
		print(list);
	}
	
	//metoda za brisanje duplikata
	public static void removeDuplicate(ArrayList<Integer> list){
		
		//prva for petlja za provjeru svakog elementa
		for (int i=0; i<list.size()-1; i++){
			
			// druga for petlja koja ide od sljedeceg indeksa j
			for (int j=i+1; j<list.size(); j++){
				
				//uslov ako je pronadjen duplikat na nekoj narednoj poziciji da se izbrise
				if (list.get(i).equals(list.get(j))){
					//System.out.println(j);
					//brisemo taj broj sa indeksom j
					list.remove(list.get(j));
					//umanjujemo j; jer se velicina liste smanjila
					j--;
				}
			}
		}
	}
	
	//printanje liste
	public static void print (ArrayList<Integer>list){
		
		for (int i=0; i<list.size(); i++){
			System.out.print(list.get(i)+ " ");
		}
	}
	
	
	// metoda za provjeru unosa 
	public static int checkIn(){
			
			int num =0;
			boolean checkIn = true;
			
			/// do while petlja da se izvrsava sve dok ne bude korektan unos
			do{
				//try blok provjerava unos
				try{
					num = in.nextInt();
					
					checkIn= false;
				}
				// hvatanje izuzetka
				catch (InputMismatchException e) {
				    System.out.println("Input MIsmatch Exception, unesite ponovo;"); 
				    in.nextLine();
				
				}
			}while(checkIn);
			
			return num;
		}
}
