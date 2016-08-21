package Zadaci_20_08_2016;

import java.util.InputMismatchException;

/*
 *  (Row sorting) 
 *  Implement the following method to sort the rows in a twodimensional array. 
 *  A new array is returned and the original array is intact.
			public static double[][] sortRows(double[][] m)  
	Write a test program that prompts the user to enter a 3 * 3 matrix of double values and displays a new row-sorted matrix. 
 */
public class Zad1_RowSorting {

	static java.util.Scanner in = new java.util.Scanner(System.in);
	
	public static void main(String[] args) {
		
		//kreiranje matrice
		System.out.println("Unesite matricu [3x3]:");
		double[][] m = new double[3][3];
		for (int i=0; i<m.length; i++){
			for (int j=0; j<m.length; j++){
				m[i][j]= check();
			}
		}
		
		m= sortRows(m);
		print(m);
		
	}
	
	//metoda za sortiranje redova
	public static double[][] sortRows (double[][] m){

		boolean tester;
		
			for (int i = 0; i < m.length; i++) {
			
				//bubble sort provjera dok ne izvrsi sva zamjena mjesta u redu od najmanjeg do najveceg
				do {
					tester = false;
			
					for (int j=0; j<m[i].length-1; j++){
				
						//if uslov ukoliko je kolona veca od susjedne kolone izvrsava se zamjena 
						if (m[i][j] > m[i][j+1]) {
					
							// zamijena pozicija
							double temp = m[i][j];
							m[i][j] = m[i][j + 1];
							m[i][j + 1] = temp;
							tester = true;
							}
						}
				
				} while (tester);
		
			}

		return m;
	}
		
		
		
	public static void print(double[][] m){
		//printanje matrice
		for(int i=0; i<m.length;i++){
			for(int j=0; j<m[0].length;j++){
				System.out.print(m[i][j]+ " ");
			}
			System.out.println();
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
