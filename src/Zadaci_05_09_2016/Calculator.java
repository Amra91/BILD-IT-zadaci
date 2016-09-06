package Zadaci_05_09_2016;
//program radi tako sto se unose 3 argumenta
//kada je mnozenje koristi se znak "x", jer "*" ne prepoznaje

public class Calculator {

	public static void main(String[] args) {
		
		// neispravan unos
		if (args.length > 3 || args.length==1 || args.length==2 || args.length==0) {
		     System.out.println("Nepravilan unos.");
		       System.exit(1);
			 }
			
		// prvi broj
		String first = args[0];
		int[] arrayFirst = split(first);
		
		//drugi broj
		String second = args[2];
		int[] arraySecond = split(second);
		
		//kreiranje prvog razlomka
		Rational a = new Rational(arrayFirst[0], arrayFirst[1]);
		
		//kreiranje drugog razlomka
		Rational b = new Rational(arraySecond[0], arraySecond[1]);
		
		Rational answer = null;
		
		String znak = args[1];
		//System.out.println(znak);
		switch (znak) {
		// Ako je jednak plusu dodajemo na listu i
		case "+":
			answer = a.add(b);
			break;
		// Ako je u pitanju znak minus oduzimamo
		case "-":
			answer = a.subtract(b);
			break;
		// Ako je u pitanju x mnozimo
		case "x":
			answer = a.multiply(b);
			break;
		case "/":
			// Ako je u pitanju kosa crta dijelimo
			answer = a.divide(b);
			break;
		}

		System.out.println(a + " " + args[1] + " " + b + " = " + answer);
		
	}
	
	public static int[] split (String str){
		
		String[] parts = str.split("/");
		String part1 = parts[0]; 	//kreiranje brojnika
		String part2 = parts[1];	//kreiranje nazivnika
		
		//konverovanje u integer vrijednosti
		int[] convert = { Integer.parseInt(part1), Integer.parseInt(part2)};
		
		return convert;
	}
	
	
}
