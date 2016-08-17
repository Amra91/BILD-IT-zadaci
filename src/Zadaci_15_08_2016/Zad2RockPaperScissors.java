package Zadaci_15_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Napisati program koji igra sa protivnikom rock-paper-scissors. 
 * (papir-bunar-makaze ili tako nekako po naški) 
 * Program nasumièno generiše brojeve 0, 1 i 2 
 * koji predstavljaju papir, bunar i makaze. 
 * Program pita korisnika da unese 0, 1 ili 2 
 * te mu ispisuje poruku da li je korisnik pobijedio, 
 * da li je raèunar pobijedio ili je bilo neriješeno. 
 */
public class Zad2RockPaperScissors {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Enter 0 for rock, 1 for paper and 2 for scissors:");
 	
		int user=checkIn();	
		// petlja za ponovni unos dok ne bude 0,1 ili 2
		while (!(user==0 || user ==1 || user==2)){
			System.out.println("Invalid input"
					+ "\nEnter 0 for rock, 1 for paper and 2 for scissors:");
			user =checkIn();
			
		}
		// math random odreduje koji broj kompjuter od 0 do 2
		switch((int)(Math.random()*3)){
 			case 0:
 				rock(user);
 				break;
 		
 			case 1:
 				paper(user);
 				break;
 			
 			case 2:
 				scissors(user);
 				break;
			}
	}
	//metoda ako je kompjuter kamen
		
	public static void rock (int player){
		//rezultati igranja
			switch(player){
				case 0:
					System.out.println("Comp je kamen. Vi ste kamen. Nerijesno");
					break;
				case 1:
					System.out.println("Comp je kamen. Vi ste papir. Pobjedili ste.");
						break;
				case 2:
					System.out.println("Comp je kamen. Vi ste makaze. Izguili ste.");
						break;
				
				
			}
		}
	//metoda ako je kompjuter papir 	
	public static void paper (int player){
		//rezultati igranja
		switch(player){
			case 0: 
				System.out.println("Comp je papir. Vi ste kamen. Izgubili ste.");
					break;
			case 1:
				System.out.println("Comp je papir. Vi ste papir. Nerijeseno");
					break;
			case 2:
				System.out.println("Comp je papir. Vi ste makaze. Pobjedili ste");
					break;
				
		}		
	}
	//metoda ako je kompujter makaze
	public static void scissors (int player){
		//rezultat igranja
		switch(player){
			case 0:
			System.out.println("Comp je makaze. Vi ste kamen. Pobjedili ste.");
				break;
			case 1:
				System.out.println("Comp je makaze. Vi ste papir. Izgubili ste.");
	 				break;
			case 2:
				System.out.println("Comp je makaze. Vi ste makaze. Nerijeseno");
					break;
		}
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

