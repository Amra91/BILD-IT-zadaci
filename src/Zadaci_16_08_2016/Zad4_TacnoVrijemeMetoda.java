package Zadaci_16_08_2016;

/*
 *  Napisati metodu koja vraæa datum i trenutaèno vrijeme.

 */
public class Zad4_TacnoVrijemeMetoda {

	public static void main(String[] args) {
		
		//poziv metode za tacno vrijeme i datum
		dateAndTime(System.currentTimeMillis());
	}
	
	public static void dateAndTime (long millis){
	
		long sek = (millis/1000) %60;			//pretvaranje u sekunde
		long min = (millis/1000/60)% 60;		//pretvaranje u minute
		long sat = (millis/1000/60/60)%24;		//pretvaranje u sate
			
		// printanje u nasoj vremenskoj zoni
				System.out.println((sat+2)+":"+ min + ":"+ sek);
		
		//pozivanje metode za datum
				date(millis);

	}
	
	public static void date(long millis){
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
		
			//krece od prvog mjeseca
			int mjesec =1;
		
			//provjera da li broj dana je veci od broja dana u mjesecu
			while (ukupnoDana>dana(mjesec,god)){
				
				// dani se smanjuju za broj dana u odredjenom mjesecu
				ukupnoDana-=dana(mjesec,god);
				//povecanje mjeseca do sadasnjeg
				mjesec++;
				
			}
			// ono dana sto je ostalo predstavlja danasnji dan umanjen za 1; tako ga dodajemo ukupnom broju dana
			System.out.println(ukupnoDana+1  + "."+ mjesec + "." + god);
			
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
		
	}

		

