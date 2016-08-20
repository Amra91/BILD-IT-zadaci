package Zadaci_19_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*(Algebra: multiply two matrices) 
 * Write a method to multiply two matrices. The header of the method is:
 * public static double[][] multiplyMatrix(double[][] a, double[][] b)
 * To multiply matrix a by matrix b, the number of columns in a 
 * must be the same as the number of rows in b, 
 * and the two matrices must have elements of the same or compatible types. 
 * Let c be the result of the multiplication. Assume the column size of matrix a is n. 
 * Each element cij is ai1 * b1j + ai2 * b2j + c + ain * bnj. 
 * 
 */
public class Zad2_MultiplyTwoMatrices {
	
	static Scanner in = new Scanner (System.in);

	public static void main(String[] args) {
		// kreiranje matrica 3x3
		double[][] a = new double [3][3];
		double[][] b = new double [3][3];
		
		// unos prve matrice
		System.out.println("Unos prve matrice[3x3]: ");
		for (int i=0; i<a.length; i++){
			for(int j=0;j<a[i].length; j++){
				System.out.println("Unesite elemenat "+ i + " reda i "+ j+ " kolone:");
				a[i][j]= check();
			}
		}
		
		//unos druge matrice
		System.out.println("Unos druge matrice [3x3]:");
		for (int i=0; i<b.length; i++){
			for(int j=0;j<b[i].length; j++){
				System.out.println("Unesite elemenat "+ i + " reda i "+ j+ " kolone:");
				b[i][j]= check();
			}
		}
		
		double[][] c= multiplyMatrix(a,b);
		
		//printanje matrica
		printMatrix(a,b,c);
		
	
	}
	
	// kreiranje trece matrice
	
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		
		// nova matrica se formira [duzina kolone prve matrice] [duzina reda druge matrice]
		double[][] c = new double[a[0].length][b.length]; 
		
		/* uslov da bi matrice mogle da se mnoze
		// jer i-ti red prve matrice se mnozi i sabjere sa j-tom kolonom druge matrice
		   tako da broj kolona lijeve matrice mora da odgovara broju redova desne matrice
		*/
		if (a[0].length != b.length) {
	            System.out.println("Uslov: matrice duzina kolona " + a[0].length + " ne odgovara matrici b duzini redova " + b.length + ".");
	        }
		
		
		//for petlja za redove prve matrice
	     for (int i = 0; i < a.length; i++) { 
	    	 
	    	 	//for petlja za kolone druge matrice
	            for (int j = 0; j < b[0].length; j++) { 
	            	
	            	// for petlja za kolone prve matrice
	                for (int k = 0; k < a[0].length; k++) { 
	                	
	                	//c[i][j] dobivamo tako sto mnozimo ai1 * b1j i sabjeremo  ai2 * b2j 
	                	//do kraja reda prve matrice i do kraja kolone druge matrice ain*bnj
	          
	                    c[i][j] += a[i][k] * b[k][j];
	                }
	            }
	        }

	        return c;
	    }
	
	
	// metoda za printanje sve tri matrice
	public static void printMatrix (double[][]a,double[][] b, double[][]c){
		
		System.out.println("Proizvod mnozenja matrica: ");
		for (int i=0; i<a.length; i++){
			
			// for petlja za printanje prve matice
			for(int j=0;j<a[i].length; j++){
				System.out.print( a[i][j]+ "  ");
			}
			
			// if za odvajnje redova i dodavanje + izmedju matrica
			if (i==1){
				System.out.print("    x      ");
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

