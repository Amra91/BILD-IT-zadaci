package Zadaci_30_08_2016;
/*
 * (OutOfMemoryError) 
 * Write a program that causes the JVM to throw an OutOfMemoryError and catches and handles this error. 
 */
public class OutOfMemoryError_ {

	public static void main(String[] args) {
		//try blok za izvrenje 
		try{
			String x = "1";
			// while petlja uvijek true, nista ne prekida tako da ce doci do popunjavanja cijele memorije
			while (true){
			    x = (x + x);
			}
		}
		// catch blok hvata i printa poruku da je puna heap memorija
		catch(OutOfMemoryError ex){
				
				System.out.println("Out of memory error");
				//izlazak iz programa;
				System.exit(1);
			}
	}

}
	

