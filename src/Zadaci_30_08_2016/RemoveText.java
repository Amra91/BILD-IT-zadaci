package Zadaci_30_08_2016;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 *  (Remove text) 
 *  Write a program that removes all the occurrences of a specified string from a text file. 
 *  For example, invoking
 *  java Exercise12_11 John filename removes the string John from the specified file. 
 *  Your program should get the arguments from the command line. 
  */
public class RemoveText {
		
	public static void main(String[] args) throws IOException {
		//Ucitavamo fajl
		File file = new File("zaBrisanje.txt");
		
		if (!file.exists()){
			System.out.println("Fajl ne postoji");
		}
		else{
			//Kreiramo zamjenski file
			File tempFile = File.createTempFile("file", ".txt", file.getParentFile());
		
			System.out.println("Unesite string koji zelis da brises iz fajla: ");
			Scanner in = new Scanner(System.in);
		
		
			String delete = in.nextLine();	       //rijec ili recenica koja se treba ukloniti 
			in.close();
		
			//Kreiramo scanner objekt za citanje sadrzaja file-a
			Scanner reader = new Scanner(file);
			
			//Kreiramo PrintWriter objekt za unos teksta u zamjenski file
			PrintWriter writer = new PrintWriter(tempFile);
		
			int counter =0;							//brojac koliko ima istih stringova u file
			
			while(reader.hasNextLine()){
				String str = reader.nextLine();		//Citamo svaku liniju u tekstu
				String provjera = str.concat("");
				str = str.replace(delete, "");		//Mijenjamo rijec koju smo unijeli u toj liniji
				
				if(str.length() != provjera.length()){
					counter++;
				}
				writer.println(str);				//Upisujemo promjenjenu liniju teksta u zamjenski file
			}
	
			reader.close();
			writer.close();
		
			file.delete();							//Brisemo stari file
		
			tempFile.renameTo(file);				//Mijenjamo ime zamjenskog file u ime starog file
			
			//ukoliko je unesenog stringa nema u tekstualnoj datoteci
			if(counter > 0){
				System.out.println("Izvrseno.\nProvjerite tekstualnu datoteku");
			}
			else{
				System.out.println("Unijeti string ne postoji u tekstualnoj datoteci");
			}
	
		}
	}
}
