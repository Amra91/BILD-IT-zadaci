package Zadaci_26_08_2016;

public class PersonTest {

	public static void main(String[] args) {
		
		//objekat person
		Person obj1 = new Person();
		obj1.setName("Amra");
		
		//objekat student
		Student obj2 = new Student();
		obj2.setName("Dino");
		System.out.println(obj2.toString());
		
		//objekat employe
		Employe obj3 = new Employe();
		obj3.setName("Zehra");
		System.out.println(obj3.toString());
		
		//objekat faculty
		Faculty obj4 = new Faculty();
		obj4.setName("Hajra");
		System.out.println(obj4.toString());
		
		//objekat staff
		Staff obj5 = new Staff();
		obj5.setName("Amila");
		System.out.println(obj5.toString());
		
	}
}
