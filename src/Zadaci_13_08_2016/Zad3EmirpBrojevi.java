package Zadaci_13_08_2016;

/*
 * Emirp brojevi (prime unazad) je nepalindromski prosti broj koji je prosti broj 
 * i kada ispi�emo naopako. 
 * Na primjer, broj 17 i broj 71 su prosti brojevi tako da su brojevi 
 * i 17 i 71 emirp brojevi. 
 * Napisati program koji ispisuje prvih 100 emirp brojeva, 10 brojeva po liniji. 
 */
public class Zad3EmirpBrojevi {

	public static void main(String[] args) {
		
		int counter =0; // brojac emirp brojeva
		int i=11;		// krecemo od 11 jer emirp brojevi su dvocifreni  
						//i zbog brzeg dobivanja rezultata jer cemo uvecavati provjeru za 2
		
		//uslov dok ne bude 100 emirp brojeva
		while (counter <100){
			
			// uslov da je broj emiro
			if(isEmirp(i)==true){
				System.out.print(i + " ");
				counter++;
				
				//uslov za prelazak u novi red
				if (counter%10==0){
					System.out.println();
				}
			}
			// povecanje broja za 2
			i+=2;
		}
		
		
	}
		
	public static boolean isEmirp(int n){
		// zamjena broja 
		int rev = zamjena(n);
		
		// ako je n i unazad broj isti vracamo false
		if (rev==n){
			return false;
		}
       
		// uslov ako su oba broja prosta vracamo true
        if (isPrime(rev) && isPrime(n)){
        	return true;
        }
        
        return false;
        
	}
	
	public static int zamjena(int n){
	
	
		int rev = 0;
		//zadnji broj koji se dodaje
		int zad =0;
    
		//while dok se ne zamjene svi brojevi
		while (n != 0) {
			zad = n % 10;				// ostatak kad se broj modulira sa 10
			rev = rev * 10 + zad;		//stavljanje zadnjeg broja na prvo mjesto
			n = n / 10;				//broj se umanjuje za 10
			}
	
		return rev;  
	}

		
	// metoda za provjeru da li je prost broj
	public static boolean isPrime(int n){
			
		//prosti brojevi ne mogu biti manji od 2 
		if(n < 2){
			return false;
		}
		
		// ako je provjera za 2, vracamo da je prost
		if(n == 2){
			return true;
		}
		
		//ako su brojevi 0 vracamo false;
		if((n & 1) == 0) {
			return false;
		}
	 
		//petlja od 3 do n; uvecavajuci se za dva, jer provjeramo neparne brojeve
			
		for(int i = 3; i <n; i+=2){
				if(n % i == 0) {
					return false;
				}
			}
			return true;
		}
				
}