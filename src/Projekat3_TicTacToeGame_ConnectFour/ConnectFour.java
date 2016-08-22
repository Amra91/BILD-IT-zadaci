package Projekat3_TicTacToeGame_ConnectFour;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConnectFour {

	static Scanner in =  new Scanner (System.in);

	public static void main(String[] args) {
		
		//Matrica sa 6 redova i 7 kolona
		char[][] matrix = new char[6][7];
		
		int counter=0;
		char player= 'Y';
		
		/* while petlja provjerava:
		 * da li winner metoda vraca false, sve dok varaca izvrsava se i uslov da je 
		 * counter manji od 42 ( najveca moguca kombinacija matrice[6][7])
		 */
		while ( !winner (matrix)&& counter<42 ){
			
			//zamjena igraca
			if (player == 'R') {
					player = 'Y';
					} 
			else {
					player = 'R';
				}
			
			
			//uslov za printanje ukliko je igrac Y ili R
			if (player=='Y'){
				System.out.print("Drop a yellow disk at column (0–6):");
			}
			else{
				System.out.print("Drop a red disk at column (0–6):");
			}
		 
			//unos kolone
			int column = checkIn();
				//uslov ako je unos manji od 0 i veci od 6
				while (column<0 || column>6){
					System.out.println("Enter again column(0-6):");
					column= checkIn();
					}
			
			//for petlja za popunjvanje matrice
			for (int i = matrix.length - 1; i >= 0; i--) {
				if (matrix[i][column] =='\u0000') {
					matrix[i][column] = player;
					break;
				}
				if (i == 0)
				     System.out.println("Column full. Try again.");
			}
			
				
					//printanje matrice
				print(matrix);
				System.out.println();
				counter++;
			
		} //zatvaranje while petlje
		
		if (winner(matrix)){
			System.out.println("Pobjednik je " + player);
			}
		else{
			System.out.println("Nerjeseno.");
		}
		
		
		
		
		}
		
	//metoda za pobjedinka
	
	public static boolean winner (char [][] matrix){
		
		//if uslov ukoliko je pobjeda horizontalno, vertikalno, sa lijeva na desno i desno na lijevo dijagonalno
		if (checkHor(matrix) || checkVer(matrix) || checkLeftRight(matrix) || checkRightLeft(matrix)){
			return true;
		}
		return false;
	}
			
	//metoda za printanje 
	public static void print (char[][] matrix){
		System.out.println();
		for (int i=0; i<6; i++){
			for (int j=0; j<7; j++){
				if (matrix[i][j] != '\u0000')
					System.out.print(" | "+ matrix[i][j]);
				else{
					System.out.print(" | "+ " ");
				}
			}
			System.out.print(" |\n");
		}
		System.out.println("-------------------------------");
	}
	
	
	//metoda za provjeru vertikalno
	 public static boolean checkVer(char[][] matrix) {
		 
		 char start;	//pocetna vrijednost
		 int count = 1;	//brojac
		
		 //for petlja za provjeru kolone
		  for (int i = 0; i < 7; i++) {
			  start = matrix[0][i];
			  // for petlja za redove
			  for (int j = 1; j < 6; j++) {
				  //provjera da li su ista mjesta
				  if (start == matrix[j][i] && start != '\u0000') {
					  count++;
				  } 
				  else {
					  start = matrix[j][i];
					  count = 1;
				  }
		 
				  if (count == 4) {
					  return true;
				  }
			  }
		  	}
		 
		  return false;	 
	}
	 
	 //metoda za provjeru horizontalno
	 public static boolean checkHor(char[][] matrix) {
		 
		 char start;	//pocetna vrijednost
		 int count = 1;	//brojac
		 
		 //for petlja za provjeru redova
		  for (int i = 1; i < 6; i++) {
		  	 start = matrix[i][0];
		   
		  	 //for petlja za provjeru kolona
		  	for (int j = 1; j < 7; j++) {
		  		//if uslov provjerava da li su mjesta ista i da nije null
		  		if (start == matrix[i][j] && start != '\u0000') {
		  			count++;
		  		} 
		  		else {
		  			start = matrix[i][j];
		  			count = 1;
		  		}
		 
		  		if (count == 4) {
		  			return true;
		  		}
		  	}
		  }
		 
		  return false;
		 
		 }
	 
	 //provjera dijagonalno sa lijeva na desno
	 public static boolean checkLeftRight(char[][]matrix){
		
		 //iz gornjeg lijevog ugla krece provjera za redove
		 for (int i = 0; i < 6; i++) {
			  int start = matrix[i][0]; //prva vrijednost
			  int count=1; //brojac
			   for (int j = i+1, k = 1; j < 6 && k < 7; j++, k++) {
				   //if uslov ako su isti znakovi inkrementira se brojac
				   if (start == matrix[j][k] && start != '\u0000') {
					   count++;
				   } 
				   else {
					   start = matrix[j][k];
					   count = 1;
				   }
				   if (count == 4) {
					   return true;
				   }
			   	}
			  }
		 
		 
		 //provjera za kolone sa lijeva na desno
		 for (int i = 0; i < 7; i++) {
			   int start = matrix[0][i];
			   int count = 1;	//brojac
			   
			   //for petlja za provjeru susjednih clanova
			   for (int j = i+1, k = 1; j < 7 && k < 6; j++, k++) {
				   //uslov ukoliko su isti znakovi
				   if (start == matrix[k][j] && start != '\u0000') {
					   count++;
				   } 
				   else {
					   start = matrix[k][j];
					   count = 1;
				   }
			 
				   if (count == 4) {
					  return true;
				   }
			   	}
			  }
		 return false; 
	 }
	 //provjera dijagonalno sa desna na lijevo
	 public static boolean checkRightLeft(char[][] matrix){
		 
		 //for petlja za provjeru redova
		 for (int i = 0; i < 6; i++) {
			   char start = matrix[i][matrix[i].length-1];
			   int count = 1; //brojac
			   
			   for (int j = i+1, k = matrix[0].length-2; j < matrix.length && k >= 0; j++, k--) {
				   if (start == matrix[j][k] && start != '\u0000') {
					   count++;
				   } 
				   else {
					   start = matrix[j][k];
					   count = 1;
				   }
				   
				   if (count == 4) {
					   return true;
				   }
			   	}
			  }
			   
		 
		 //provjera za kolone
		 for (int i = 0; i < 7; i++) {
			   int start = matrix[0][i];
			   int count = 1; //brojac
			  
			   for (int j = 1, k = i-1; j < 6 && k >= 0; j++, k--) {
			    
				   if (start == matrix[j][k] && start != '\u0000') {
					   count++;
				   } else 
				   {
					   start = matrix[j][k];
					   count = 1;
				   }
				   if (count == 4) {
					  return true;
				   }
			   	}
			  }
		 return false;
		 
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
