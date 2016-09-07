package Zadaci_06_09_2016;
/*
 *  Write a recursive method to compute the following series:
 *  m(i) = 1 + 1/2 + 1/3 + ... + 1/i
 *  m(i) for i = 1, 2, . . ., 10 
 */

public class Zadatak_18_4_SumSeries {

	public static void main(String[] args) {
		
			// for petlja za brojeve od 1,2,..10
	        for (int i = 1; i <= 10; i++) {
	        	
	            System.out.println( m(i));
	        }

	    }

	    public static double m(int i) {
	     
	    	//uslov zaustavljanja rekurzije, osnovni slucaj
	        if (i == 1){
	        	
	            return 1;
	        }
	        else{
	        	// 1/i + rekurzivni poziv 
	            return 1.0 / i + m(i-1);
	        }
	    }
}

