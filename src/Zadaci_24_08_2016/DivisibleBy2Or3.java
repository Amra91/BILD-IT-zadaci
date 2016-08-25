package Zadaci_24_08_2016;

import java.math.BigInteger;

/*(Divisible by 2 or 3) 
 * Find the first ten numbers with 50 decimal digits that are divisible by 2 or 3. 
 */
public class DivisibleBy2Or3 {
	
		public static void main(String[] args) {

			String numString = "1";
			//for petlja za dodjeljivanje 49 karaktera iza prvog karaktera 1 
			for (int i=0; i<49; i++){
				numString+=("0");
			}
	        
			//num predstavlja BigDecimal Vrijednost sa 50 decimala
			BigInteger num = new BigInteger(numString);

			//brojac
	        int count = 0;

	        System.out.println("Prvih 10 brojeva sa 50 decimala djeljivih sa 2 ili 3:");
	        while (count < 10) {

	        	//uslov ako je broj djeljiva sa 2 ili sa 3
	        	// remainder metoda predstavlja modulo broja
	          if (num.remainder(new BigInteger("2")).equals(BigInteger.ZERO) ||

	              num.divide(new BigInteger("3")).equals(BigInteger.ZERO)) {

	        	  	System.out.println(num);

	        	  	count++;

	          }
	          //povecanje BigInteger broja sa 1 
	          num = num.add(BigInteger.ONE);

	        }

      }
}

