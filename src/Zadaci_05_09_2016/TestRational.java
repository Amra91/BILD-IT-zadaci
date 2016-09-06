package Zadaci_05_09_2016;

public class TestRational {

	public static void main(String[] args) {
		
		//kreiranje racionalnih brojeva
		
		Rational rational1 = new Rational(0, 2);	
		Rational rational2 =new Rational(2, 7);
        
		//operacije sa racionalnim brojevima
		
        System.out.println(rational1.toString() + " + " + rational2.toString() + " = " + rational1.add(rational2) );
        System.out.println(rational1.toString() + " - " + rational2.toString() + " = " + rational1.subtract(rational2) );
        System.out.println(rational1.toString() + " * " + rational2.toString() + " = " + rational1.multiply(rational2) );
        System.out.println(rational1.toString() + " / " + rational2.toString() + " = " + rational1.divide(rational2) );
        
       
	}
	
}
