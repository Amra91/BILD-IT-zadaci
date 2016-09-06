package Zadaci_05_09_2016;
import java.math.BigInteger;

public class TestBigInteger {
	
	public static void main(String[] args) {
		   
		//kreiranje dva bigInteger broja
		BigInteger a = new BigInteger ("55555555");
		BigInteger b = new BigInteger("5");
		
		// pretvaranje u razlomak
		RationalBigInteger r1 = new RationalBigInteger(a,b);
		   System.out.println(a+ "/" +b +" = " + r1.toString());
		   
		   //sabiranje
		  System.out.println(a+ "/" +b +" +  "+ a+ "/" +b +" = "+  r1.add(r1));
		

  }
}
