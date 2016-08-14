package Zadaci_12_08_2016;
/*
 * Napisati metodu sa sljedeæim headerom: 
 * public static int isPrime(int n) koja provjerava da li je broj prost/prime. 
 * Napsati test program koji poziva ovu metodu 
 * i ispisuje sve proste brojeve u rasponu od 0 do 100000.
 */
public class Zad3_ProstBroj {

	public static void main(String[] args) {
		
	//  prvi prost broj je 2, brojevi 0 i 1 nisu prosti brojevi
	//	petlja ide od 2 do 100000 ne ukljucujuci i 100000 koji nije prost broj
		
		for (int i =2; i<100000; i++){
			if (isPrime(i)!=0){
				System.out.println(isPrime(i));
			}
		}
	}
	//provjera da li je broj prost
	public static int isPrime (int n){
		//vraca ako je prost broj, vraca vrijednost n
		int prime =n;
	
		//for petlja za provjeru brojeva 
		for(int i = 2; i < n; i++){
    		//uslov za provjeru da li je broj djeljiv sa nekim brojem
            if(n%i == 0){
            	 prime = 0;
            	break;
            }
               
        	}
		// vracanje da broja, ako vraca 0, znaci nije prost broj
		return prime;

}
}
