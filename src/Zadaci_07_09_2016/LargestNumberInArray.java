package Zadaci_07_09_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * (Find the largest number in an array) Write a recursive method that returns the largest integer in an array. 
 * Write a test program that prompts the user to enter a list of eight integers and displays the largest element.
 */
public class LargestNumberInArray {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter 8 integers:");
		
		int[] array =  new int[8];		//niz od 8 elemenata
		
		for (int i=0; i< array.length; i++){
			array[i]= check();	//unos brojeva u niz
		}
		
		System.out.println("The largest element in array is "+ getLargest(array, 0, array[0]));
	}
	

	public static int getLargest (int[] array,int index, int height){
		
		//uslov zaustavljanje rekurzije predstavlja indeks niza koji je jedank velicini niza 
		if (array.length==index){
			
			return height;
			
		}
		//pronalazak najveceg elementa u nizu
		if (height< array[index]){
			
			height =array[index];
		}
		
		//rekurzivni poziv
		return getLargest (array,index+1,height);
	}
	
	
	public static int check (){
	    	
	    	boolean check =true;
	    	int a =0;
	    	
	    	//do while petlja sve dok ne bude ispravan unos
	    	do{
	    		
	    		try{
	    			// unos broja
	    			a =in.nextInt();
	    			check = false;
	    			
	    		}
	    		catch(InputMismatchException ex){		//hvatanje izuzetka ako je pogresan unos
	    			
	    			System.out.println("Pogresan unos, unesite ponovo:");
	    			in.nextLine();
	    		}
	    	}
	    	while (check);
	    	
	    	 return a;
	    }
}
