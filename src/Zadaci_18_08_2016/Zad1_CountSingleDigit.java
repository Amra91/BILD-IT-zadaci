package Zadaci_18_08_2016;
/*
 * 7.7. (Count single digits) Write a program that generates 100 random integers between 0 and 9 
 * and displays the count for each number. 
 * (Hint: Use an array of ten integers, say counts, to store the counts for the number of 0s, 1s, ..., 9s.) 
 */
public class Zad1_CountSingleDigit {

	public static void main(String[] args) {
		
		// kreiranje niza od 100 elemenata
		int[] array= new int[100];
		
		//kreiranje niza od 10 elemenata za brojanje random brojeva
		int[] count = new int[10];
		  
		for(int i = 0; i < array.length; i++){
			
			// popunjavanje niza od 100 brojeva
			array[i]=(int)(Math.random() * 10);
		   
		   //inkrementiranje niza koji ima vrijednost predhodnog random broja
			count[array[i]]++;
		  }
		  
		 print(count);
	}
	
	//metoda za printanje niza
	private static void print(int[] array){
		
		//for petlja za printanje niza
		for(int i = 0, size = array.length; i < size; i++ ){
			
		   System.out.println(i + " bio je:  " + array[i]+ " puta.");
		  }
		 }
		 
		}