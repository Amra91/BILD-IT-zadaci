package Zadaci_26_08_2016;

public class TriangleTEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangle trokut = new Triangle(4,5,3);
		System.out.println(trokut.toString());
		trokut.setColor("red");
		System.out.println("Boja je " + trokut.getColor());
		System.out.println("Povrsina je "+ trokut.getArea());
		System.out.println("Obim je "+ trokut.getPerimeter());
		
	}

}
