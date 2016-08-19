package Zadaci_18_08_2016;
/*
 * 7.13 (Random number chooser) 
 * Write a method that returns a random number between 1 and 54, 
 * excluding the numbers passed in the argument. 
 * The method header is specified as follows:
 * public static int getRandom(int... numbers) 
 */
public class Zad2_RandomNumberChooser {

	public static void main(String[] args) {
		
		//printamo random broj izmedju 1-54 sa izuzetkom brojeva koji su prosljedjeni
		System.out.println("Random broj je: "+getRandom(7,2,5,8,4,5,6,45));
		
		
	}
	public static int getRandom(int... numbers){
		
		//random brojevi idu od 1 do 54
		int randomNumb = 1+(int)(Math.random()*54);
		
		//Kada random broj bude razlicit od brojeva koji su prosljedjeni
		//while petlja zavrsava i vraca random broj
		while(check(randomNumb, numbers) != true){
			randomNumb = 1+(int)(Math.random()*54);
		}
		return randomNumb;
	}
	
	
	public static boolean check(int randomNumb, int...numbers){
		boolean status = true;
		//Provjeravamo da li je random broj jednak prosljedjenim brojevima
		for(int i=0; i<numbers.length; i++){
			if(numbers[i] == randomNumb){
				status = false;
				break;
			}
		}
		
		return status;
	}
}
