package Zadaci_09_08_2016;
/*
 * Napišite program koji ispisuje sve brojeve, od 100 do 1000, 
 * 10 brojeva po liniji, koji su djeljivi i sa 5 i sa 6. 
 * Razmak izmeðu brojeva treba biti taèno jedan space. 
 */
public class BrojeviDjeljiviSa5i6 {

	public static void main(String[] args) {
	
	int counter = 1; // brojac cijelih brojeva djeljivih sa 5 i 6
		// petlja za provjeru brojeva od 100 do 1000
		for (int i=100; i<=1000; i++){
			//uslov da li su djeljivi
			if ((i%5 == 0) && (i%6== 0)){
				System.out.print(" " + i);
				//uslov ako je isprintano 10 brojeva da prebaci u novi red
				if (counter==10){
					System.out.println();
					counter=0;
					}
				counter++;
			}
		}
	}
}
