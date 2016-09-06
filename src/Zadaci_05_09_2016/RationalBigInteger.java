package Zadaci_05_09_2016;

import java.math.BigInteger;

public class RationalBigInteger extends Number implements Comparable {
	 
	// Data fields
	  BigInteger numerator = BigInteger.ZERO;
	  BigInteger denominator = BigInteger.ONE;

	  //no args konstruktor
	  public RationalBigInteger() {
	   
		  
	  }


	
	  public RationalBigInteger(BigInteger numerator, BigInteger denominator) {
	 
		  BigInteger gcd = gcd(numerator, denominator);
	   
		  this.numerator = BigInteger.valueOf(denominator.signum()).multiply(numerator).divide(gcd);
	    
		  this.denominator = denominator.abs().divide(gcd); 
	  }
	  
	
	 
	  public RationalBigInteger( String str){
		  
		  //brojac decimala iza zareza
		  int counter=0;
			
		  //kreiranje brojnika
		  String numer="";
			
			for (int i =0; i<str.length(); i++){
				
				if (str.charAt(i)== '.'){
					//brojac krece sa brojanjem decimala kada dodje do zareza
					counter =0;
				}
				else{
					//brojnik dobiva svaku vrijednost osim tacke
				numer+=str.charAt(i);
				//brojanje decimala iza zareza
				counter++;
				}
			}
			
			//kreiranje nazivnika
			String denomi ="1";
				
				//for petlja za dodavanje nula nazivniku do velicine broja decimala iza zareza
				for (int i=0; i<counter; i++){

					denomi +=("0");
				}
				
				BigInteger a =new BigInteger (numer);	// pretvaranje stringa u nazivnik
				
				//uslov ukoliko je broj bez zareza
				if (counter==str.length()){
					denomi ="1";
					
				}
				BigInteger b = new BigInteger(denomi);
				
				
				BigInteger gcd = gcd(a, b);
				   
				  this.numerator = BigInteger.valueOf(b.signum()).multiply(a).divide(gcd);
			    
				  this.denominator = b.abs().divide(gcd); 
				
				
	  }
	 
	  

	  //Najveci zajednicki sadrzilac
	  private static BigInteger gcd(BigInteger n, BigInteger d) {
	   
		  BigInteger n1 = n.abs();
	    
		  BigInteger n2 = d.abs();
	    
		  BigInteger gcd = n1.gcd(n2);

	    return gcd;
	  }

	  //vraca brojnik
	  public BigInteger getNumerator() {
	   
		  return numerator;
	  }

	  //vraca nazivnik
	  public BigInteger getDenominator() {
	   
		  return denominator;
	  }

	  //sabiranje dva racionalna broja
	  public RationalBigInteger add(RationalBigInteger secondRational) {
	  
		  BigInteger n = (numerator.multiply(secondRational.getDenominator())).add(denominator.multiply(secondRational.getNumerator()));
	    
		  BigInteger d = denominator.multiply(secondRational.getDenominator());
	    
		  return new RationalBigInteger(n, d); 
	  }

	  //oduzimanje dva racionalna broja
	  public RationalBigInteger subtract(RationalBigInteger secondRational) {
	  
		  BigInteger n = (numerator.multiply(secondRational.getDenominator())).subtract(denominator.multiply(secondRational.getNumerator()));
	    
		  BigInteger d = denominator.multiply(secondRational.getDenominator());
	    
		  return new RationalBigInteger(n, d);
	  }

	  //mnozenje dva racionalna broja
	  public RationalBigInteger multiply(RationalBigInteger secondRational) {
	   
		  BigInteger n = numerator.multiply(secondRational.getNumerator());
	    
		  BigInteger d = denominator.multiply(secondRational.getDenominator());
	    
		  return new RationalBigInteger(n, d);
	  }

		 //mnozenje dva racionalna broja
	  public RationalBigInteger divide(RationalBigInteger secondRational) {
	   
		  BigInteger n = numerator.multiply(secondRational.getDenominator());
	    
		  BigInteger d = denominator.multiply(secondRational.numerator);
	    
		  return new RationalBigInteger(n, d);
	  }

	  
	  @Override
	  public String toString() {
	   
		  if (denominator.intValue() == 1)
	     
			  return numerator + "";
	    
		  else
	      
			  return numerator + "/" + denominator;
	  }

	  @Override

	  public boolean equals(Object parm1) {
	   
		  if ((this.subtract((RationalBigInteger)(parm1)).getNumerator()).intValue() == 0) 
	      
			  return true;
	    
		  else
	      
			  return false;
	  }

	  @Override
	  // Override the abstract intValue method in java.lang.Number 
	  public int intValue() {
	  
		  return (int)doubleValue();
	  }

	  @Override
	  // Override the abstract floatValue method in java.lang.Number 
	  public float floatValue() {
	   
		  return (float)doubleValue();
	  }

	  @Override
	  // Override the doubleValue method in java.lang.Number
	  public double doubleValue() {
	   
		  return numerator.divide(denominator).doubleValue();
	  }

	  @Override
	  // Override the abstract BigIntegerValue method in java.lang.Number 
	  public long longValue() {
	  
		  return (long)doubleValue();
	  }

	  @Override
	  // Override the compareTo method in java.lang.Comparable 
	  public int compareTo(Object o) {
	    
		  if (((this.subtract((RationalBigInteger)o)).getNumerator()).intValue() > 0)
	      
			  return 1;
	    
		  else if (((this.subtract((RationalBigInteger)o)).getNumerator()).intValue() < 0)
	      
			  return -1;
	    
		  else
	      
			  return 0;
	  }

}

