package Zadaci_20_08_2016;
/*
 * (The Location class) 
 *  Design a class named Location for locating a maximal value and its location in a two-dimensional array. 
 *  The class contains public data fields row, column, and maxValue that store the maximal value 
 *  and its indices in a two-dimensional array with row and column as int types and maxValue as a double type. 
 *  Write the following method that returns the location of the largest element in a two-dimensional array:
 *  		public static Location locateLargest(double[][] a) 
 *  The return value is an instance of Location. 
 *  Write a test program that prompts the user to enter a two-dimensional array 
 *  and displays the location of the largest element in the array.    
 */
import java.util.InputMismatchException;

public class Location {

	public int row;
	public int column;
	public double maxValue;
	
	static java.util.Scanner in = new java.util.Scanner (System.in); 
	
	public static void main(String[] args) {
		
		double[][] a =  new double[3][3];
		//unos matrice
		System.out.println("Unesite matricu [3x3]: ");
		for (int i=0; i<a.length; i++){
			for (int j=0; j<a[i].length; j++){
				a[i][j]= check();
			}
		}
		//kreiranje objekta locate
		Location locate = new Location();
		locate=locateLargest(a);
		
		System.out.println("Najveci broj u matrici je "+ locate.maxValue+
				"\nNajveci red: "+locate.row+
				"\nNajveca kolona: "+locate.column);

	}
	
	public static Location locateLargest(double[][] a){
		 
		//kreiranje objekata
		Location locate = new Location();
		
		 locate.row = 0; 
		 locate.column = 0; 
		 locate.maxValue = a[0][0];
		 
		 for (int i = 0; i < a.length; i++) {
		 
			 for (int j = 0; j < a.length; j++) {
		 
				 //uslov da locate.maxValue postaje najveci broj u matriic
				 if (a[i][j] > locate.maxValue) {
		                 locate.row = i; 
		                 locate.column = j; 
		                 locate.maxValue = a[i][j];
		 
		             }
		         }
		     }
		 
		  return locate; 
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
