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
		//prost broj je n
		int prime =n;
		// ako je n broj 2, vraca da je prost broj
		if (n==2){
			prime =2;
		}
	
		//for petlja za provjeru brojeva od 3 do n, povecavajuci ih za dva i ne ukljucujuci i n
		for(int i = 3; i < n;i+=2){
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
