package Zadaci_09_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Great circle distance predstavlja udaljenost izme�u dvije ta�ke na povr�ine sfere. 
 * Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku �irinu i du�inu dvije ta�ke. 
 * Great circle distance izme�u ove dvije ta�ke mo�e biti izra�unata koriste�i se sljede�om formulom: 
 * d = radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)).
Napisati program koij pita korisnika da unese geografsku �irinu i du�inu 
u stepenima dvije ta�ke na povr�ini zemlje te mu ispisuje great circle distance.
Prosje�ni radius zemlje je 6.371.01 km. 
Stepene koje korisnik unese trebamo promijeniti u radianse koriste�i se 
Math.toRadians metodom jer Java trigonometrijske metode koriste radianse. 
�irina i du�ina u ovoj formuli se odnose na zapad i sjever. 
Koristimo negativne vrijednosti da ozna�imo istok i jug. 
 */
public class GreatCircleDistance {

	static Scanner in = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // unos prve tacke(x1, y1)
		 System.out.print("Enter point 1 (x1, y1) in degrees:");
		 double x1 = Math.toRadians(checkIn());
		 double y1 = Math.toRadians(checkIn());
		 
		 //unos druge tacke (x2, y2)
		 System.out.print("Enter point 2 (x2, y2) in degrees:");
		 double x2 = Math.toRadians(checkIn());
		 double y2 = Math.toRadians(checkIn());
		  
		 // Great Circle Distance se izracunava formulom 
		 // GCD = radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)).
		double GreatCircleDistance = 6371.01 * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y2 - y1));
		  
		 System.out.print("The distance between the two points is " + GreatCircleDistance + " km.");
		}
	//metoda za provjeru da li je unos ispravan cjeli broj
			public static double checkIn(){
				
				double num =0;
				boolean check = true;
				
				/// do while petlja da se izvrsava unos broja sve dok isti ne bude double
				do{
					//try blok koji provjerava unos
					try{
						num = in.nextDouble();
						check= false;
					}
					// hvatanje izuzetka
					catch (InputMismatchException e) {
					    System.out.println("Input MIsmatch Exception, unesite ponovo cijeli broj;"); 
					    in.nextLine();
					}
				}while(check);
				
				return num;
			}
	
		
	}


