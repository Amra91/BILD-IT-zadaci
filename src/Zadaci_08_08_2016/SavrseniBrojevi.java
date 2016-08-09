package Zadaci_08_08_2016;
/*
 * Pozitivni cijeli broj je savršen broj ukoliko je jednak zbiru svih svojih pozitivnih djelilaca, 
 * iskljuèujuæi sebe. 
 * Na primjer, 6 je prvi savršeni broj jer 6 = 3 + 2 + 1. 
 * Sljedeæi savršeni broj je 28 jer 28 = 14 + 7 + 4 + 2 + 1. 
 * Samo 4 savršena broja postoje u rasponu od 0 do 10.000. Napišite program koji ispisuje sva 4.
 */
public class SavrseniBrojevi {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int suma = 0;
		System.out.println("Savrseni brojevi su: ");
		
		// petlja za provjeru koji je broj savrsen od 1 do 10000
		for (int i = 1; i < 10000; i++) {
			
			// petlja za provjeru koji je broj djeljiv sa i
			for (int j = 1; j < i; j++) {
				
				//uslov ako je broj i djeljiv sa j da se doda taj broj sumi
				if (i % j == 0) {
					suma += j;
				}
			}
			
			// uslov ako je zbir svih svojih pozitivnih djelilaca, iskljuèujuæi sebe jednak broju 
			if (suma == i) {
				System.out.print(i + " ");
			}
			// postupak krece ponovo
			suma = 0;
		}
		
	}
}
