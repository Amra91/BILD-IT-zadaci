package Zadaci_02_09_2016;

//apstraktna klasa koja implementa Comparable interface
public abstract class GeometricObject implements Comparable<GeometricObject> {
	
	//data fileds
	private String color = "white";
	private boolean filled;
	private java.util.Date date;
	
	//konstruktori su protected, apstraktne klase ne mogu kreirati objekte
	protected GeometricObject() {
		date = new java.util.Date();
	}
	
	protected GeometricObject(String color, boolean filled){
		this.color=color;
		this.filled=filled;
		date= new java.util.Date();
	}
	//geter
	public String getColor() {
		return color;
	}
	//seter
	public void setColor(String color){
		this.color=color;
	}
	//geter
	public boolean getFilled(){
		return filled;
	}
	//seter
	public void setFilled (boolean filled){
		this.filled = filled;
	}
	//date
	public java.util.Date date(){
		return date;
	}
	
	  //apstraktna metoda
	 public abstract double getArea(); 
	 
	 //apstraktna metoda
	 public abstract double getPerimeter();  
	 
	// metoda od comparable interface, metoda compare to poredi dva objekta
		
	 public int compareTo(GeometricObject obj) {
		 //ukoliko je povrsina datog objekta veca od povrsine drugog objekta vraca se 1 tj. da je rez pozitivan
			if (this.getArea() > obj.getArea()){
				return 1;
			}
			//ukoliko je data povrsina manja, vraca se -1, to jest da je negativno
			else if (this.getArea() < obj.getArea()){
				return -1;
			}
			//ukoliko su iste vraca se 0
			else {
				return 0;
			}
		}

		// staticka metoda koja vraca max, tj vraca onaj objekt koji je veci
		public static GeometricObject max(GeometricObject obj1, GeometricObject obj2) {
			//ukoliko je 1, tj pozitivno veci je obj1
			if (obj1.compareTo(obj2) == 1)
				return obj1;
			else
				return obj2;
		}

	
		 

}

