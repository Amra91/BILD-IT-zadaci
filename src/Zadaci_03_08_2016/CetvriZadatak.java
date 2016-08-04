package Zadaci_03_08_2016;


import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Napisati metodu koja vraæa lokaciju najveæeg elementa u 2D nizu. 
 * Metoda treba da koristi sljedeæi header:
		public static int[ ] locateLargest(double[ ][ ] a)
  *Napisati test program koji pita korisnika da unese 
  *2D niz te mu ispisuje lokaciju najveæeg elementa u nizu.
 */
public class CetvriZadatak {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		
		System.out.println("Koliku zelite matricu NxN, \nN je :" );
		// n predstavlja dimenzije matrice [nxn]
		int n=0;
		boolean provjera = true;
		// try/ catch blok ukoliko bude pogresan unos
		// do while petlja za unos dok ne bude tacan
		do{
		try{
		 n = in.nextInt();
		 provjera = false;
		}
		// hvatanje Input mismatch exception
		catch (InputMismatchException e) {
		    System.out.println("Input MIsmatch Exception, unesite ponovo;");
		    in.nextLine();
		}
		}while(provjera);
		
		
		// kreiranje dvodimenzionalnog niza
		double [][] niz = new double [n][n];
	
		System.out.println("Unesite matricu: ["+n + "x" +n + "]");
		// upisivanje u 2D matricu
		boolean provjera1 = true;
		
		// provjera ukoliko bude exception
		do{
			
			try{
				for (int red =0; red<niz.length; red++){
					for (int kolona =0; kolona<niz[red].length; kolona++){
						niz[red][kolona] = in.nextDouble(); // ubacivanje vrijednosti u niz
					}
				}
				provjera1=false;
			}
			catch(InputMismatchException e){
				 System.out.println("Input MIsmatch Exception, unesite ponovo;"); 
				 in.nextLine();
			}
		}while(provjera1);
			
	
		System.out.println("Matrica koju ste unijeli je:");
		// printanje unesene matrice
		for (int red =0; red<niz.length; red++){
			for (int kolona =0; kolona<niz[red].length; kolona++){
				System.out.printf("%8.2f",niz[red][kolona]);
				
			}
			System.out.println();
		}
		
		System.out.println("Najveci broj je na lokaciji");
		// pozivanje metode tako sto cemo nizu lokacija dodijelit  "locateLargest niz iz metode"
		int[] lokacija =locateLargest(niz);
		
		System.out.print("[ ");
		for (int i=0; i<lokacija.length; i++){
			System.out.print(+lokacija[i] + " ");
		}
		System.out.print("]");
		//zatvaranje scannera
		in.close();

	}
	public static int[] locateLargest(double[][] a) {
	
		int red=0;
		int kolona=0;
		double niz= a[0][0];

		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[i].length; j++){
				// pronalazak najveceg broja u matrici
				if (a[i][j] > niz){
					red = i; 	// red se zamjenjuje sa najvecim u nizu
					kolona = j;	// kolona se zamjenjuje sa najvecom u nizu
					niz = a[i][j]; // niz se zamjenjuje sa najvecim elementom
				}
			}
		}

		//kreiranje 1D niza sa lokacijom najveceg elementa u nizu
		int[] locateLargest= {red,kolona}; 
		return locateLargest;
	
}

}
