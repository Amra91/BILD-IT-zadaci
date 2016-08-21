package Zadaci_20_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *  (Strictly identical arrays) 
 *  The two-dimensional arrays m1 and m2 are strictly identical if their corresponding elements are equal. 
 *  Write a method that returns true if m1 and m2 are strictly identical, using the following header:
 *  public static boolean equals(int[][] m1, int[][] m2)  
 *  
 *  Write a test program that prompts the user to enter two 3 * 3 arrays of integers 
 *  and displays whether the two are strictly identical. 
 */
public class Zad2_StrictlyIdenticalArrays {

	static Scanner in = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		//kreiranje prve matrice i unos elemenata
		int[][] m1 = new int [3][3];
		System.out.println("Unesite prvu matricu [3x3]: ");
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				m1[i][j] = checkIn();
			}
		}
		
		//kreiranje druge matrice i unos elemenata
		int[][] m2 = new int [3][3];
		System.out.println("Unesite drugu matricu [3x3]: ");
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[i].length; j++) {
				m2[i][j] = in.nextInt();
			}
		}
		//uslov ako su matrice identicne
		if (equals(m1,m2)){
			System.out.println("Matrice su identicne.");
		}
		else{
			System.out.println("Matrice nisu identicne.");
		}
		in.close();
		
	}
	//metoda za provjeru da li su matrice jednake ako su iste dimenzije matrica
	public static boolean equals(int[][] m1, int[][] m2) {
		
		boolean status = true;
		
		//provjera matrica
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				//provjera da li je svaki elemenat jedne matrice nije jednak istom elementu drug matrice
				if (m1[i][j]!=m2[i][j]){
					//status postaje false i petlja zavrsaava
					status= false;
					break;
				}
			}
		}
		
		return status;
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
