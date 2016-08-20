package Zadaci_19_08_2016;
/*
 *  (Even number of 1s) 
 *  Write a program that generates a 6-by-6 two-dimensional matrix filled with 0s and 1s, 
 *  displays the matrix, and checks if every row and every column have an even number of 1s. 
 */
public class Zad5_EvenNumberOf1s {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] niz = new int [6][6];
	
		System.out.println("Matrix [6x6]:");
	
		for (int red=0; red<niz.length; red++){
			for (int kolona=0;kolona<niz[red].length; kolona++){
				niz[red][kolona]= (int)(Math.random()*2);
				System.out.print(niz[red][kolona]+ "  ");
			}
			System.out.println();
		}
		
		rowCheck(niz);
		columnCheck(niz);
		
	}
	
	//matrica koja provjerava da li svaki red ima paran broj 1-ica
	public static void rowCheck(int matrix[][]){
	
		int counter=0; // brojac jedinica u matrici
		
		for (int i=0; i<matrix.length; i++){
			
			for (int j=0; j<matrix[i].length; j++){
				// if uslov za brojanje jedinica u redovima
				if (matrix[i][j]==1){
					counter++;
				}
			}
			
			if (counter%2==0 && counter!=0){
				System.out.println("Red "+ i + " ima paran broj jedinica :"+ counter);
				counter=0;
			}
			else{
				System.out.println("Red "+ i + " nema paran broj jedinica :"+ counter);
				counter=0;
			}
		}
		 
	
	
	}
	public static void columnCheck(int matrix[][]){
		
		int counter=0; // brojac jedinica u matrici
		
		for (int i = 0; i < matrix.length; i++) {
			   for (int j = 0; j < matrix[i].length; j++) {
				   if (matrix[j][i]==1)
					   counter ++;
			   }
			
			if (counter%2==0 && counter!=0){
				System.out.println("Kolona "+ i + " ima paran broj jedinica :"+ counter);
				counter=0;
			}
			else{
				System.out.println("Kolona "+ i + " nema paran broj jedinica :"+ counter);
				counter=0;
			}
		}
		 
	
	
	}

}
