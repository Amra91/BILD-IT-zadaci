package Projekat3_TicTacToeGame_ConnectFour;

import java.util.InputMismatchException;
/* (Game: play a tic-tac-toe game) 
 *  In a game of tic-tac-toe, two players take turns marking an available cell 
 *  in a 3 * 3 grid with their respective tokens (either X or O). 
 *  When one player has placed three tokens in a horizontal, vertical, or diagonal row on the grid, the game is over and that player has won. 
 *  A draw (no winner) occurs when all the cells on the grid have been filled with tokens and neither player has achieved a win. 
 *  Create a program for playing tic-tac-toe.  
 *  The program prompts two players to enter an X token and O token alternately.
 *  Whenever a token is entered, the program redisplays the board on the console and determines the status of the game (win, draw, or continue). 
 */
public class TicTacToeGame {

static java.util.Scanner in =new java.util.Scanner (System.in);
	
	public static void main(String[] args) {
		
		//kreiranje matrice 3x3;
		char[][] matrix =  new char[3][3];
	
		char player= 'X';
	
		//while uslov da se izvrsava dok matrica ne bude puna ili dok ne bude pobjednik
		while (!isFull(matrix) && winner(matrix)=='W' ){
		
			System.out.println("Igrac "+ player + " :\n___________________________" );
			
			System.out.print("Unesite za red [0,1,2]:");
			int row =checkIn();
				//uslov ukoliko se unese pogresan broj
				while (row<0 || row>2){
					System.out.print("Pogresan unos. \nUnesite za red [0,1,2]: ");
					row=checkIn();
				}
		
			
			System.out.print("Unesite za kolonu [0,1,2]:");
			int column= checkIn();
				//uslov ukoliko se unese pogresan broj
				while (column<0 || column>2){
					System.out.print("Pogresan unos. \nUnesite za kolonu [0,1,2]: ");
					column=checkIn();	
				}
		
			//provjera da li je zauzeto mjesto
				if (matrix[row][column]!='\u0000') {
					System.out.print("Mjesto je zauzeto.\nUnesite ponovo:\n");
				} 
				else {
					matrix[row][column] = player;
						//zamjena igraca	
						if (player == 'O') {
							 player = 'X';
								} 
						else {
							player = 'O';
							}
					
						//printanje matrice
					print(matrix);
					System.out.println();
				}
		
		}//zatvaranje while petlje
		
		// if uslov ako je pobjeda 
		if (winner(matrix)=='X' ||winner(matrix)=='O'){
			System.out.println("\nImamo pobjednika "+ winner(matrix)+ " .");
		}
		else{
			System.out.println("\nNerijeseno");
		}   
	}
	
	//metoda za printanje matrice
	public static void print(char[][] matrix){
		
		for (int i=0; i<matrix.length; i++){
			System.out.println("  __________________");
			for(int j=0; j<matrix[i].length; j++){
				
				if (matrix[i][j] != '\u0000')
					System.out.print("  |  "+ matrix[i][j]);
				else{
					System.out.print("  |  "+ " ");
				}
			}
			System.out.print(" | \n");
		}
		System.out.println("  __________________");
	}
	
	//metoda za provjeru da li ima slobodnih mjesta u matrici
	 public static boolean isFull(char[][] matrix) {
		 
		boolean isFull = true;
		 
		     for (int i = 0; i < 3; i++) {
		          for (int j = 0; j < 3; j++) {
		            	 //ukoliko ima - karaktera u matrici, matrica nije popunjena
		              if (matrix[i][j] == '\u0000') {
		                     isFull = false;
		                     break;
		                 }
		             }
		         }
		 return isFull;
		}

	//metoda za provjeru da li su isti znaci
	 public static boolean checkChars(char a, char b, char c) {
		 
		 //if uslov ako su svi znaci jednaki i nisu null karakteri
		 	if ((a != '\u0000') && (a == b) && (b == c)){
		 		return true;
		 		}
		   return false;
	 	}
	
	//metoda koja govori da li je X ili O pobjednik
	public static char winner (char[][] matrix){
		char winner='W';
		
		// if uslovi ako je pobjeda u dijagonalno
		if (checkChars(matrix[0][0], matrix[1][1], matrix[2][2]) == true) {
			winner= matrix[0][0];
			}
		if (checkChars(matrix[0][2], matrix[1][1], matrix[2][0]) == true){
			winner= matrix[0][2];
			}
		// petlja za provjeru ako je pobjeda u redovima ili kolonama
		for (int i = 0; i < 3; i++) {
    		//uslov za provjeru znakova u redovima
          if (checkChars(matrix[i][0], matrix[i][1], matrix[i][2]) == true) {
        	  winner= matrix[i][0];
        	  break;
            }
          	//uslov za provjeru znakova u kolonama
          else if(checkChars(matrix[0][i], matrix[1][i], matrix[2][i]) == true){
        	  winner= matrix[0][i];
        	  break;
          }
        }
		return winner;
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
