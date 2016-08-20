package Zadaci_19_08_2016;
/*
 *  (Largest row and column) 
 *  Write a program that randomly fills in 0s and 1s into a 4-by-4 matrix, 
 *  prints the matrix, and finds the first row and column with the most 1s. 
 *  Here is a sample run of the program:
			0011 
			0011 
			1101 
			1010 
	The largest row index: 2 
	The largest column index: 2 
 */
public class Zad3_LargestRowAndColumn {

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
		
		int counter=0;	//brojac jedinica u redu
		int temp=0;		//zamjena
		int max = 0;	//indeks najveceg reda
		
	
		
		for(int row=0; row<matrix.length; row++){
		
			for(int col=0; col<matrix[row].length; col++){
				
				//if uslov za inkrementiranje brojaca ako je 1
				if(matrix[row][col] ==1){
					counter++;
					}
				}
			//if uslov ako je brojac veci od temp
			if(counter > temp){
				// temp postaje brojac
				temp = counter;
				//a najveci indeks postaje taj red
				max = row;
			}
			//restartovanje brojaca
			counter = 0;
				
		}
		System.out.println("The largest row index: "+(max));
		
	}
	//metoda za pronalazak najvece kolone
	public static void largestColumn(int[][] matrix){
		
		int counter = 0;		//brojac jedinica u redu
		int temp = 0; 		//zamjena
		int max =0;		//indeks najvece kolone
		
		for(int col = 0; col<matrix[0].length; col++){
			
			for(int red=0; red<matrix.length; red++){
				
				//if uslov za inkrementiranje brojaca ako je 1
				if(matrix[red][col] == 1){
					counter++;
					}
			}
			
			//if uslov ako je brojac veci od temp
			if(counter> temp){
				// temp postaje brojac
				temp = counter;
				//a najveci indeks postaje ta kolona
				max= col;
				
			}
			
			//restartovanje brojaca
			counter = 0;
				
			}
		System.out.println("The largest column index: "+(max));
		}
		
	}
