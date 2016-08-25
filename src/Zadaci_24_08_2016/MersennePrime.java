package Zadaci_24_08_2016;

import java.math.BigInteger;

/*
 *  (Mersenne prime) 
 *  A prime number is called a Mersenne prime 
 *  if it can be written in the form 2p - 1 for some positive integer p. 
 *  Write a program that finds all Mersenne primes with p … 100 
 *  and displays the output as shown below. 
 *  (Hint: You have to use BigInteger to store the number, 
 *  because it is too big to be stored in long. 
 *  Your program may take several hours to run.)
      p        2^p – 1
      2           3      
      3           7      
      5          31 
      ... 
 */
public class MersennePrime {

	
public static void main(String[] args) {
		
		//dva je osnova za stepenovanje
		BigInteger two = new BigInteger (2+"");
		
		//eksponenti su prosti brojevi i krecu od 2
		int prime = 2;
		
		//brojac mersenne prostih brojeva
		int count =0;
		
		//BigInteger mersenne
		BigInteger mersenne ;
		
		System.out.println("prime"+ "                 2^prime-1");
		
		while (count <100){
			
			// uslov ako je broj prost
			if (isPrimeInt(prime)){
				
				// mersenne broj dobivamo tako sto osnovu 2 
				//stepenujemo sa prostim brojem 
				// i oduzmemo 1 (2^prime-1)
				mersenne = two.pow(prime);
				mersenne= mersenne.subtract(BigInteger.ONE);
			
				// provjera da li je dati broj prost broj
				if (isPrime (mersenne)){
					
					System.out.printf( "%-4d %17s %d\n",prime,"",mersenne);
					
					//inkrement brojaca
					count++;
				}
			}
			// inkrement prostog broja
			prime++;
			
		}
		
	}
	
	//provjera za int broj da li je prost
	public static boolean isPrimeInt (int num){
        
		//ako su brojevi manji od 1, nije prost broj     
		if (num <= 1) {
                return false;
            }
		
		//ako je broj 2, onda je prost broj;
        if (num == 2) {
                return true;
            }
        
        //ako je paran broj, onda nije prost broj
        if (num % 2 == 0) {
                return false;
            }
        
        //for petlja za provjeru prostih brojeva od 3 do korijena broja num, provjera za svaki drugi broj
        for (int i = 3; i <= Math.sqrt(num) + 1; i = i + 2) {
            
        	//ako je broj djeljiv sa i, nije prost broj   
        	if (num % i == 0) {
                    return false;
                }
            }
        return true;
        
	}
	
	// provjera prostih brojeva za BigInteger brojeve
	public static boolean isPrime (BigInteger mersenne){
		
		/* da bi dobili prost broj za provjeru 
		 * prvo cemo mersenne broj oduzeti za 1, 
		 * pa ce se naci sljedeci prost broj sa metodom nextProbablePrime()
		 * od mersenne broja umanjenog za 1
		 */
		BigInteger nextPrime = mersenne.subtract(BigInteger.ONE);
				nextPrime = nextPrime.nextProbablePrime();
		
		
		// ako je sljedeci prost broj jednak mersene broju, vracamo da je tacno
		if (nextPrime.equals(mersenne)){
			return true;
		}
		return false;
		
	}
}
