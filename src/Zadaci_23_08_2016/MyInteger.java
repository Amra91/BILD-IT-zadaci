package Zadaci_23_08_2016;
/*
 *  (The MyInteger class) Design a class named MyInteger. The class contains:
 *   Anint data field named value that stores the int value represented by this object. 
 *   A constructor that creates a MyInteger object for the specified int value.
 *   A getter method that returns the int value.
 *   The methods isEven(), isOdd(), and isPrime() that return true if the value in this object is even, odd, or prime, respectively. 
 *   The static methods isEven(int), isOdd(int), and isPrime(int) that return true if the specified value is even, odd, or prime, respectively. 
 *   The static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that return true if the specified value is even, odd, or prime, respectively. 
 *   The methods equals(int) and equals(MyInteger) that return true if the value in this object is equal to the specified value. 
 *   A static method parseInt(char[]) that converts an array of numeric characters to an int value. 
 *   A static method parseInt(String) that converts a string into an int value. 
 */

public class MyInteger {
	
	//data field
	private int value;
	
	//konstruktor
	MyInteger(int value){
		this.value= value;
	}
	//geter za value
	public int getValue(){
		return value;
	}
	
	
	//metoda da li je broj paran
	public boolean isEven(){
		//uslov ako je djeljiv sa 2
		if (value%2==0){
			return true;
		}
		else{
			return false;
		}
	}
	//metoda da li je neparan broj
	public boolean isOdd(){
		//uslov ako nije djeljiv sa 2
		if (value%2!=0){
			return true;
		}
		else{
			return false;
		}
	}
	//metoda da li je broj prost
	public boolean isPrime (){
					
		if (value<2){
			return false;
		}			
		//for petlja za provjeru brojeva
		for(int i=2; i<value; i++){
			//uslov za provjeru da li je broj djeljiv sa nekim brojem
			 if(value%i == 0){
			          return false;
			       }            
			    }
		// vracanje ako je prost broj
		return true;
	}
	
	//da li je odr vrijednost paran broj
	public static boolean isEven(int num){
		if (num%2==0){
			return true;
		}
		else{
			return false;
		}
	}
	//da li je odr vrij neparan broj
	public static boolean isOdd (int num){
		if(num%2!=0){
			return true;
		}
		else{
			return false;
		}
	}
	//da li je odr vr prost broj
	public static boolean isPrime (int num){
		
		if (num<2){
			return false;
		}			
		//for petlja za provjeru brojeva
		for(int i=2; i<num; i++){
			//uslov za provjeru da li je broj djeljiv sa nekim brojem
			 if(num%i == 0){
			          return false;
			       }            
			    }
		// vracanje ako je prost broj
		return true;
	}
	//metode (isEven,isOdd, isPrime) za provjeru objekta
	public static boolean isEven(MyInteger n) {
	        return n.isEven();
	}
	
	public static boolean isOdd(MyInteger n) {
	        return n.isOdd();
	 }
	public static boolean isPrime(MyInteger n) {
	        return n.isPrime();
	}
	
	//metoda za provjeru jednakosti
	public boolean equals(int n) {
        return (value == n);
    }
	//metoda za provjeru jednakosti 
    public boolean equals(MyInteger n) {
        return equals(n.getValue());
    }
    //metoda za konvertovanje stringa u broj
    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }
    // metoda za konvertovanje karaktera u broj
    public static int parseInt(char[] s) {
        return parseInt(new String(s));
    }
}
