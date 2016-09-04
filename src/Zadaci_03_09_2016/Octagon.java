package Zadaci_03_09_2016;

public class Octagon extends GeometricObject implements Comparable<Octagon>,Cloneable{
	//data fields
	private double side;
	
	//no args konstruktor
	Octagon(){
		
	}
	//konstruktor
	Octagon(double side){
		this.side=side;
	}
	//geter 
	public double getSide() {
		return side;
	}
	//seter
	public void setSide(double side) {
		this.side = side;
	}
	//povrsina
	public double getArea(){
		
		return (2 + 4/22)* this.side * this.side ;
	}
	//povrsina
	public double getPerimeter(){
		return 8* this.side;
	}
	@Override
	public String toString() {
		return "Octagon [side=" + side + "]";
	}	
	
	//poredjenje na osnovu povrsine objekata osmougla
	public int compareTo(Octagon obj) {
		if (this.getArea() > obj.getArea())
			return 1;
		else if (this.getArea() < obj.getArea())
			return -1;
		else
			return 0;
	}
	//metoda koja pravi kopiju objekta
	@Override 
    public Octagon clone() {
        return new Octagon(this.side);
    } 
	
}
