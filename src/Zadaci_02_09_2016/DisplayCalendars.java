package Zadaci_02_09_2016;

import java.util.Calendar;

/*
 *  (Display calendars) 
 *  Rewrite the PrintCalendar class in Listing 6.12 to display a calendar 
 *  for a specified month using the Calendar and GregorianCalendar classes.
 *  Your program receives the month and year from the command line. 
 *  You also can run the program without the year. 
 *  In this case, the year is the current year.
 *  If you run the program without specifying a month and a year, the month is the current month.

 */
public class DisplayCalendars {

	public static void main(String[] args) {	
		
		// neispravan unos
		if (args.length > 2) {
	            System.out.println("Nepravilan unos.");
	            System.exit(1);
	        }

	       int year;
	       int month;
	       
	       // ukoliko je jedan unos
	       if (args.length == 1) {
	        	int num = Integer.parseInt(args[0]);
	        	//provjera da li je godina
	        	if(num < 1970){
	        		month = num;
	        		year = Calendar.getInstance().get(Calendar.YEAR);
	        	}
	        	else{
	        		year = num;
	        		month = Calendar.getInstance().get(Calendar.MONTH);
	        	}
	        	
	        }
	       //ukoliko su dva unosa
	       else if(args.length == 2){
	        	int num1 = Integer.parseInt(args[0]);
	        	int num2 = Integer.parseInt(args[1]);
	        	if(num1 < num2){
	        		month = num1;
	        		year = num2;
	        		
	        	}
	        	else{
	        		month = num2;
	        		year = num1;
	        		
	        	}
	        	
	        }
	        else 
	        {
	        	 month = Calendar.getInstance().get(Calendar.MONTH);
	             year = Calendar.getInstance().get(Calendar.YEAR);
	        }
	        
	       //provjera unosa mjeseca
	       if (getNameOfMonth(month+1)==null){
	    	   System.out.println("Nepravilan unos mjeseca, \nUnesi mjesec od 0 do 11");
	    	   System.exit(0);
	       } 
	       else{
	    	   printKalendar(month+1, year);
	       }
			
		}
		
		//printanje kalendara
		public static void printKalendar(int mjesec, int godina){
			
			System.out.println("\t"+getNameOfMonth(mjesec)+", "+godina);
			System.out.println("__________________________________");
			System.out.printf("%3s%5s%5s%5s%5s%5s%5s","Pon","Uto","Sri","Cet","Pet","Sub","Ned\n");
			
			System.out.println("__________________________________");
		
			//prvi dan od kojeg krece mjesec
			int starting_day = prviDan(mjesec,godina);
			//broj dana u mjesecu
			int broj_dana_u_mjesecu = BrojDanaUmjesecu(godina, mjesec);
			
			if(starting_day > 0){
				starting_day = starting_day -1;
			}
			if(starting_day == 0){
				starting_day = 6;
			}
			for(int i=0; i<starting_day; i++){
				System.out.printf("%-5s"," ");
			}
			
			for(int i=1; i<=broj_dana_u_mjesecu; i++){
				System.out.printf("%-5s",i);
				
				if((i+(starting_day))%7 == 0){
					System.out.println();
					
				}
			}
			System.out.println();
		}
		
		// Metoda koja vraca ime mjeseca
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

		public static int prviDan (int mjesec, int godina){
			// matematicka formula gregorijanskog kalendara za racunanje dana
			// stavljena pretpostavka da trazimo samo prvi, datog mjeseca i date godine 
			// Zeller's Rule za racunanje za racunanje dana 
			// Mjeseci su da se broje posebno za Zeller's Rule je pravilo: 
			// Mart je prvi mjesec, april je drugi, i tako dalje do februrala, koji je dvanaesti mjesec.
			
			int a = (14-mjesec)/12;
			int g = godina - (int)a;
			int m = mjesec + 12*(int)a -2;
			
			// prvi dan se dobiva tako sto su vrijednostu: za nedelju 0, za ponedeljak 1, za utorak 2, za srijedu 3,
			// za cetvrtak 4, za petak 5, za subotu 6.
			int dan = (1 + g + (g/4) - (g/100)+(g/400)+ ((31 *m)/12) )%7;
			return dan;
		}
		
		//Metoda za vracanje broja dana u mjesecu
		public static int BrojDanaUmjesecu(int god, int mjesec){
			int dani=0;
			switch (mjesec){
				case 1:
					dani= 31;
					break;
				case 2: 
					if (prestupna(god)){
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
		public static boolean prestupna(int godina){
			return godina % 400 == 0 || (godina % 4 == 0 && godina % 100 != 0);
			}
	}

