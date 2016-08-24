package Zadaci_23_08_2016;

public class MyIntegerTest {

	public static void main(String[] args) {
		
		System.out.println("34 is even: "+ MyInteger.isEven(34));
		System.out.println("34 is odd: "+ MyInteger.isOdd(34));
		System.out.println("15 is prime: " + MyInteger.isPrime(15));
	    char[] chars = {'1', '2', '3', '4'};
	    System.out.println(MyInteger.parseInt(chars));
	    String s = "5678";
	    System.out.println(MyInteger.parseInt(s));
		
		//kreiranje objekta value, sa vrijednosti 7
		MyInteger obj1 = new MyInteger(7);
	  
		System.out.println(obj1.getValue()+" is even: " + obj1.isEven());
		System.out.println(obj1.getValue()+ " is odd: "+ obj1.isOdd());
		System.out.println(obj1.getValue()+ " is prime: " + obj1.isPrime());
	    
	        
	    
	    }
	}

