package Zadaci_04_08_2016;
/*
 * Napisati metodu koja printa 100 nasumiènih uppercase karaktera 
 * i 100 nasumiènih brojeva, 10 po liniji.
 */
public class CetvrtiZadatak {
	
	public static void main(String[] args) {
	
		//metoda za printanje slova i brojeva
	metodaZaPrintanjeSlovaIBrojeva();
	
		
	}
	//metoda za printanje slova i brojeva
	// ovo je uradjeno da ne bi bilo greske jer je napisano metodu
	
	public static void metodaZaPrintanjeSlovaIBrojeva(){
		//pozivanje metode za printanje uppercase karaktera; 10 po liniji
		
				printUPPERCASEkarakter();
				
				
				//pozivanje metode za printanje random brojeva od 0 do 100; 10 po liniji
				printRandomBrojeve();
	}
	
	
	
	//metoda za printanje random uppercase karaktera
	public static void printUPPERCASEkarakter (){
		
		System.out.println("Nasumicni UPPERCASE karakteri:\n");
		// petlja za prinatnje 100 karaktera
			for (int i = 1; i<=100; i++){
				//prinatnje metode za random karakter uppercase
				System.out.printf("%4c",slovo (i));
					//uslov ako je isprintano 10 slova po liniji da prebaci u novi red
					if (i %10==0){
						System.out.println();
					}
			}
			System.out.println("******************************************\n");
	}
	
	public static void printRandomBrojeve(){
		System.out.println("Nasumicni brojevi [od 0 do 100] :\n");
		//petlja za printanje 100 nasumicnih brojeva	
			for (int j = 1; j<=100; j++){	
				// printanje metode za random broj od 0 do 100
				System.out.printf("%4d",broj (j));
					// uslov ako je isprintano 10 brojeva po liniji da prebaci u novi red
					if (j %10==0){
						System.out.println();
					}
			}
			System.out.println("******************************************\n");
	}
	
	
	//metoda za random slovo,return tip metode je char
	public static char slovo (int a){
		
		// return tip vraca random karakter velikog slova od "A do Z".
		// 65 predstavlja ASCII kod za slovo "A", a 26 = 90-25+1; 90 je ASCII kod za slovo "Z"
		return(char)( 65 + (int)(Math.random()*26));
	}
	//metoda za random broj, retun tip metode je int
	public static int broj (int i){
		
		//return tip vraca random slovo u rasponu od 0 do 100
		return (int)(Math.random()*100);
	}
}


