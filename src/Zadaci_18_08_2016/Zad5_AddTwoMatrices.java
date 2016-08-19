package Zadaci_18_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *  (Algebra: add two matrices) Write a method to add two matrices. The header of the method is as follows:
 * public static double[][] addMatrix(double[][] a, double[][] b) 
 * In order to be added, 
 * the two matrices must have the same dimensions and the same or compatible types of elements. 
 * Let c be the resulting matrix. Each element cij is aij + bij. 
 */
public class Zad5_AddTwoMatrices {

	static Scanner in = new Scanner (System.in);
	
	public static void main(String[] args) {
		// kreiranje matrica 3x3
		double[][] a = new double [3][3];
		double[][] b = new double [3][3];
		
		// unos prve matrice
		System.out.println("Unesite 9 elemente za prvu matricu 3x3:");
		for (int i=0; i<a.length; i++){
			for(int j=0;j<a[i].length; j++){
				a[i][j]= check();
			}
		}
		
		//unos druge matrice
		System.out.println("Unesite 9 elemente za drugu matricu 3x3:");
		for (int i=0; i<b.length; i++){
			for(int j=0;j<b[i].length; j++){
				b[i][j]= check();
			}
		}
		// treca matrica je suma predhodne dvije
		double[][] c= addMatrix(a,b);
		
		//printanje matrica
		printMatrix(a,b,c);
		
	
	}
	
	// kreiranje trece matrice koja je suma prehodne dvije
	public static double[][] addMatrix(double[][] a, double[][] b) {
		
		double[][] matrix = new double[a.length][a[0].length]; 
		for (int i=0; i<matrix.length; i++){
			for(int j=0;j<matrix[i].length; j++){
				// matrica je suma razlicitih matrica na istoj poziciji elemenata
				matrix[i][j]= a[i][j]+b[i][j];
			}
		}
		
		return matrix;
	}
	
	
	// metoda za printanje sve tri matrice
	public static void printMatrix (double[][]a,double[][] b, double[][]c){
		
		System.out.println("Suma matrica je: ");
		for (int i=0; i<a.length; i++){
			
			// for petlja za printanje prve matice
			for(int j=0;j<a[i].length; j++){
				System.out.print( a[i][j]+ "  ");
			}
			
			// if za odvajnje redova i dodavanje + izmedju matrica
			if (i==1){
				System.out.print("    +      ");
			}
			else{
				System.out.print("           ");
			}
			
			// for petlja za printanje druge matrice
			for(int j=0;j<b[i].length;j++){
				System.out.print(b[i][j]+ "  ");
			}
			
			// if za printanje = izmedju matrica i odvajanje redova
			if (i==1){
				System.out.print("    =     ");
			}
			else{
				System.out.print("          ");
			}
			
			// for petlja za printanje trece matrice
			for(int j=0;j<c[i].length; j++){
				System.out.print(c[i][j]+"  ");
			}
		
			//prelazak u novi red
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
