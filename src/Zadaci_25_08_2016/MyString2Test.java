package Zadaci_25_08_2016;

public class MyString2Test {
	
	public static void main(String[] args) {
		
		MyString2 obj1 = new MyString2("Mobitel");
		
		//compare metoda, koja vraca vrijednosti negativne, poz i 0
		if (obj1.compare("Mobitel")==0){
			System.out.println("Identican je string.");
		}
		
		if (obj1.compare("Amra")<0){
			System.out.println("String je manji od uporedjivanog striga objekta.");
		}
		else{
			System.out.println("String je veci od uporedjivanog stringa objekta.");
		}
		
		System.out.println(obj1.substring(2)); //printanju substringa koji pocinje sa indeksom 2
		
		System.out.println(obj1.toUpperCase());	//printanje u velikim slovima objekat
	
	}
}
