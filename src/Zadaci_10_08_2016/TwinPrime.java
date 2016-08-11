package Zadaci_10_08_2016;
/*
 * Twin prime brojevi su par prostih brojeva koji se razlikuju za 2. 
 * Na primjer, brojevi 3 i 5 su twin primes, brojevi 5 i 7 i 11 i 13 su takoðer twin primes. 
 * Napisati program koji ispisuje sve twin prime brojeve manje od 10000, 
 * 10 parova po liniji. 

 */
public class TwinPrime {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dva =0; //provjera drugog broja
		int brojac=0; //brojac twin prime brojeva
		
		System.out.println("Svi twin primes brojevi do 10000 su: ");
		
		//for petlja ide do 9998 jer na zadnji broj dodaje se 2
		for (int i=2; i<9998; i++){
			// za provjeru drugog broja koji je za dva veci
			dva =i+2;
			//uslov ako je prvi broj prost i ako je broj uvecan za dva prost
			if (prime(i)== true && prime(dva)==true){
				System.out.print( "["+ i + " " + dva + "]    " );
				brojac++;	//inkrementiranje brojaca
				//if za prelazak u novi red
				if (brojac ==10){
					System.out.println();
					brojac=0;
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
