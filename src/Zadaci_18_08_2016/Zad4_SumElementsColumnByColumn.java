package Zadaci_18_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 8.1 (Sum elements column by column) 
 *  Write a method that returns the sum of all the elements in a specified column in a matrix using the following header:
 *		public static double sumColumn(double[][] m, int columnIndex)
 *	Write a test program that reads a 3-by-4 matrix and displays the sum of each column.
 */
public class Zad4_SumElementsColumnByColumn {

	static Scanner in = new Scanner (System.in);
	
	public static void main(String[] args) {
		
	
		double[][] matrix= new double[3][4];
		
		//unos matrice
		for (int i=0; i<matrix.length; i++){
			System.out.println();
			
			for (int j=0; j<matrix[i].length; j++){
				matrix[i][j]= check();
			}
			
		}
		
		//printanje sume kolona
		for (int j=0; j<matrix[0].length; j++){
			System.out.println("Sum column "+ (j+1)+ " is "+ sumColumn(matrix,j));
			
			}
		
	}
	public static double sumColumn(double[][] m, int columnIndex){
		
		double sum =0;
		//sumu kolone dobivamo kada sabjeremo i -ti red i fiksnu kolonu
		for (int i=0; i<m.length; i++){
			sum+= m[i][columnIndex];
			}
		
		return sum;
		
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
