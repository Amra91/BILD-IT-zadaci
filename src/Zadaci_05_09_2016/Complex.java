package Zadaci_05_09_2016;

public class Complex {

	private double a;	//realni broj
	private double b;	//imaginarni broj
	
	//no args konstruktori 
	public Complex(){
		this.a=0;
		this.b=0;
	}
	
	public Complex(double a){
		
		this.a=a;
		this.b=0;
		
	}
	
	public Complex(double a, double b){
		this.a=a;
		this.b=b;
	}
	
	//metoda vraca realni broj
	public double getRealPart(){
			
			return this.a;
	}
		//metoda vraca imaginarni broj
	public double getImaginaryPart(){
			
			return this.b;
	}
	
	
	
	//sabiranje kompleksih brojeva
	//a + bi + c + di = (a + b) + (b + d)i
	
	public Complex  add(Complex complex){
		
		Complex addition = new Complex ((this.a + complex.a), (this.b + complex.b));
				
		return  addition;
	}
	
	//oduzimanje kompleksnih brojeva
	//a-bi + (c -d)i = (a-c) + (b-d)i
	
	public Complex subtract (Complex complex){
		
		Complex substraction = new Complex((this.a-complex.a), (this.b -complex.b));
		
		return substraction;
		
	}
	
	//mnozenje kompleksih brojeva
	//(a + bi)*(c + di) = (ac - bd) + (bc + ad)i
	
	public Complex multiply (Complex complex){
		
		double num1 = (this.a * complex.a - this.b *complex.b);
		double num2 = (this.b * complex.a + this.a * complex.b);
		
		return new Complex (num1, num2);
	}
	
	//djeljenje kompleksinih brojeva 
	//(a + bi)/(c + di) = (ac + bd)/(c2 + d2) + (bc - ad)i/(c2 + d2)
	
	public Complex divide(Complex complex){
		
		double num1 = (this.a * complex.a + this.b * complex.b)/ (Math.pow(complex.a , 2)+ Math.pow(complex.b,2));
		double num2 = (this.b * complex.a - this.a * complex.b)/(Math.pow(complex.a , 2)+ Math.pow(complex.b,2));
		
		return new Complex (num1,num2);
		
	}
	
	//apsolutna vrijednost 

	public double abs(){
		
		double abs = Math.sqrt(this.a) + Math.sqrt(this.b);
		
		return abs;
	}

	@Override
	public String toString() {
		
		if (b==0){
			return a +"";
		}
		else {
		
		return  a + " + " + b + "i";
		}
	}
	
	
	
	
	
}

