package Zadaci_02_09_2016;

public class SquareTest {

	public static void main(String[] args) {
		
		//kreiranje niza 
		GeometricObject[] geoOblici  = new GeometricObject[5];
	
		//ubacivanje u niz 5 elemenata geometrijskih oblika
		geoOblici[0] = new Rectangle();
        geoOblici[1] = new Square();
        geoOblici[2] = new Circle2(3);
	    geoOblici[3] = new Square(0,0,25);
        geoOblici[4]= new Rectangle(3,2);

	  //printanje rezultata
        for (int i = 0; i < geoOblici.length; i++) {

	         System.out.println("Oblik " + i + ", povrsina = " + geoOblici[i].getArea());
	            if (geoOblici[i] instanceof Colorable) {
	                System.out.println(((Colorable)geoOblici[i]).howToColor());
	            }
	            else{
	            	System.out.println(" Nije moguce obojiti");
	            }
	          System.out.println();
	        }

	    }
	
}
