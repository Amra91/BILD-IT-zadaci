package Zadaci_24_08_2016;

import java.math.BigInteger;

/*(Divisible by 5 or 6) 
 * Find the first ten numbers greater than Long.MAX_VALUE that are divisible by 5 or 6. 
 */
public class DivisibleBy5Or6 {
	
	public static void main(String[] args) {

       // num vrijednost je najveca long vrijednost
        BigInteger num = new BigInteger(Long.MAX_VALUE+"");
        
        //num vrijednosti dodajemo 1 [BigDecimal.ONE -konstanta za 1 kod BigInteger brojeva]
        num = num.add(BigInteger.ONE);
        
        //brojac
        int count = 0;
        
        System.out.println("10 brojeva koji su djeljivi sa 5 ili 6 su:");
        while (count < 10) {
        	
        	//uslov koji provjerava da li je ostatak dijeljenja sa 5 ili 6 jednak 0
            if (num.remainder(new BigInteger(5+"")).equals(BigInteger.ZERO) ||
                num.remainder(new BigInteger(6+"")).equals(BigInteger.ZERO)) {
            	//inkrementiranje brojaca
            	count++;
                System.out.println(num);
            }
       
            //dodavanje jedinice na num vrijednosti
            num = num.add(BigInteger.ONE);
        }
    }
}
