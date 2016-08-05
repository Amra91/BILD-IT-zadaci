package Zadaci_04_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *  Napisati program koji pita korisnika da unese neki cijeli broj 
 *  te ispisuje njegove najmanje faktore u rastuæem redosljedu. 
 *  Na primjer, ukoliko korisnik unese 120 program treba da ispiše 
 *  2, 2, 2, 3, 5. (2 * 2 * 2 * 3 * 5 = 120)
 */
public class PrviZadatak {
	

	static Scanner in = new Scanner(System.in);
	 
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		//varijabla numb poziva metod enterNumber()..metoda je return tip pa dobijamo vrijednost numb varijable
		int numb = enterNumber();		
		
		//provjera da li je unijeti broj negativan ili pozitivan
		//po pravilu postoje faktori negativnog broja samo je pravilo da se prvi broj pise (-)
		if(numb<0){
			
			//metoda koja obavlja logiku za negativan uneseni broj
			mainMethodNegative(list, numb);
			
		}else{
			//metoda koja obavlja logiku za pozitivan uneseni broj
			mainMethodPositive(list, numb);
		}
		
		
	}	
		//metoda pomocu koje unosimo broj i vrsimo provjeru broja sa try-catch blokom
		public static int enterNumber(){
		
			
			int numb = 0;					//varijabla preko koje unosimo broj
			boolean provjera = false;		//varijabla koja nam je potrebna za provjeru
			
			
			//do-while petlja je tu koja nas tjera da unosimo broj sve dok on ne bude cijeli broj
			do{
				//try blok je tu da ispitamo RunTime Exception prilikom unosa broja
				
				try{
						System.out.println("Unesi broj");
						//unosimo broj i ujedno i provjeravamo u try bloku
						numb = in.nextInt();
						
						provjera = true;
				}catch(InputMismatchException ex){
						System.out.println("Pogresan unos.\nUnesite ponovo.");
						in.nextLine();
				}
				
			}while(provjera != true);	
			//in.close();
			return numb;		//vracanje unesenog broja
			
			
		}	//kraj metode enterNumber()
		
		public static void mainMethodNegative(ArrayList<Integer> list, int numb){
			int i = 2;	//varijabla od koje krecemo 
			int novi = numb; //spremanje pocetnog broja potrebnog za provjeru 
			while(true){
				//provjera da li je broj djeljiv sa i ako je djeljiv sa i
				// vrijednost broja se smanjuje za broj/i
				//ako nije else blok se izvrsava koji inkrementira varijablu i 
				if(numb % i == 0){
					numb = numb/i;
					
					//dodavanje faktora u listu 
					list.add(i);
					
						//provjera da li smo pronasli trazene faktore 
						//ako je proizvod svih elemenata u listi jednak pocetnom(unesenom) broju 
						//pronasli smo trazene faktore
						if(checkNegative(list,novi) == novi){
							break; //break prekida izvrsenje while petlje i program nastavlja dalje
						}
				//else blok iz pocetnog if uslova koji inkrementira varijablu i ako broj nije djeljiv sa i		
				}else{
					i++;
				}
			}//kraj while petlje
			
			//ovdje printamo trazene faktore..
			
			System.out.print("Najmanji faktori su: ");
			//pisemo prvi clan u negativnoj vrijednosti koji se stavlja u malu zagradu po pravilu matematike
			System.out.print("("+(list.get(0)*-1)+")"+" ");	
			//for petlja printa ostale clanove iz liste ..s tim da krece od 1 a ne od 0 jer smo vec 
			//"iskoristili" prvi clan odn. clan na poziciji 0 ili nulti clan u listi... ;)
			for(int j=1; j<list.size(); j++){
				System.out.print(list.get(j)+" ");
			}
			System.out.println();
			//printamo provjeru ..
			//opet prvi clan pisemo negativan..
			System.out.print("Jer je: "+"\n"+"("+(list.get(0)*-1)+")"); 
			for(int j=1; j<list.size(); j++){
				System.out.print(" * "+list.get(j));
			}
			//metoda checkNegative daje rezultat mnozenja svih elemenata u listi ..
			//ujedno i provjera 
			System.out.print(" = "+ checkNegative(list, novi)); 
		}
		
		//analogno kao i prosla metoda ....
		//pronalazenje faktora poztivnog broja
		public static void mainMethodPositive(ArrayList<Integer> list, int numb){
			int i = 2;
			int novi = numb;
			while(true){
				if(numb % i == 0){
					numb = numb/i;
					
					list.add(i);
					
					if(checkPositive(list,novi) == novi){
						break;
					}
				}else{
					i++;
				}
			}
			System.out.print("Najmanji faktori su: ");
			System.out.print((list.get(0))+" ");
			for(int j=1; j<list.size(); j++){
				System.out.print(list.get(j)+" ");
			}
			System.out.println();
			System.out.println();
			System.out.print("Jer je: "+"\n"+(list.get(0)));
			for(int j=1; j<list.size(); j++){
				System.out.print(" * "+list.get(j));
			}
			System.out.print(" = "+ checkPositive(list, novi));
		}
	
	
		//metoda provjerava da li smo pronasli trazene faktore.. vraca rezultat mnozenja faktora
		
		public static int checkPositive(ArrayList<Integer> list,int novi){
			 //dodjeljivanje clana na poziciji nula u listi varijabli broj
			// zbog mnozenja elemenata u listi..u for petlji lista krece od clana na poziciji jedan 
			int broj = list.get(0);
			
			//for petlja krece od 1 tj cita se element na poziciji jedan iz liste
			for(int i=1; i<list.size(); i++){
					//mnozimo svaki element sa narednim elementom u listi
					//varijabla broj predstavlja element iz liste sa pozicije 0 u prvoj iteraciji for petlje
					//list.get(i) je u prvoj iteraciji 1 tj element sa pozicije jedan
					broj = broj * list.get(i);
				}
			
			return broj; // vracamo pomnozene faktore ..
		}
		
		//metoda se ponasa analogno metodi checkPositive..
		
		public static int checkNegative(ArrayList<Integer> list,int novi){
			int broj = list.get(0);
			
			
			for(int i=1; i<list.size(); i++){
				
				broj = broj * list.get(i);
				
				
			}
			
			broj =broj * (-1); //postavljanje proizvoda u minus 
			
			return broj;
		}
	}
