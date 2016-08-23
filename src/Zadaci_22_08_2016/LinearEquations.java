package Zadaci_22_08_2016;

public class LinearEquations {

	private double a,b,c,d,e,f;
	public LinearEquations(double a,double b,double c,double d,double e,double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
		
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
	public double getD(){
		return d;
	}
	public double getE(){
		return e;
	}
	public double getF(){
		return f;
	}
	public boolean isSolvable(){
		if((a*d - b*c)==0){
			return false;
		}else{
			return true;
		}
	}
	public double getX(){
		double x = ((e*d)-(b*f))/((a*d)-(b*c));
		return x;
	}
	public double getY(){
		double y = ((a*f)-(e*c))/((a*d)-(b*c));
		return y;
	}
	public void printResult(){
		if(isSolvable()==false){
			System.out.println("The equations has no solutions.");
		}
		else{
			System.out.println("Rijesenje x je: "+getX()+"\nRijesenje y je: "+getY());
		}
	}
	public static void main(String[] args) {
		LinearEquations obj = new LinearEquations(1, 13, 4, 12, 5, 3);
		obj.printResult();

	}

}

