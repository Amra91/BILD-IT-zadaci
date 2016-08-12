package Zadaci_11_08_2016;
/*
 * Napisati program koji ispisuje sve proste brojeve od 2 do 1000, 
 * ukljuæujuæi i 2 i 1000. 
 * Program treba da ispiše 8 brojeva po liniji 
 * te razmak izmeðu brojeva treba da bude jedan space.
 */
public class ProstiBrojevi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 int brojac =0;		//brojac prostih brojeva
		 
		 //for petlja za provjeru brojeva od 2 do 1000; ukljucujuci i 2 i 1000
	      for (int i = 2; i <= 1000; i++) {
	          
	    	  //ako metoda vraca da je prost broj; brojevi se printaju
	        	if(prime (i) == true){
	            	System.out.print(i+ " ");
	            	brojac++;
	            	
	            	// kaka se isprinta 8 brojeva prelazak u novi red
	            	if (brojac%8==0){
	            		System.out.println();
	            	}
	            }
	        	
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
