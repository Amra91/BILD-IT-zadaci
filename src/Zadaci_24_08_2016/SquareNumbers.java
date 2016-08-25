package Zadaci_24_08_2016;

import java.math.BigInteger;

/* (Square numbers) 
 * Find the first ten square numbers that are greater than Long.MAX_VALUE. 
 * A square number is a number in the form of n2. 
 * For example, 4, 9, and 16 are square numbers. 
 * Find an efficient approach to run your program fast
 */
public class SquareNumbers {

	
	public static void main(String[] args) {
		
		// BigInteger broj za provjeru je  Long.MAX_VALUE uvecan za 1
		//9223372036854775807
		
		//3037000499 je  priblizno korijen od max vrijednosti long
		long x = (long)Math.sqrt(Long.MAX_VALUE);
		//uvecan za 1 
		x++;
		
		//brojac
		int count=0;
		
		System.out.println("10 square numbers that are greater than Long.MAX_VALUE is:");
		
		while(count<10){
				//biginteger postaje korijen od Long.MAX_VALUE uvecan za 1
				BigInteger square = new BigInteger(x+"");
				// petoda pow racuna kvadrat broja x
				square = square.pow(2);
						System.out.println(square);
					count++;
					x++;
			} 
			
		
		
	}
	
		
	
}
