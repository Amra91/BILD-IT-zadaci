package Zadaci_02_08_2016;
/*
 * Napisati metodu koja prima jedan argument te simulira bacanje novèiæa toliko puta. 
 * Nakon što se simulacija završi, 
 * program ispisuje koliko puta je novèiæ pokazao glavu a koliko puta pismo.
 */


public class PetiZadatak {
	
	public static void main(String[] args) {
		
		java.util.Scanner in = new java.util.Scanner(System.in); 
		System.out.println("Unesite koliko zelite puta izvrsiti simalaciju novcica");
		//koliko puta ce se izvrsiti simulacija
		int a = in.nextInt(); 
		//pozivanje metode za ispisivanje koliko puta je novcic pokazao glavu, a koliko pismo
		simulacijaBacanjaNovcica(a); 
		//zatvaranje scannera
		in.close();
	}
	public static void simulacijaBacanjaNovcica(int n){
		
		// kreiranje niz n elemnata
		int [] array = new int [n];
		//izvrsenje simulacije
		int broj=0;
		//brojac pismo
		int pismo=0;
		//brojac glava
		int glava=0;
		
		//petlja za izvrsenje simulacie
		for (int i =0; i<array.length; i++){
			broj = (int)(Math.random()*2);
			// uslov za pismo ili glavu
			if (broj==0){
				pismo++;
			}
			else{
				glava++;
			}
			
		}
		
		System.out.println("Simulacija je se izvrsila "+ n + " puta."+
		"\nGlava je bila "+glava + " puta.\nPismo je bilo "+ pismo + " puta.");
		
	}
	
}
