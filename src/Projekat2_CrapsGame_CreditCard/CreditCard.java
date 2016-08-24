package Projekat2_CrapsGame_CreditCard;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CreditCard {

	static Scanner in = new Scanner (System.in);
	
    public static void main(String[] args) {

      
    	System.out.println("Enter a credit card number as a long integer:");
    	//unos kartice
        long creCard = checkIn(); 

  
        
        	//if uslov ako kartica nije validna kreditna kartica
        if (!isValid(creCard)){

        	System.out.println("The credit card number is invalid");
        }
        else{
        	//ako kartica je validna poziva se metoda
        creditCardsIs(creCard);
        }

    }
    
    //provjera da li je suma brojeva validna
     private static boolean isValid(long creCard){
    	 
    //	 if uslov ako kartica ima manje od 13 ili vise od 16 brojeva da nije validna
    if (getSize(creCard)<13 || getSize(creCard)>16){
    		return false;
    	}
    	 
    	 int[] array = digits(creCard);	//niz brojeva kreditne kartice
    	 
    	 //if uslov ako je suma djeljiva sa 10 da je ispravna kartica
    	 if ((sumEvenPlaces(array)+ sumOddPlaces(array))%10==0){
    		 return true;
    	 }
    	 else{
    		 
    	 return false;
    	 }
     }
     
     private static void creditCardsIs(long creCard){
    	 /* provjera koja je kreditna kartica, na osnovu prefiksa
    	  * ako dati prefiks ne odgovara, kartica nije ispravna
    	  */
    	 int[] array= digits(creCard);
    	 int prefix = getPrefix(array);
    	 System.out.println(prefix);
    	 
    	 if (prefix /10 ==4){
    		 System.out.println("Visa Cards:");
    		 System.out.println("The credit card number is valid");
    	 }
    	 else if (prefix/10==5){
    		 System.out.println("Master cards:");
    		 System.out.println("The credit card number is valid");
    	 }
    	 else if (prefix/10==6){
    		 System.out.println("Discover Cards:");
    		 System.out.println("The credit card number is valid");
    	 }
    	 else if (prefix==37){
    		 System.out.println("American Expres Cards:");
    		 System.out.println("The credit card number is valid");
    	 }
    	 else {
    		 System.out.println("The credit card number is invalid");
    		 
    	 }
     }
     
     // brojac brojeva kreditne kartice; 
     public static int getSize(long d) {

	        int count = 0;

	        while (d > 0) {
	            d = d / 10;

	            count++;
	        }

	        return count;

	    }

    private static int[] digits (long creCard) {

        int[] digits = new int[16];

         
        //kreiranje niza od 16 elemenata, koji sadrzava sve brojeve kreditne kartice
        for (int index=15; index>=0; index--) {

            int digit = (int) (creCard % 10);

            digits[index] = digit;

            creCard /= 10;

        }

        return digits;

    }
    

  
    private static int sumEvenPlaces(int[] digits) {

        int sum = 0;
        int num=0;	

        for (int i=0; i<digits.length; i+=2) {
        	//svaki drugi broj se mnozi sa dva, a krece od prve pozicije
        	num=digits[i]*2;
        	
        	//ako broj koji se pomnozi sa dva veci od 10; jedinice i desteke sabjeremo
            if (num >= 10) {
                sum +=( (num/10)+ (num%10)); 
            }
            else{
                sum += num;
            }
            System.out.println(num);
        }
       
        return sum;
        
    }

    private static int sumOddPlaces(int[] digits) {

        int sum = 0;	
        
        // krece od druge pozicije u nizu
        for (int i=1; i<digits.length; i+=2){
        	
        	// svaki drugi broj se dodjeljuje sumi
            sum += digits[i];
        }

        return sum;

    }
    //dobivanje prva dva broja prefiksa kredtne kartice
    private static int getPrefix (int[]digits){
    	
    	String s = digits[0]+""+digits[1]+"";
    	int getPrefix = Integer.parseInt(s);
    	
    	
    	return getPrefix;
    	
    }
    
	//metoda za provjeru da li je unos ispravan 
	public static long checkIn(){

		long num =0;
		boolean check = true;
		
		/// do while petlja izvrsava provjeru unosa broja sve dok isti ne bude tacan
		do{
			//try blok koji provjerava num
			try{
				num = in.nextLong();
				
				check= false;
			}
			// hvatanje izuzetka
			catch (InputMismatchException e) {
			    System.out.println("Input MIsmatch Exception, unesite ponovo broj kreditne kartice;"); 
			    in.nextLine();
			
			}
		}while(check);
		
		
		return num;
	}


}


