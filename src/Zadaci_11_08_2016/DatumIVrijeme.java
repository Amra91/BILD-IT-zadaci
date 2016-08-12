package Zadaci_11_08_2016;

/*
 * Ako pozovemo metodu System.currentTimeMillis() 
 * dobijemo broj milisekundi od 1. januara 1970 do trenutka pozivanja metode. 
 * Napisati program koji ispisuje trenutaèni datum i vrijeme u formatu 
 * "Trenutni datum i vrijeme: 22. juli, 2015 19:59:47"
 */
public class DatumIVrijeme {
	
	public static void main(String[] args) {
	
		// pozovanje metoda
		
		System.out.print("Trenutni datum i vrijeme: ");
		convertMillisToDate(System.currentTimeMillis());
		convertMillisToTime(System.currentTimeMillis());
		
	
	
	}
	public static void convertMillisToTime (long millis){
	
	
		long sek = (millis/1000) %60;			//pretvaranje u sekunde
		long min = (millis/1000/60)% 60;		//pretvaranje u minute
		long sat = (millis/1000/60/60)%24;		//pretvaranje u sate
	
		// printanje u nasoj vremenskoj zoni
		System.out.print(" "+(sat+2)+":"+ min + ":"+ sek);
	
	}
	public static void convertMillisToDate(long millis){
		// ukuno dana od 1970
		long ukupnoDana = (millis/1000/60/60/24);
		
		//pocetna godina
		int god= 1970;
		
		//uslov sve dok godina ne bude manja od 365 ili 366 zavisno da li je prestupna
		while (ukupnoDana>numberOfDayInAYear(god)){
			// od svake godine oduzimati broj dana te godine
			ukupnoDana-=numberOfDayInAYear(god);
			// tako dobivamo sadasnju godinu
			god++;
		}
		//prvi mjesec
		int mjesec =1;
		//provjera koliko je ostalo dana od ukupno mjeseci za odredjeni mjesec
		while (ukupnoDana>dana(mjesec,god)){
			// dani se smanjuju za broj dana u odredjenom mjesecu
			ukupnoDana-=dana(mjesec,god);
			//povecanje mjeseca do sadasnjeg
			mjesec++;
			
		}
		// ono dana sto je ostalo predstavlja danasnji dan umanjen za 1; tako ga dodajemo ukupnom br dana
		System.out.print(ukupnoDana+1  + ". "+ mjesec(mjesec) + ", " + god);
		
	}
	// racunanje broja dana u godini, zavisno da li je god prestupna
		public static int numberOfDayInAYear(int year){
			
			int dan = 0;
			// if uslov za prestupnu godinu 
			if ((year%4==0 && year%100!=0 )|| (year%400==0)){
				dan =366;
			}
			else {
				dan =365;
			}
			return dan;
		}
		// racnanje broja dana u mjesecu
		public static int dana (int mjesec, int god){
			int dan=0;
			// if za mjesece koji imaju 31 dan
			if (mjesec==1 || mjesec ==3 || mjesec ==5 ||mjesec ==7 ||mjesec ==8 || mjesec ==10 || mjesec ==12){
				dan= 31;
			}
			//else if za mjesece koji imaju 30 dana
			else if (mjesec ==4 || mjesec ==6 || mjesec ==9 || mjesec ==11 ){
				dan= 30;
			}
			// i posljednji za racunanje februra zaisvno od prestupne godine
			else if (mjesec ==2){
				if( numberOfDayInAYear(god)==366){
					dan =29;
				}
				else {
					dan =28;
				}
			}
			return dan;
		}
		
		public static String mjesec(int mjesec){
			// printanje mjeseca 
			String opis="";
			//switch za provjeru je mjesec i output je koliko dati mjesec ima dana 
			// 1,2,3,4..12 predstavljaju mjesece 
			switch (mjesec){
				case 1:
					opis= "Januar";
					break;
				case 2: 
					opis= "Februar";
					break;
					
				case 3:
					opis= "Mart";
					break;
				case 4:
					opis= "April";
					break;
				case 5:
					opis="Maj" ;
					break;
				case 6:
					opis="Juni";
					break;
				case 7:
					opis="Juli";
					break;
				case 8:
					opis="August";
					break;
				case 9:
					opis="Septembar" ;
					break;
				case 10:
					opis="Oktobar";
					break;
				case 11:
					opis="Novembar";
					break;
				case 12:
					opis="Decembar";
					break;
					
				default:
					opis="Pogresan unos mjeseca.";
					break;
						
					}
				
			return opis;
		}
}

	
