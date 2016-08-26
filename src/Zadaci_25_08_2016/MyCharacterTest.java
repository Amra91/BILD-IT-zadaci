package Zadaci_25_08_2016;

public class MyCharacterTest {

	public static void main(String[] args) {
		
		MyCharacter a = new MyCharacter('a');
		//provjera da li je malo slovo
		System.out.println(a.isLowerCase());
		//provjera da li je veliko slovo
		System.out.println(a.isUpperCase());
		//provera da li je slovo
		System.out.println(a.isLetter());
		//provjera da li je broj
		System.out.println(a.isDigit());
		
		
		
	}
}
