package Zadaci_02_09_2016;

	public class ComparableCircleTest {

		public static void main(String[] args) {

			ComparableCircle circle1 = new ComparableCircle();		//prvi objekat
		
			ComparableCircle circle2 = new ComparableCircle(5);		//drugi objekat
			
			//provjera koji je krug veci
			if (circle1.compareTo(circle2) > 0)
				System.out.println(circle1.toString()+ " is bigger");
			
			else if (circle1.compareTo(circle2) < 0)
				System.out.println(circle2.toString()+ " is bigger");
		
			else
				System.out.println("Circles are equal");

		}

	}

