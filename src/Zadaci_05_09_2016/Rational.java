package Zadaci_05_09_2016;

public class Rational extends Number implements Comparable<Rational> {
	

	// Data fields 

	private int numerator = 0;
	private int denominator = 1;
	private long[] r = new long[2]; 	// pod indeksom 0 je brojnik, pod indexom 1 je nazivnik
	
	//no arg konstrukt
	 public Rational() {
		this(0, 1);
	}
		 
	
	 public Rational(long numerator, long denominator) {
		
		 //uslov ukoliko je nazivnik 0
		 if (denominator==0){
			 r[this.numerator]=0;
			 r[this.denominator]=0;
		 }
		 else{
			 long gcd = gcd(numerator, denominator);
			 r[this.numerator] = ((denominator > 0) ? 1 : -1) * numerator / gcd;
			
			 r[this.denominator] = Math.abs(denominator) / gcd;
		 
		 }
		 
		}
		
	
	 //najveci zajednicki sadrzilac
	private static long gcd(long n, long d) {
		
		long n1 = Math.abs(n);
		
		long n2 = Math.abs(d);
		int gcd = 1;
		
		  for (int k = 1; k <= n1 && k <= n2; k++) {
			  	if (n1 % k == 0 && n2 % k == 0)
			  		gcd = k;
		  	}
		 
		 return gcd;
	}
	
	
	//brojnik
	public long getNumerator() {
		return r[numerator];
	 }
	 
	 //nazivnik
	 public long getDenominator() {
		 return r[denominator];
	 }
	 
	  //sabiranje dva racionalna broja
	 public Rational add(Rational secondRational) {
		 
		 long n = r[numerator] * secondRational.getDenominator() + r[denominator] * secondRational.getNumerator();
	 
		 long d = r[denominator] * secondRational.getDenominator();
	 
		 return new Rational(n, d);
	  }
	
	 //oduzimanje dva racionalna broja
	 public Rational subtract(Rational secondRational) {
		 
		 long n = r[numerator] * secondRational.getDenominator()
				 - r[denominator] * secondRational.getNumerator();
	 
		 long d = r[denominator] * secondRational.getDenominator();
		 
		 return new Rational(n, d);
	 }
	 
	 //mnozenje dva racionalna broja
	 public Rational multiply(Rational secondRational) {
		 
		 long n = r[numerator] * secondRational.getNumerator();
		
		 long d = r[denominator] * secondRational.getDenominator();
		 
		 return new Rational(n, d);
	 }
	 
	//djeljenje dva racionalna broja
	public Rational divide(Rational secondRational) {
	 
			
			long n = r[numerator] * secondRational.getDenominator();
			long d = r[denominator] * secondRational.r[numerator];
	
				return new Rational(n, d);
			
			
	 }
	 
	@Override
	 
	public String toString() {
	 
		if (r[denominator] == 1)
	
			return r[numerator] + "";
	 
		
		else if (r[denominator]==0){
			return "0 ";
		}
		else
	 
			return r[numerator] + "/" + r[denominator];
	}
	 
	
	 
	@Override
	
	public boolean equals(Object other) {
	 
		if ((this.subtract((Rational)(other))).getNumerator() == 0)
	 
			return true;
	 
		else
	 
			return false;
	}

	
	@Override 
	 // Override the method in java.lang.Number
	public int intValue() {
	
		return (int)doubleValue();
	 
	}
	 
	@Override 
	 // Override the method in java.lang.Number
	public float floatValue() {
	 
		return (float)doubleValue();
	 }
	
	@Override 
	 // Override the method in java.lang.Number
	public double doubleValue() {
		
		return r[numerator] * 1.0 / r[denominator];
	}
	
	@Override 
	 // Override the method in java.lang.Number
	public long longValue() {

		return (long)doubleValue();
	}
	
	@Override 
	
	// Override the compareTo method in java.lang.Comparable 
	public int compareTo(Rational o) {
		if (this.subtract(o).getNumerator() > 0)
			return 1;
		else if (this.subtract(o).getNumerator() < 0)
			return -1;
		else
			return 0;
	}
}

	