package Zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * (Sort ArrayList) Write the following method that sorts an ArrayList of numbers:
	public static void sort(ArrayList<Integer> list)
	Write a test program that prompts the user to enter 5 numbers, 
	stores them in an array list, and displays them in increasing order.
 */
public class SortArrayList {
	
	static Scanner in = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Unesite 5 brojeva: ");
		//unos 5 brojeva
		for (int i=0; i<5; i++){
			int j= checkIn();
			list.add(j);
		}
		
		System.out.println("Unesena lista je:");
		//printanje liste
		print(list);
		//sortiranje liste
		sort(list);
		System.out.println("\nSortirana lista je:");
		//ponovno printanje liste
		print(list);
	}
	
	public static void sort(ArrayList<Integer> list){
		
		for (int i=0; i<list.size()-1; i++){
			
			for (int j=i+1; j<list.size(); j++){
				
				//if uslov ukoliko je indeks i veci od susjednog desnog indeksa j
				if ( list.get(i)> list.get(j)){
					// varijable a i b dobivaju mjesta indeksa i i j
					int a = list.get(i);
					int b = list.get(j);
					
					// postavljamo novu vrijednost za i-ti elemenat od elementa na indeksu j
					// a indeksu j vracamo vrijednost koja je bila na i-tom indeksu
					list.set(i, b);
					list.set(j, a);
				
					
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
