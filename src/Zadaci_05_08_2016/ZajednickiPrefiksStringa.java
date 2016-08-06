package Zadaci_05_08_2016;

import java.util.Scanner;

/*
 *  Napisati program koji pita korisnika da unese 2 stringa 
 *  te ispisuje najveæi zajednièki prefix za ta dva stringa, ukoliko isti postoji. 
 *  Na primjer, ukoliko korisnik unese sljedeæa dva stringa "Dobrodošli u Dubai" i 
 *  "Dobrodošli u Vankuver" program treba da ispiše: 
 *  Najveæi zajednièki prefix za dva stringa je "Dobrodošli u". 
 */
public class ZajednickiPrefiksStringa {

	public static void main(String[] args) {
		/*
		 * 
		 */
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Unesi prvi string");
		String str1 = in.nextLine();    			// string prvi koji se unose
		String[] niz1 = str1.split("\\s"); 			//niz od prvog stringa
		
		System.out.println("Unesi drugi string");
		String str2 = in.nextLine();				//string drugi koji se unese
		String[] niz2 = str2.split("\\s");			//niz od drugog stringa
		
		String prefix = "";							//zajednicki prefiks krece od pocetka stringova
		
		for(int i=0; i<niz1.length; i++){			// petlja za provjeru stringova
			
			if(niz1[i].equals(niz2[i])){			//provjera da li je string isti
				
				prefix =prefix+" "+ niz1[i];			// kreiranje zajednickog prefiksa
				 
			}
			else{
				break;								
			}
		}
		
		System.out.println("String 1 je: "+ str1);
		System.out.println("String 2 je: "+ str2);
		if(prefix == ""){
			System.out.println("U unijetim stringovima NEMA prefixa");
		}
		else{
			System.out.println("Prefix je:"+prefix);
		}
		
		
		in.close();
	}
}
