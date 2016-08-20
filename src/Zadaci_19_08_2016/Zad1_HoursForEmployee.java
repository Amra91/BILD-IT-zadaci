package Zadaci_19_08_2016;
/*
 * (Compute the weekly hours for each employee) 
 * Suppose the weekly hours for all employees are stored in a two-dimensional array. 
 * Each row records an employee’s seven-day work hours with seven columns. 
 * For example, the following array stores the work hours for eight employees. 
 * Write a program that displays employees and their total hours in decreasing order of the total hours.
 */
public class Zad1_HoursForEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// kreiranje matrice za 8 zaposlenih radnika i 7 radnih dana 
		
		
		double [][]matrix= {{7, 8, 7, 7, 7, 7, 4 },
							{8, 8, 8, 4, 6, 7, 4},
							{8, 8, 5, 3, 6, 6, 4},
							{8, 8, 8, 5, 6, 6, 6},
							{3, 8, 4, 5, 6, 6, 4},
							{4, 8, 8, 4, 4, 8, 4},
							{5, 8, 8, 8, 8, 2, 4},
							{7, 8, 5, 8, 6, 8, 8}  };
		
		
		printAllHours(matrix);
		
		double[][] totalHours=total(matrix);

		System.out.println("\nUkupni sati:\n_________________________________\n");
		printTotalHours(totalHours);
		
		totalHours= newMatrix(totalHours); // zamjena matrice novom matricom koja je sortirana po opadajucem metodu
		System.out.println("\nSortirani ukupni sati:\n__________________________________\n");
		printTotalHours(totalHours);
		
	}
	
	public static double [][] total (double[][] matrix){
		
		// kreiranje dvodimenzionalnog niza sa 8 redova za 8 zaposlenih i 2 kolone za ime (0,..8) zaposlenika i ukupne sate
		double [][] totalHours =new double[8][2];
		
		double sum = 0;
		
		for(int i = 0; i<matrix.length; i++){
			for (int j =0; j<matrix[j].length; j++){
				//ukupni sati svakog zaposlenog za i-ti red i svaku kolonu se racuna
				sum +=matrix[i][j];
			}
			
			totalHours[i][0]= i; //ime zaposlenog je i
			totalHours[i][1] =sum; // ukupna sati zaposlenog
	
			sum =0;			//ponovno incijalizovanje na 0, kako bi se restartovala suma
		}
		
		return totalHours;
	}
	
	
	public static void printAllHours (double[][] array){
		
		
		System.out.printf("%16s %3s %6s %6s %6s %6s %6s %6s "," ","M","T","W","Th","F","Sa","Su");
		System.out.println();
		
		// for petlja za printanje svih zaposlenih i sve sate
		for(int i = 0; i<array.length; i++){
			System.out.print("Zaposlenik " + i + " :");
			
			for (int j =0; j<array[j].length; j++){
				System.out.print("    " + array[i][j]);
			}
			
			System.out.println();
			
		}
		
	
	}

	
	public static void printTotalHours(double [][] totalHours){
	
		// for petlja za printanje ukupnih sedmicnih sati
		for(int i=0; i<totalHours.length;i++ ){
			
			System.out.print("Zaposlenik ");
			for(int j=0; j<totalHours[i].length; j++){
				
				if (j==0){
					System.out.print( (int)(totalHours[i][j])+ " :  ");
				}
				else{
					System.out.print(+totalHours[i][j]+ "  ");
				}
					
			}
			System.out.print( "ukupno sati.");
			System.out.println();
		}
		
	}
	
	//metoda za sortiranje niza od najveceg do najmanjeg
	public static double [][] newMatrix (double[][] matrix) {
		
		double max ; // deklarisanje varijable
		
		// for petlja za redove umanjene za 1
		for (int i = 0; i < matrix.length - 1; i++) {
		  

			// incijalizovnje varijable min sa fiksnom kolonom 1 i-tim redom
			max =matrix[i][1];
			int indeks = i;
		 
			// for petlja za provjeru 1 kolone sljedecih redova uvecanog za 1 
		   for (int j = i + 1; j < matrix.length; j++) {
			   
			// uslov ako je max veci od j- tog reda
			   	if (max < matrix[j][1]) {
			   		max = matrix[j][1];
			   		
			   		//indeks koji se mjenja postaje j
			   		indeks = j;
			   		}
		   		}
		 //zamjena ukoliko je pronadjena manja vrijednost u ostalim redovima redu
		   if (indeks != i) {
			   
			   matrix[indeks][1] = matrix[i][1];  // zamjena matrica i-tog reda sa matricom j-tog reda
			   matrix[i][1] = max;				  // zamjena da min postaje i-tog reda
			   
			   matrix[indeks][0] = matrix[i][0];  // zamjena i za 0-tu kolonu 
			   matrix[i][0] = indeks;
		 
		   }
		  } 
		
		return matrix;
	
	}
		 
}
