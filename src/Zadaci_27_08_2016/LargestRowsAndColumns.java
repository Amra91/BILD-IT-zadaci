package Zadaci_27_08_2016;

import java.util.ArrayList;

/*
 *  (Largest rows and columns) 
 *  Write a program that randomly fills in 0s and 1s into an n-by-n matrix, 
 *  prints the matrix, and finds the rows and columns with the most 1s. 
 *  (Hint: Use two ArrayLists to store the row and column indices with the most 1s.) 

 */
public class LargestRowsAndColumns {

	public static void main(String[] args) {
		
		//kreiranje i printanje matrice sa 4 reda i 4 kolone
		int[][] matrix = new int[4][4];
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[i].length; j++){
				//random dodjeljivanje izmedju 0 i 1
				matrix[i][j] = (int)(Math.random()*2);
				System.out.print(matrix[i][j]+"  ");
			}
			System.out.println();
		}
		
		largestRow(matrix);
		largestColumn(matrix);
		
		
	}
	//metoda za pronalazak najveceg reda
	public static void largestRow (int [][] matrix){
		
		ArrayList<Integer> largestRow = new ArrayList<>();
		
		int counter=0;	//brojac jedinica u redu
		
		for(int i=0; i<matrix.length; i++){
		
			for(int j=0; j<matrix[i].length; j++){
				//sabiranje reda
				counter+=matrix[i][j];
				}
				
			//dodjeljivanje brojaca u listu
			largestRow.add(counter);
			//restartovanje brojaca
			counter = 0;
		}
		// i predstavlja najvecu sumu redova matrice
		int i= java.util.Collections.max(largestRow);
		// printanje indeksa najvece sume redova matrice
		System.out.println("Najveci indeks reda je : " + largestRow.indexOf(i));
		
	}
	//metoda za pronalazak najvece kolone
	public static void largestColumn(int[][] matrix){
		
		ArrayList <Integer> largestColumn = new ArrayList<>();
		int counter = 0;		//brojac jedinica u redu
		
		for(int col = 0; col<matrix[0].length; col++){
			
			for(int red=0; red<matrix.length; red++){
				//sabiranje kolone
				counter+=matrix[red][col];
			}
			
			largestColumn.add(counter);
			//restartovanje brojaca
			counter = 0;
				
			}
		// i predstavlja najvecu sumu kolona matrice
		int i= java.util.Collections.max(largestColumn);
		// printanje indeksa najvece sume kolona matrice
		System.out.println("Najveci indeks kolone je : " + largestColumn.indexOf(i));
		
	}	
}
