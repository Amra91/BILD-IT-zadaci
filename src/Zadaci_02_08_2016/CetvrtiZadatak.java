package Zadaci_02_08_2016;

import java.util.Scanner;

/*	Napisati metodu koja ispisuje n x n matricu koristeæi sljedeæi header:
			public static void printMatrix(int n)
	Svaki element u matrici je ili 0 ili 1, generisan nasumièno. 
	Napisati test program koji pita korisnika da unese n te ispisuje n x n matricu.

*/
public class CetvrtiZadatak {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite koliku matricu zelite: \n[nXn]");
		// unos koliku matricu zelimo(koje dimenzije)
		int n = unos.nextInt();
		// pozivanje matrice sa argumentom n
		printMatrix (n);
		//zatvaranje scannera
		unos.close();
	}
	public static void printMatrix(int n){
		// kreiranje dvodimenzionalnog niza n elemenata
		int[][] niz = new int [n][n];
		
		//nasumicno kreiranje matrice elemntima 0 ili 1
		for (int red =0; red<niz.length; red++){
			for (int kolona=0; kolona<niz[red].length; kolona++){
				niz[red][kolona]= (int)(Math.random()*2);
			}
		}
		//printanje dvodimenzionalne matrice
		for (int red =0; red<niz.length; red++){
			for (int kolona=0; kolona<niz[red].length; kolona++){
				System.out.print(niz[kolona][red]+ " ");
			}
			System.out.println();
		}
	}
}
