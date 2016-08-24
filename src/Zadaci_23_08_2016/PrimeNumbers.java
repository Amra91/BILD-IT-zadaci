package Zadaci_23_08_2016;
/*
 *  (Displaying the prime numbers) 
 *  Write a program that displays all the prime numbers less than 120 in decreasing order. 
 *  Use the StackOfIntegers class to store the prime numbers (e.g., 2, 3, 5, ...) 
 *  and retrieve and display them in reverse order.
 */
public class PrimeNumbers {

	public static void main(String[] args) {
		
		//kreiranje objekata
		StackOfIntegers stack = new StackOfIntegers();
		
		//petlja za provjeru prostih brojeva
		 for (int i = 2; i <= 120; i++) {
	          
	    	  //ako metoda vraca ako je prost broj;
	        	if(prime (i) == true){
	            	stack.push(i);
	        	}
		 }
		 System.out.println("Prosti brojevi su:");
		//printanje od zadnjeg do prvog i brisanje istih iz niza
		 while (!stack.empty()) {
			 System.out.print(stack.pop() + " ");    
			 } 
		 
		 
	}
	
	//provjera da li je broj prost
		public static boolean prime (int n){
				
				boolean isPrime=true;
				
				//for petlja za provjeru brojeva od 2 do n, ne ukljucujuci i n
		        for(int i=2; i<n; i++){
		        		//uslov za provjeru da li je broj djeljiv sa nekim brojem
		                if(n%i == 0){
		                	isPrime =false;
		                break;
		                }
		                   
		            }
		        // vracanje da li je prost broj
		        return isPrime;

		}
	
	
}

	  