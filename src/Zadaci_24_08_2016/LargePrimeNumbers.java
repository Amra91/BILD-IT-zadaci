package Zadaci_24_08_2016;

import java.math.BigInteger;
/* (Large prime numbers) 
 * Write a program that finds five prime numbers larger than Long.MAX_VALUE. 
 */
public class LargePrimeNumbers {
	
	public static void main(String[] args) {
		

		//kreiranje objekta big integer sa najvecim long brojem
		BigInteger num = new BigInteger(Long.MAX_VALUE+ "");
		
		int counter=0; //brojac
		
		BigInteger prime;
		System.out.println("Prosti brojevi:");
		

		//uslov za pronalazak 5 brojeva
		while(counter<5){
		
			//metoda nextProbablePrime(); 
			//pronalazi sljedeci prime broj veci od num
			//metoda provjerena na manjim brojevima
			
			prime =num.nextProbablePrime();
			System.out.println(prime);
			//brojac se inkrementira
			counter++;
			//num postaje prime, tako da sljedeca provjera krece od nove num vrijednosti
			num = new BigInteger(prime+"");
		}

	}

}
