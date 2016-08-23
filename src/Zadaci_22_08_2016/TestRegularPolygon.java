package Zadaci_22_08_2016;

public class TestRegularPolygon {


	public static void main(String[] args) {
		//Kreiranje objekta sa no-arg konstruktorom
		RegularPolygon regular_polygon = new RegularPolygon();
		//Printanje rezultata 
		System.out.println("The area is: "+regular_polygon.getArea()+"\nThe perimeter is: "+regular_polygon.getPerimeter());
		
		
		//Kreiranje objekta sa unijetim brojem strana i unijetim duzinama stranica
		RegularPolygon regular_polygon1 = new RegularPolygon(6,4);
		//Printanje rezultata 
		System.out.println("The area is: "+regular_polygon1.getArea()+"\nThe perimeter is: "+regular_polygon1.getPerimeter());
		
		
		//Kreiranje objekta i incijaliziranje objekta
		RegularPolygon regular_polygon2 = new RegularPolygon(10, 4, 5.6, 7.8);
		//Printanje rezultata
		System.out.println("The area is: "+regular_polygon2.getArea()+"\nThe perimeter is: "+regular_polygon2.getPerimeter());
	}

}

