package Zadaci_13_08_2016;
/*
 * Palindrome prime je prosti broj koji je takoðer i palindrom. 
 * Na primjer, 131 je palindrome prime, kao i brojevi 313 i 757. 
 * Napisati program koji ispisuje prvih 100 palindrome prime brojeva, 
 * 10 brojeva po liniji. 
 */
public class Zad4Palindrom {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Palindrome prime:");
		// petlja krece od 11; jer palindrom mora imati min 2 karaktera
		int i=11;	
		//brojac palindrome prime brojeva
		int counter=0;
		
		// while uslov dok ne bude 100 brojeva palindrome prime
		// svaki put se uvacava za 2 jer provjerava samo neparne brojeve
		while (counter<100){
			// if uslov ako je broj palindrom i ako je prost broj
			if (isPrime(i)== true && isPalindrome(i)==true){
				System.out.print(i+" ");
				counter++;
				// uslov za prelazak u novi red
				if (counter%10==0){
					System.out.println();
				}
			}
			//uvecanje za dva, zbog brze provjere
			i+=2;
		}
	}
	
	// metoda za provjeru da li je prost broj
	public static boolean isPrime(int n) {
	  
		//for petlja do n trazenog broja 
		for ( int i = 2; i< n; i++){
		   
			// if uslov ako je broj djeljiv sa bilo kojim brojem
			//osim 1 i samim sobom, taj broj nije palindrom i vraca false
	        if(n%i==0){
	            return false;
	            
	        }
	   }
	    return true;
	}
	
	
	// boolean provjera da li je palindorm na osnovu reverse metode
	public static boolean isPalindrome(int number){
		
		//uslov ako je reverse metoda jednaka unesenom broju
		//status je true vraca da je broj palindrom
		if (reverse (number)== number){
			 return true;
			}
		
		else {
			return false;
		}
	}
	public static int reverse(int number){
		
		int n = 0;
		
		//novi broj n postaje reverse broj
		for(int i = number; i !=0; i /= 10) {
		        n = n * 10 + i % 10;
		    }  
		
		 return n;  
	}
}
