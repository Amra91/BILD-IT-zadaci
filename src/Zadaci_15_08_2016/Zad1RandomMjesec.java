package Zadaci_15_08_2016;
/*
 * Napisati program koji nasumièno generiše cijeli broj izmeðu 1 i 12 
 * te ispisuje ime mjeseca za taj broj. (Januar za 1, Ferbruar za 2....)

 */
public class Zad1RandomMjesec {

	public static void main(String[] args) {
		
	/* math random dobivamo zeljeni broj za odredjeni mjesec
	 * svaki case predstavlja odredjeni mjesec
	 */
		switch (1+(int)(Math.random()*12)){
			case 1:
				System.out.println("Januar ");
				break;
			case 2: 
				System.out.println("Februar ");
				break;
			case 3:
				System.out.println("Mart ");
				break;
			case 4:
				System.out.println("April ");
				break;
			case 5:
				System.out.println("Maj ");
				break;
			case 6:
				System.out.println("Juni ");
				break;
			case 7:
				System.out.println("Juli ");
				break;
			case 8:
				System.out.println("August ");
				break;
			case 9:
				System.out.println("Septembar ");
				break;
			case 10:
				System.out.println("Oktobar ");
				break;
			case 11:
				System.out.println("Novembar ");
				break;
			case 12:
				System.out.println("Decembar ");
				break;
			
		}
	}
}
