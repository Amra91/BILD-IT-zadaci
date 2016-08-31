package Zadaci_30_08_2016;
/*
 * (NumberFormatException) 
 *  Write the bin2Dec(String binaryString) method to convert a binary string into a decimal number. 
 *  Implement the bin2Dec method to throw a NumberFormatException if the string is not a binary string. 
 */
public class NumberFormatException_ {

	public static void main(String[] args) {
		
		//string za provjeru
		String a ="sdhsafkfjdf";
		String b ="11010111";
		bin2Dec(b);
		bin2Dec(a);
	}
	//metoda koja provjerava i izbacuje exception
	public static void bin2Dec (String binaryString) throws NumberFormatException{
		
		boolean check = true;
		//for petlja za provjeru da li su binarni karakteri u stringu
		for (int i=0; i<binaryString.length(); i++){
			if (binaryString.charAt(i)!='0' && binaryString.charAt(i)!='1'){
				//System.out.print(binaryString.charAt(i));
				check=false;
				break;
				
			}
		}
		//uslov ako nisu
		if (!check){
			//izbacuje exception odnosno NumberFormatException uz opis exception
			throw new NumberFormatException("Is not binary String: "+ binaryString);
		}
		//printa ispravan binarni string
		else{
		System.out.println("Binary String: "+ binaryString);	
		}
			
		
	}
}
