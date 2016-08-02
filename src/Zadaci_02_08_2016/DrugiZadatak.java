package Zadaci_02_08_2016;

import java.util.Scanner;

/*
 * Napisati metodu koja prima jedan argument, 
 * broj pitanja, te generiše toliko nasumiènih, 
 * jednostavnih pitanja oduzimanja tipa : 
 * „Koliko je 5 - 2 ?“. 
 * Metoda treba da broji broj taènih i netaènih odgovora te ih ispiše korisniku.

 */
public class DrugiZadatak {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite broj pitanja: ");
		// unos broja nasumicnih pitanja
		int broj = unos.nextInt();
		// pozivanje matrice sa argumentom broj nasumicnih pitanja
		oduzimanje(broj);
		unos.close();
				
	}
	public static void oduzimanje (int brojPitanja){
		Scanner in = new Scanner (System.in);
		int a = 0;			//umanjenik
		int b = 0;			//umanjilac
		int c =0;			// zamjena ako je umanjilac veci od umanjenika
		int odg = 0;		//razlika
		int brojac1= 0;		//brojac tacnih odgovora
		int brojac2= 0;		//brojac netacnih odgovora
		
		//petlja za nasumicna pitanja za random brojeve od 0 do 20
		for (int i = 0; i<brojPitanja; i++){
			a = (int)(Math.random()*20);
			b = (int)(Math.random()*20);
		
			//if uslov ako je b vece od a, izvrsava se zamjena pozicija
			if (b>a){
				c=b;
				b=a;
				a=c;
				}
			
			System.out.println("Koliko je " +a + " - " + b);
			odg = in.nextInt();
			
			// if uslov ako je tacan odgovor ili netacan odgovor,brojaci se povecavaju
			if (odg== a-b){
				brojac1++;
			}
			else{
				brojac2++;
			}
		}
	
	System.out.println("Broj tacnih odgovora je "+ brojac1 + ", a broj netacnih odgovora je "+ brojac2);
	in.close();
	}
}
