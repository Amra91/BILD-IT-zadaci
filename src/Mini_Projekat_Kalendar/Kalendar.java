package Mini_Projekat_Kalendar;


import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;

/*
 * OPIS PROGRAMA
 * Program izracunava tacan kalendar za bilo koju unijetu godinu te printa taj kalendar u konzoli.
 * Prilikom kreiranja svakog novog podsjetnika program kreira novi fajl, koji je ogranicen na 50 linija teksta, 
 * takodjer svaki novi fajl se kreira pod drugim imenom.
 * 
 * Ako korisnik unese ime fajla koji zeli da kreira i to ime postoji u bazi, tada trazi se od korisnika da se unese drugo ime.
 * Kod printanja isto tako se izlistavaju svi podsjetnici koji postoje u bazi, te korisnik mora da izabere koji zeli da printa,
 * i ako nepravilno unese ime podsjetnika, program trazi od korisnka da unese ponovo ispravno ime.
 * 
 * Program brine o svakom unosu korisnika, u slucaju nepravilnog unosa, program to detektuje i trazi od korisnika pravilini unos.  
 */


public class Kalendar {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
	
		
		//kreiranje objekta klase Remainder
		Remainder remainder = new Remainder();
		
		//deklarisanje arrayListe za spremanje objekata iz klase Remainder
		ArrayList<Remainder> list = new ArrayList<>();
		
		
		//glavna do petlja 
		do{
			System.out.println("Ako zelite printati kalendar pritisnite 1."+
					"\nAko zelite printati podsjetnik pritisnite 2."
					+"\nAko zelite dodati podsjetnik pritisnite 3.");
			
			//switch za opcije glavnog menija
			switch(in.nextInt()){
			
			//case 1: printa kalendar i postavlja remainder
			//svaki podsjetnik pravi svoj fajl pod drugim imenom te ga kao takvog cita
			case 1:{

				
				System.out.println("Unesi godinu:");
				
				//Metoda checkInput() provjerava jel godina unijeta kao cijeli broj
				int godina = checkInput();
				
				//postavljanje godine u objekat reaminder
				remainder.setGodina(godina);
				
				
				System.out.println("Unesite broj mjeseca[1...12]: ");
				//metoda checkInputNumberOfMonth() provjerava jel unijeti mjesec validan
				//ako se unese preko 12 ili ispod 1 ..ili ako se ne unese int tip
			
				int mjesec = checkInputNumberOfMonth();
				remainder.setMjesec(mjesec);
				
				
				//metoda print printKalendarHeader(mjesec, godina) printa kalendar
				printKalendarHeader(mjesec, godina);
				//ovdje pitamo korisnika da li zeli da postavi podsjetnik
				System.out.println();
				System.out.println("*****************************************");
				System.out.println("Ako zelite postaviti podsjetnik za odredjeni dan u ovom mjesecu pritisnite 1."+
						"\nAko zelite ponovo printati kalendar i vratiti se u pocetni meni pritisnite 0.");
				int izbor = checkInput();
				//ovdjeee gledaj ovo je kad hoces ostavit podsjetnik 
				
					if(izbor == 1){
							System.out.println("Za koji dan zelite podsjetnik.");
							
							//preko metode checkInputMonth(godina, mjesec) provjeravamo
							//da li je unijeti dan validan
							//ako unesemo manje od 1 ili unesemo vise nego sto mjesec ima dana biti ce
							//nepravilan unos i zahtjevamo da unesemo validan dan...
							int dan = checkInputMonth(godina, mjesec);
							
							//postavljamo unijeti dan u objekat jer nam treba kasnije kod printanja datuma
							//kada smo spremili podsjetnik itd
							remainder.setDan(dan);
							System.out.println("Unesite naslov podsjetnika [jedan space]");
							String ime_podsjetnika = in.next();
							
							//do petlja trazi da unesemo naslov podsjetnika,,
							//pod tim naslovom spremamo novi fajl..
							//takodjer ovdje u if uslovu provjeravamo..
							//ako fajl postoji trazi nam da unesemo drugo ime za fajl 
							do{
								//provjeravamo ime podsjetnika da li postoji u bazi
								//preko metode checkNameOfRemainder(list, ime_podsjetnika)
								if(remainder.checkNameOfRemainder(list, ime_podsjetnika) == true){
								}else{
									break;
								}
								ime_podsjetnika = in.next();
							}while(true);
							//postavljamo ime podsjetnika u objekat
							remainder.setIme_podsjetnika(ime_podsjetnika);
							System.out.println("Unesite sta zelite u podsjetnik [Enter + 0 prekida unos]: ");
							System.out.println("********************************");
							//ovdje pozivamo objektnu metodu doTheLogicOfRemainder 
							//koja unosi text u fajl
							remainder.doTheLogicOfRemainder(godina, dan, ime_podsjetnika,list);
							System.out.println("********************************");
							
							
							//ovdje printamo notifikaciju kada smo spremili novi podsjetnik
							//tacan dan neke godine i nekog mjeseca dobijamo preko 
							//metode getNameOfDay(mjesec, godina, dan)
							
							System.out.println("Snimljeno za: "+"\nGodina: "+remainder.getGodina()+"\nMjesec: "
												+getNameOfMonth(remainder.getMjesec()));
							
							System.out.println("**************************************************");
							int year = remainder.getGodina();
							File file = remainder.getFile();
							
							//postavljamo znacajke u arrayListu
							list.add(new Remainder(ime_podsjetnika,dan,file,year,remainder.getDan() ));
							
					}
						//else blok je kada zelimo da se vratimo u glavni meni
						else{
							//break prekida switch i odlazimo u glavni meni
							break;
						}
					
					//ovaj break prekida switch nako pravilno unijetog podsjetnika 
					//i odlazimo u glavni meni [break od case 1:]
					break;
			}//kraj prvog case 1:
					
					
					
			case 2: {
				
					
					if(list.isEmpty()== true){
						System.out.println("Nema niti jednog podsjetnika.");
						break;
					}
						
						//Printamo sve podsjetnike koji se nalaze u bazi
						//Da bi korisnik mogao odabrati koji podsjetnik zeli da isprinta
						System.out.println("Podsjetnici za printanje:");
						System.out.println();
						int count = 0;
						for(int i=0; i<list.size(); i++){
							System.out.print("["+list.get(i).getGodina()+"{"+list.get(i).file+"}"+"],");
							count++;
							if(count == 10){
								System.out.println();
							}
						}
						System.out.println("*********************************");
						//Nudimo korisniku da upise ime podsjetnika koji biva isprintan u konzoli
						
						System.out.println("Za prikaz podsjetnika molimo unesite njegovo ime"
								+ " samo ime bez [.txt].");
						
						
						String str = in.next();
						while(true){
							if(remainder.checkIfNameExist(list, str) == true){
								break;
							}else{
								System.out.println("Podsjetnici za printanje:");
								System.out.println();
								count = 0;
								for(int i=0; i<list.size(); i++){
									System.out.print("["+list.get(i).getGodina()+"{"+list.get(i).file+"}"+"],");
									count++;
									if(count == 10){
										System.out.println();
									}
								}
								System.out.println("*********************************");
								str = in.next();
							}
							
						}
						//Objektna metoda printa trazeni od korisnika podsjetnik
						//Prosljedjujemo ArrayListu jer u metodi pronalazimo trazeni podsjetnik
						System.out.println("*\t\t Sadrzaj podsjetnika: \t**");
						remainder.printRemainder(list,str);
						System.out.println("*********************************************");
						break;
						
						}//kraj case 3:
			
			case 3:{
				System.out.println("Za kreiranje novog podsjetnika pritisnite 1."+
									"\nZa izlaz na glavni meni pritisnite bilo koji drugi broj.");
				int izbor = checkInput();
				if(izbor == 1){
					System.out.println("Za koju godinu zelite podsjetnik");
					int godina = checkInput();
					remainder.setGodina(godina);
					System.out.println("Za koji mjesec zelite podsjetnik");
					int mjesec = checkInputNumberOfMonth();
					remainder.setMjesec(mjesec);
					System.out.println("Za koji dan zelite podsjetnik.");
					
					//preko metode checkInputMonth(godina, mjesec) provjeravamo
					//da li je unijeti dan validan
					//ako unesemo manje od 1 ili unesemo vise nego sto mjesec ima dana biti ce
					//nepravilan unos i zahtjevamo da unesemo validan dan...
					int dan = checkInputMonth(godina, mjesec);
					
					
					//postavljamo unijeti dan u objekat jer nam treba kasnije kod printanja datuma
					//kada smo spremili podsjetnik itd
					remainder.setDan(dan);
					System.out.println("Unesite naslov podsjetnika[jedan space]");
					String ime_podsjetnika = in.next();
					
					//do petlja trazi da unesemo naslov podsjetnika,,
					//pod tim naslovom spremamo novi fajl..
					//takodjer ovdje u if uslovu provjeravamo..
					//ako fajl postoji trazi nam da unesemo drugo ime za fajl 
					do{
						//provjeravamo ime podsjetnika da li postoji u bazi
						//preko metode checkNameOfRemainder(list, ime_podsjetnika)
						if(remainder.checkNameOfRemainder(list, ime_podsjetnika) == true){
						}else{
							break;
						}
						ime_podsjetnika = in.next();
					}while(true);
					//postavljamo ime podsjetnika u objekat
					remainder.setIme_podsjetnika(ime_podsjetnika);
					System.out.println("Unesite sta zelite u podsjetnik [Enter + 0 prekida unos]: ");
					System.out.println("********************************");
					//ovdje pozivamo objektnu metodu doTheLogicOfRemainder 
					//koja unosi text u fajl
					remainder.doTheLogicOfRemainder(remainder.getGodina(), dan, ime_podsjetnika,list);
					System.out.println("********************************");
					
					
					//ovdje printamo notifikaciju kada smo spremili novi podsjetnik
					//tacan dan neke godine i nekog mjeseca dobijamo preko 
					//metode getNameOfDay(mjesec, godina, dan)
					
					System.out.println("Snimljeno za: "+"\nGodina: "+remainder.getGodina()+"\nMjesec: "
										+getNameOfMonth(remainder.getMjesec()));
					
					System.out.println("**************************************************");
					int year = remainder.getGodina();
					File file = remainder.getFile();
					
					//postavljamo znacajke u arrayListu
					list.add(new Remainder(ime_podsjetnika,dan,file,year,remainder.getDan() ));
					
				} //kraj if uslova za unos podsjetnika
				

				
				break; 		
			}//kraj case 3
			
					default : {
						System.out.println("Nema te opcije.");
						break;
					}
			}
			
			
		}while(true); //uslov glavne do petlje
		
	}
	
	//Metoda  printa kalendar
	//Metoda radi tako sto pronadjemo pocetni dan za unijeti mjesec i unijetu godinu
	
	public static void printKalendarHeader(int mjesec, int godina){
		System.out.println("\t"+getNameOfMonth(mjesec)+", "+godina);
		System.out.println("__________________________________");
		System.out.printf("%3s%5s%5s%5s%5s%5s%5s","Pon","Uto","Sri","Cet","Pet","Sub","Ned");
		System.out.println();
		
		//metoda prviDan(mjesec, godina) pronalazi pocetni dan u zadatoj godini i mjesecu
		int starting_day = prviDan(mjesec, godina);
		
		//metoda brojDanaUmjesecu(godina, mjesec) pronalazi 
		//tacan broj dana u trazenom mjesecu i trazenoj godini
		
		int broj_dana_u_mjesecu = brojDanaUmjesecu(godina, mjesec);
		
		//if uslov postavlja tacan pocetni dan jer metoda prviDan(mjesec, godina)
		//pronalazi pocetni dan zadatog mjeseca i godine od 0 do 6
		//a nama treba od 1 do 7..
		
		if(starting_day == 0){
			starting_day = 7;
		}
		for(int i=0; i<starting_day-1; i++){
			System.out.printf("%-5s"," ");
		}
		for(int i=0; i<broj_dana_u_mjesecu; i++){
			System.out.printf("%-5s",(i+1));
			if((i+starting_day)%7 == 0){
				System.out.println();
			}
		}
		
		
	}
	public static int prviDan (int mjesec, int godina){
		// matematicka formula gregorijanskog kalendara za racunanje dana
		// stavljena pretpostavka da trazimo samo prvi, datog mjeseca i date godine 
		// pravilo uzeto od njemackog matematicara Christian Zeller za racunanje dana
		// Mjeseci su da se broje druacije tako da je:  Mart je prvi mjesec, april je drugi, i tako dalje do februara, koji je dvanaesti mjesec.
		
		int a = (14-mjesec)/12;
		int g = godina - (int)a;
		int m = mjesec + 12*(int)a -2;
		
		// prvi dan se dobiva tako sto su vrijednosti: za nedelju 0, za ponedeljak 1, za utorak 2, za srijedu 3,
		// za cetvrtak 4, za petak 5, za subotu 6.
		int dan = (1 + g + (g/4) - (g/100)+(g/400)+ ((31 *m)/12) )%7;
		return dan;
	}
	
	//metoda pronalazi tacan broj dana za zadatu godinu i zadani mjesec
	public static int brojDanaUmjesecu(int god, int mjesec){
		int dani=0;
		switch (mjesec){
			case 1:
				dani= 31;
				break;
			case 2: 
				if (isLeap(god)){
					dani= 29;
					break;
				}
				else{
					dani= 28;
					break;
				}
			case 3:
				dani= 31;
				break;
			case 4:
				dani= 30;
				break;
			case 5:
				dani= 31;
				break;
			case 6:
				dani= 30;
				break;
			case 7:
				dani=31;
				break;
			case 8:
				dani= 31;
				break;
			case 9:
				dani= 30;
				break;
			case 10:
				dani= 31;
				break;
			case 11:
				dani=30;
				break;
			case 12:
				dani=31;
				break;
				}
			
		return dani;
	}
	
	//metoda pronalazi i vraca ime mjeseca za zadani mjesec
	public static String getNameOfMonth(int month){
			 
		    String monthName = null;
		    switch (month) {
		      case 1: monthName = "Januar"; break;
		      case 2: monthName = "Februar"; break;
		      case 3: monthName = "Mart"; break;
		      case 4: monthName = "April"; break;
		      case 5: monthName = "Maj"; break;
		      case 6: monthName = "Juni"; break;
		      case 7: monthName = "Juli"; break;
		      case 8: monthName = "August"; break;
		      case 9: monthName = "Septembar"; break;
		      case 10: monthName = "Octobar"; break;
		      case 11: monthName = "Novembar"; break;
		      case 12: monthName = "Decembar"; 
		    }

		    return monthName;
		  }
	
	
	//metoda provjerava da li je godina prestupna
	public static boolean isLeap(int year){
		 return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
	
	
	//metoda vraca cijeli broj i ujedno provjerava da li je unijeti broj cijeli broj
	public static int checkInput(){
	
		int input = 0;
		boolean status = false;
		do{
			try{
				input = in.nextInt();
				status = true;
			}catch(InputMismatchException ex){
				System.out.println("Nepravilan unos.\nUnesite ponovo.");
				in.nextLine();
			}
			
		}while(status != true);
		return input;
		
		
	}
	
	
	//Metoda unosi i provjerava unos za mjesec..
	//Unos treba da je cijeli broj i unos treba da se krece od 1 do [broja dana u mjesecu za kojeg je korisnik trazio]..
	public static int checkInputMonth(int god, int mjesec){
		
		//unosimo varijablu dan preko metode checkInput() koja provjera da li
		//je unos cijeli broj
		int dan = checkInput();
		
		//while petlju koristimo da provjerimo unos..ako je unos nepravilan zahtjeva se od korisnika da
		//unese pravilan broj dana, 
		//ispisuje se naziv mjeseca i njegov broj dana..
		//tako da je korisnik obavjesten o kojem mjesecu se radi..
		while(true){
		if(dan <1 || dan>brojDanaUmjesecu(god, mjesec)){
			System.out.println("Nepravilan unos.\n"+getNameOfMonth(mjesec)+" ima"+brojDanaUmjesecu(god, mjesec)+
					"\nUnesi dan u tom rasponu.");
			dan = checkInput();
		}
		else{
			break;
		}
		
		}
		return dan;
	}
	
	//Metoda provjerava unos broja mjeseca
	//Unos treba da se krece od 1 do 12
	public static int checkInputNumberOfMonth(){
		
		//unosimo broj preko metode checkInput() koja provjerava je li unos cijeli broj
		int broj = checkInput();
		
		//while petlju koristimo u slucaju pogresnog unosa da trazimo od korisnika
		//ponovni unos, sve dok unos nije ispravan.
		//provjeru vrsimo preko if uslova u while petlji
		while(true){
			if(broj > 12 || broj<1){
				System.out.println("Nepravilan unos.\nMaksimalan broj mjeseci je 12, minimalan 1"+
							"\nUnesite ponovo.");
				broj = checkInput();
			}else{
				break;
			}
		}
		return broj;
	}
	}
