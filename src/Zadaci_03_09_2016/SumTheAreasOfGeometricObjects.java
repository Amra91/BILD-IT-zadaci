package Zadaci_03_09_2016;
/*
 * (Sum the areas of geometric objects)
 * Write a method that sums the areas of all the geometric objects in an array. 
 * The method signature is:
 * public static double sumArea(GeometricObject[] a)
 * Write a test program that creates an array of four objects (two circles and two rectangles) 
 * and computes their total area using the sumArea method.
 */
public class SumTheAreasOfGeometricObjects {
	
	public static void main(String[] args) {
		
		//kreiranje niza 
		GeometricObject[] obj  = new GeometricObject[4];
		
		//ubacivanje u niz 4 elemenata geometrijskih oblika
        obj[0] = new Circle (3);
        obj[1] = new Circle (4);
        obj[2] = new Rectangle(3,2);
        obj[3] = new Rectangle();
        
        System.out.println("Total area is "+ sumArea(obj));
		
	}

	public static double sumArea(GeometricObject[] a){
		// varijabla koja vraca povrsine
		double sumArea =0;
		//prolazak kroz cijeli niz
		for (int i=0; i<a.length; i++){
			sumArea+=a[i].getArea();
		}
		
		return sumArea;
	}
}