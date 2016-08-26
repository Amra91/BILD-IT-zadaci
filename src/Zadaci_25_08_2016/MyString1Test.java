package Zadaci_25_08_2016;

public class MyString1Test {

	public static void main(String[] args) {
		
		MyString1 obj= new MyString1("Knjiga");
		//printanje objekta
		System.out.println(obj.toString());
		//pronalazak slova sa odredjenim indeksom [2]
		System.out.println(obj.charAt(2));
		//duzina objekta
		System.out.println(obj.length());
		//substring sa indeksima od 3 i 5
		System.out.println(obj.substring(3, 5));
		//vracanje sa malim slovima
		System.out.println(obj.toLowerCase());
		//poredjenje stringova
		System.out.println(obj.equals("Amra"));
		
	}
}
