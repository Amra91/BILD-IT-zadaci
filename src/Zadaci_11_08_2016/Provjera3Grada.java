package Zadaci_11_08_2016;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese imena tri grada te ih ispiše u abecednom redu. 
 * Na primjer, ukoliko korisnik unese Chicago, Los Angeles i Atlanta kao gradove, 
 * program vraæa Atlanta, Chicago, Los Angeles.
 */
public class Provjera3Grada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			Scanner unos = new Scanner(System.in);
			System.out.print("Unesite tri grada: ");
			String a = unos.next().toUpperCase();			//unos prvog grada
			String b = unos.next().toUpperCase();			//unos drugog grada
			String c = unos.next().toUpperCase();			//unos treceg grada

			unos.close(); 		//zatvaranje scannera
			System.out.println("Gradovi prema abecednom redoslijedu: ");
			
			// ubacivanje gradova u niz od 3 elementa
			String [] gradovi = {a,b,c};
			
			//metodom arrays.sort (sortirati niz)
			Arrays.sort(gradovi);
			
			//for each petljom printati gradove
			for (String e: gradovi){
				System.out.println(e);
				
			}
			
			
			
		/*	if (prviGrad.compareTo(drugiGrad) <= 0
					&& prviGrad.compareTo(treciGrad) <= 0) {
				if (drugiGrad.compareTo(treciGrad) < 0) {
					System.out.println(prviGrad + " " + drugiGrad + " " + treciGrad);
				} else {
					System.out.println(prviGrad + " " + treciGrad + " " + drugiGrad);
				}
			} 
			
			else if (drugiGrad.compareTo(prviGrad) <= 0
					&& drugiGrad.compareTo(treciGrad) <= 0) {
				if (prviGrad.compareTo(treciGrad) < 0) {
					System.out.println(drugiGrad + " " + prviGrad + " " + treciGrad);
				} else {
					System.out.println(drugiGrad + " " + treciGrad + " " + prviGrad);
				}
			} 
			
			else if (treciGrad.compareTo(prviGrad) <= 0
					&& treciGrad.compareTo(drugiGrad) <= 0) {
				if (prviGrad.compareTo(drugiGrad) < 0) {
					System.out.println(treciGrad + " " + prviGrad + " " + drugiGrad);
				} else {
					System.out.println(treciGrad + " " + drugiGrad + " " + prviGrad);
				}
		*/	

	
	
		

	

}
}

