package Zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *  (Combine two lists) 
 *  Write a method that returns the union of two array lists of integers using the following header:
		public static ArrayList<Integer> union(  ArrayList<Integer> list1, ArrayList<Integer> list2)
 	For example, the union of two array lists {2, 3, 1, 5} and {3, 4, 6} is {2, 3, 1, 5, 3, 4, 6}. 
 	Write a test program that prompts the user to enter two lists, 
 	each with five integers, and displays their union. 
 	The numbers are separated by exactly one space in the output. 
 */
public class CombineTwoLists {
	
	static Scanner in = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		System.out.println("Unesite  u listu 1, 5 brojeva: ");
		//unos 5 brojeva
		for (int i=0; i<5; i++){
			int j= checkIn();
			list1.add(j);
		}
		System.out.println("Unesite  u listu 2, 5 brojeva: ");
		//unos 5 brojeva
		for (int i=0; i<5; i++){
			int j= checkIn();
			list2.add(j);
		}
		//printanje prve liste
		System.out.println("Prva lista:");
		print(list1);
		//printanje druge liste
		System.out.println("Druga lista:");
		print(list2);
		//printanje liste koja je sastavljena od liste 1 i liste 2
		System.out.println("Sastavljena lista:");
		print (union(list1,list2));
		
		
	}
	public static ArrayList<Integer> union(  ArrayList<Integer> list1, ArrayList<Integer> list2){
		ArrayList<Integer> union = new ArrayList<>();
		
		//ubacivanje prve liste u listu union
		for (int i=0; i<list1.size();i++){
			union.add(list1.get(i));
		}
		//ubacivanje druge liste u listu union
		for (int i=0; i<list2.size();i++){
			union.add(list2.get(i));
		}
		
		return union;
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
