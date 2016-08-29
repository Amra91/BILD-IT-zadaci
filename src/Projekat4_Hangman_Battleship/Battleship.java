package Projekat4_Hangman_Battleship;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Battleship {

	static Scanner in = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		// prvi igrac i i postavljanje brodova
		
		System.out.println("Igrac 1: ");
		System.out.println("__________________________________________________");
		int[][] player1 = new int[10][10];
		int [][] forPlayer2 = new int[10][10]; 	//za prikaz kod drugog protivnika, prikaz matrice kod igraca 2
		player1= setShips(player1);
		printOurShips(player1);
		System.out.println("*********************************************");
		
		//drugi igrac i postavljanje brodova
		System.out.println("Igrac 2: ");
		System.out.println("__________________________________________________");
		int[][] player2 = new int[10][10];
		int [][] forPlayer1 = new int[10][10]; 	//za prikaz kod drugog protivnika, prikaz matrice kod igraca 1
		player2= setShips(player2);
		printOurShips(player2);
		System.out.println("**********************************************");
		System.out.println("Igra pocinje:");
		boolean gameOn = true; 
		
		while(gameOn){	
			
			System.out.println("///////////////////////////////////////////");
			System.out.println("Igrac 1: "); //igrac 1
				player1=afterShooting(player1,forPlayer2);	//matrica za prikaz ga gubicima koje smo imali na brodu
				printOurShips(player1);
			System.out.println("\nIgrac 1: Gdje zelite da pucate [ X-pogodak, *-promasaj]: "); //15 kockica su zauzeli brodovi, min 15 pucnjeva mora biti 
				printForOtherPlayer(forPlayer1);//metoda za prikaz gdje da se puca na igraca 2
				forPlayer1 =shoot(player2, forPlayer1);//metoda za pucanje
				// ukoliko igrac je vec pucao na odredjenu metu i pogodio, tada mu se pise promasaj
			System.out.println("\nIgrac 1: Prikaz pogodaka [ X - pogodak, * - promasaj ]");
				printForOtherPlayer(forPlayer1);
			if (isWin(forPlayer1)){
					System.out.println("Potopili ste brodove.\nPobjedio je igrac 1!");
						gameOn=false;
					break;
			}
			
			System.out.println("///////////////////////////////////////////");
			System.out.println("Igrac 2: ");	//igrac2
			player2=afterShooting(player2,forPlayer1);	//matrica za prikaz ga gubicima koje smo imali na brodu
				printOurShips(player2);
			System.out.println("\nIgrac 2: Gdje zelite da pucate [ X-pogodak, *-promasaj]: ");
				printForOtherPlayer(forPlayer2);//metoda za prikaz gdje da se puca na igraca 2
				forPlayer2 =shoot(player1, forPlayer2);//metoda za pucanje
			System.out.println("\nIgrac 2: Prikaz pogodaka [ X - pogodak, * - promasaj])");
				printForOtherPlayer (forPlayer2);
			if (isWin(forPlayer2)){
					System.out.println("Potopili ste brodove.\nPobjedio je igrac 2!");
						gameOn=false;
					break;
				}
		}
	}
	
	public static int[][] setShips(int[][] player){
		
		//postavljanje svih 5 brodova za igrace
			player = shipsChose(player, 5);
			printOurShips(player);
			player= shipsChose(player, 4);
			printOurShips(player);
			player = shipsChose(player,3);
			printOurShips(player);
			player = shipsChose(player,2);
			printOurShips(player);
			player = shipsChose(player,1);
			printOurShips(player);
			
		return player;
	}
	
	//postavljanje brodova [aircraft, battleship, cruser, destrayer, submarine] 
	public static int[][] shipsChose(int[][] player, int ship){
		
		//uslov koji se brod postavlja 
		switch(ship){
			case 1:	System.out.println("Gdje zelite postaviti brod submarine(1 pozicija):"); break;
			case 2:	System.out.println("Gdje zelite postaviti brod destrayer(2 pozicije):"); break;
			case 3:	System.out.println("Gdje zelite postaviti brod cruser(3 pozicije):"); break;
			case 4: System.out.println("Gdje zelite postaviti brod battleship(4 pozicije):"); break;
			case 5: System.out.println("Gdje zelite postaviti brod aircraft(5 pozicija):"); break;
		}
	
		System.out.println("Da li zelite horizontalno ili vertikalno postaviti brod \n[0 - horizontalno, 1- vertikalno]");
		int horVer = checkIn();
				while(horVer<0 || horVer>1){
							System.out.println("Mozete unijeti samo 0 za horizontalno i 1 za vertikalno");
							horVer= checkIn();
					}
		
		int maxRow=0;		//predstavlja maximalni red za unos broda
		int maxCol=0;		//predstavlja maximalnu kolonu za unos broda
		
				//ukoliko je unos horizontalno
			if (horVer==0){
					maxRow=9;      // red moze imati opcije od 0 do 9- jer nece se desiti IndexOutOfRangeException
					maxCol=player.length-ship; 		//kolona mora biti smanjena za velicinu broda, inace ce se desiti IndexOutOfRangeException	
			}
				//ukoliko je unos vertikalno
			else{
					maxRow=player.length-ship;	   //red mora biti smanjen za velicinu broda, inace ce se desiti IndexOutOfRangeException
					maxCol=9;			//kolona moze imati opcije od 0 do 9- jer nece se desiti IndexOutOfRangeException
			}
			
		int row=0;	//red od kojeg se ubacuje brod
		int col=0;	//kolona od koje se ubacuje brod
		boolean check= false; //za printanje u matrici
			
		do{		
				 
					 if (check==true){ //samo za printanje da se zna da je mjesto zauzeto i da se ponovo mora postavit brod
					System.out.println("Mjesto je zauzeto za postavljanje broda, unesite ponovo:");
								check=false;
							}
					//unos za red od kojeg pocinje brod
					System.out.println("U kojem redu zelite da pocinje brod, unos od 0 do "+ maxRow);
						row =checkIn();
							// ukoliko se unese broj manji od 0 i veci od maximalnog reda
							while (row<0 || row>maxRow){
									System.out.println("Unesite ponovo od 0 do "+ maxRow);
									row = checkIn();
								}

					//unos za kolonu od koje pocinje brod
					System.out.println("U kojoj koloni zelite da pocinje brod, unos od 0 do "+ maxCol );
					 	col = checkIn();
					 		//ukoliko se unese broj manji od 0 i veci od maksimalne kolone
					 		while (col<0 || col>maxCol){
					 				System.out.println("Unesite ponovo od 0 do "+ maxCol);
					 				col = checkIn();
					 			}
					 	check= true;
						
				} while(!isReserved(horVer,row,col,ship,player));	// za provjeru da li ima vec brod na toj poziciji
		
				player = addShip(horVer, row,col,ship,player);	//dodavanje brodova u matricu player
				
		return player;	
	}
	
	
	//metoda za provjeru da li je unesen brod na tu poziciju vec
	public static boolean isReserved (int horVer, int row, int col, int ship, int[][] player){
		
		if (horVer==0){	//provjera za horizontalno
				for (int i=0; i< ship; i++){
					if (player[row][col+i]==1){
						return false;
					}
				}
		}
		if (horVer==1){	//provjera za vertikalno
				for (int i=0; i< ship; i++){
					if (player[row+i][col]==1){
						return false;
					}
				}
		}
		return true;
	}
	
	//ubacivanje broda zavisno od velicine broda [najveci brod 5 pozicija zauzima, a najmanji 1 pozicju] 
	//  brod se oznacava sa "1" u matrici 
	public static int[][] addShip(int horVer, int row, int col, int ship, int[][] player){
		
		if (horVer==0){  //horizontalno ubacivanje
				for (int i=0; i<ship; i++){
							//kolona se povecava za i, a red ostaje isti
							player[row][col+i]=1;
				}
		}
		if (horVer==1){	 		//vertikalno ubacivanje
				for (int i=0; i<ship; i++){
						//red se povecava za 1, a kolona ostaje ista
						player[row+i][col]=1;
				}
		}
		return player;
	}
	
	// metoda za printanje nase matrice sa pregledom gdje su nam postavljeni brodovi i da li su pogodjeni
	public static void printOurShips(int[][] player){
		
		System.out.println("Vas brod je pod znakom #, pogodjeni brodovi su X: ");
		System.out.println("    0  1  2  3  4  5  6  7  8  9 ");
		for (int i=0; i< player.length; i++){
			
			System.out.print( i + "   ");
			for (int j=0; j<player[i].length; j++){
				
				//if uslov ukoliko je brod postavljen tu, printa se %
				if (player[i][j]==1){
					System.out.print("#" + "  ");
				}
				//if uslov ukoliko je pogodjen nas brod, printa se X
				else if (player[i][j]==-1){
					System.out.print("X"+ "  ");
				}
				//ukoliko je 0; printa se "~"
				else if (player[i][j]==0){
					System.out.print("~"+ "  ");
				}
			}
			System.out.println();
		}
	}
	
	//metoda koja predstavlja pucanje
	public static int[][] shoot (int[][] player ,int[][] matrix){
		
		System.out.println("Unesite gdje zelite da pucate u redu, od 0 do 9: ");
		int row = checkIn();
		
		System.out.println("Unesite gdje zelite da pucate u koloni, od 0 do 9:");
		int col = checkIn();
		
		//uslov ako je pucano vec na to mjesto da se ne moze opet pucati
		while(player[row][col]==-1 || matrix[row][col]==-1){
					System.out.println("Vec ste pucali na tu poziciju, Pucajte  ponovo.");
					System.out.println("Unesite gdje zelite da pucate u redu, od 0 do 9: ");
					 row = checkIn();
					System.out.println("Unesite gdje zelite da pucate u koloni, od 0 do 9:");
					 col = checkIn();
		}
		
		//uslov ukoliko je mjesto sa tim redom i kolonom jednako 1 (1 predstavlja brod)
		if (player[row][col]==1){
					//postavljanje matrice za prikaz kod drugog igraca kada je pogodak
						matrix[row][col]=1;
			}
		else{
					//postavljanje matrice za prikaz kod drugog igraca kada je promasaj
						matrix[row][col]=-1;
			}
		return matrix;
	}
	
	//metoda koja predstavlja nas brod nakon pucanja, prikaz sa pogodjenim mjestima
		public static int[][] afterShooting (int[][] player ,int[][] matrix){
			
			
			for (int i=0; i<matrix.length; i++){
				for (int j=0; j<matrix[i].length; j++){
					if (matrix[i][j]==1){
							player[i][j]=-1;
					}
				}
			}
			return player;
		}
	
	//metoda koja printa matricu na koju se puca
	public static void printForOtherPlayer(int[][] matrix){
		
		System.out.println("    0  1  2  3  4  5  6  7  8  9 ");
		for(int i=0 ;i<matrix.length; i++){
			
			System.out.print( i + "   ");
			for (int j=0; j<matrix[i].length; j++){
				
				//if uslov ukoliko je pogodjen brod, printa se X
				if (matrix[i][j]==1){
					System.out.print("X" + "  ");
				}
				//if uslov ukoliko je promasen brod, printa se *
				else if (matrix[i][j]==-1){
					System.out.print("*"+ "  ");
				}
				//ukoliko je 0; printa se "~"
				else if (matrix[i][j]==0){
					System.out.print("~"+ "  ");
				}
			}
			System.out.println();
		}
	}
	
	//metoda za provjeru da li si pobjedio i sa njom zavrsava se igra
	public static boolean isWin(int[][] matrix){
		
		int counter =0; //brojac pogodaka
		
		for (int i=0; i<matrix.length; i++){
			for (int j=0; j<matrix[i].length; j++){
				if (matrix[i][j]==1){
					counter++;
				}
			}
		}
		if (counter==15){ //brojac mora da bude 15, jer toliko su prostora zauzeli brodovi
			return true;
		}
		else{
			return false;
		}	
	}
	// metoda za provjeru unosa 
	public static int checkIn(){
			
			int num =0;
			boolean checkIn = true;
			do{// do while petlja da se izvrsava sve dok ne bude korektan unos
				try{//try blok provjerava unos
					num = in.nextInt();
					checkIn= false;
				}
				catch (InputMismatchException e) { // hvatanje izuzetka
				    System.out.println("Input MIsmatch Exception, unesite ponovo;"); 
				    in.nextLine();
				}
			}while(checkIn);
			return num;
		}
}