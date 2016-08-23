package Zadaci_22_08_2016;

public class QuadraticEquations {

	private double a;
	private double b;
	private double c;
	
	 QuadraticEquations(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double getA(){
		return a;
	}
	public double getB(){
		return b;
	}
	public double getC(){
		return c;
	}
	//Metoda vraca diskriminantu
	public double getDiscriminant(){
		return (Math.pow(b, 2))-(4*a*c);
	}
	public double getRoot1(){
		
		double r1 = 0;
			//Uslov iz teksta zadatka,
			//ako je diskriminanta negativna, postavljamo rijesenje jedan na nulu i takvog ga vracamo
			if(getDiscriminant() < 0){
					r1 = 0;
			}else{
					//Izracunavamo rijesenje jedan 
					r1 = ((-1*b)+Math.sqrt(getDiscriminant()))/(2*a);
			}
				
		return r1;
	}
	
	//Metoda vraca rijesenje dva
	public double getRoot2(){
		double r2 = 0;
		//Uslov iz teksta zadatka,
		//kada je diskriminanta negativna, postavljamo rijesenje na nulu i takvog ga vracamo
		if(getDiscriminant() < 0){
			r2 = 0;
		}else{
			//Izracunavamo rijesenje dva 
			r2 =  (-b - (Math.sqrt( getDiscriminant())))/(2*a);
		}
		return r2;
	}
	
	//Metoda printa rezultat jednacine
	@Override
	public String toString(){
		if(getDiscriminant()>0){
			return "Root one: "+getRoot1()+" Root two: "+getRoot2();
		}
		else if(getDiscriminant()<0){
			return ("The equation has no roots.");
		}
		else {
			return ("The equation has one root: "+getRoot1());
		}
		
	}
	
	
		public static void main(String[] args) {
		
			//kreiranje objekta
		QuadraticEquations kvadratna_jedn = new QuadraticEquations(4, -5, 1);
		
		//Printanje rezultata preko metode toString
		System.out.println(kvadratna_jedn.toString());
		//Provjera kada je diskriminanta manja od 0
		System.out.println(new QuadraticEquations(1, 1, 5).toString());
		//Provjera kada je diskriminanta jednaka 0
		System.out.println(new QuadraticEquations(4, 4, 1).toString());
			
	}

}

