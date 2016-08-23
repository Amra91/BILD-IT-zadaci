package Zadaci_22_08_2016;

public class RegularPolygon {

	private int n;
	private double side;
	private double x;
	private double y;
	
	//Konstruktor koji kreira poligon sa default vrijednostima
	public RegularPolygon() {
		n = 3;
		side = 1;
		x = 0;
		y = 0;
	}
	//Konstruktor koji kreira poligon sa unijetim brojem strana poligona i sa unijetim duzinama stranica
	public RegularPolygon(int n, double side){
		this.n = n;
		this.side = side;
		x = 0;
		y = 0;
	}
	//Konstruktor koji kreira poligon sa unijetim svim specifikacijama
	public RegularPolygon(int n, double side, double x, double y){
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	//geter za stranicu
	public double getSide() {
		return side;
	}
	//seter za stranicu
	public void setSide(double side) {
		this.side = side;
	}
	//geter za x
	public double getX() {
		return x;
	}
	//seter za x
	public void setX(double x) {
		this.x = x;
	}
	//geter za y
	public double getY() {
		return y;
	}
	//seter za y
	public void setY(double y) {
		this.y = y;
	}
	//geter za N
	public int getN(){
		return n;
	}
	//seter za N
	public void setN(int n){
		this.n = n;
	}
	
	//Metod koji racuna obim
	public double getPerimeter(){
	    return n * side;
	}
	
	//Metod koji racuna povrsinu
	public double getArea(){
	   
	    return ((n*Math.pow(side, 2)))/(4*Math.tan(Math.PI/n));
	}    
	
}

