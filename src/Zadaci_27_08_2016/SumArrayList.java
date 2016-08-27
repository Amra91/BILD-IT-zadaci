package Zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * (Sum ArrayList) Write the following method that returns the sum of all numbers in an ArrayList:
public static double sum(ArrayList<Double> list)
Write a test program that prompts the user to enter 5 numbers, 
stores them in an array list, and displays their sum.
 */
public class SumArrayList {

	static Scanner in = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		ArrayList<Double> list = new ArrayList<>();
		
		System.out.println("Unesite 5 brojeva:");
		//unos 5 brojeva
		for (int i=0;i<5; i++){
			list.add(check());
		}
		
		System.out.println("List:");
		print(list);
		System.out.println("\nSuma unesenih brojeva je  "+ sum(list));
		
		
	}
	public static double sum(ArrayList<Double> list){
		
		double sum=0;
		
		for (int i=0; i<list.size(); i++){
			// svaki elemenat u listi dodajemo u varijablu sum
			sum+=list.get(i);
		}
		
		return sum;
		
	}
	//printanje liste
	public static void print (ArrayList<Double>list){
				
		for (int i=0; i<list.size(); i++){
					System.out.print(list.get(i)+ " ");
				}
	}
	//metoda za provjeru da li je unos ispravan decimalni broj
		public static double check(){
			
			double num =0;
			boolean isTrue = true;
			
			/// do while petlja da se izvrsava unos broja sve dok isti ne bude double
			do{
				//try blok koji provjerava unos
				try{
					num = in.nextDouble();
					
					isTrue= false;
				}
				// hvatanje izuzetka
				catch (InputMismatchException e) {
				    System.out.println("Input MIsmatch Exception, unesite ponovo cijeli broj;"); 
				    in.nextLine();
				
				}
			}while(isTrue);
			
			return num;
		}
}
