package Zadaci_31_08_2016;
/*
 *  (Reformat Java source code) 

 *  Write a program that converts the Java source code from the next-line brace style to the end-of-line brace style.
 *   For example, the following Java source in (a) uses the next-line brace style. 
 *   Your program converts it to the end-of-line brace style in (b).
 *   Your program can be invoked from the command line with the Java sourcecode file as the argument. 
 *   It converts the Java source code to a new format. 
 *   For example, the following command converts the Java source-code file Test.java to the end-of-line brace style.
 *   java Exercise12_12 Test.java 
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
	   
 public class ReformatJavaSourceCode { 
	    
	 public static void main(String[] args) throws IOException 
	 {
		 
	 File file = new File("JavaCode.txt");
	      
		 if (!file.exists()){
				System.out.println("Fajl ne postoji");
			}
			else{
				
				String allText = "";		//string koji ce sadrzavat cijeli java kod   
				
				Scanner reader = new Scanner(file);   //Kreiramo scanner objekt za citanje sadrzaja file-a
				
				while(reader.hasNext())
				{
					
					allText +=reader.nextLine()+ "\n";	//spremanje cijele linije koda sa prebacivanjem u novi red 
				}
				reader.close();
						
				allText = allText.replaceAll("\\s*\\{", " {");	//pronalazak next-line brace style
				allText = allText.replaceAll("\\)\\s*\\{", ") {");	//zamjena sa end-of-line brace style 
				
				//Kreiramo PrintWriter objekt za unos teksta u fajl ponovo
				PrintWriter writer = new PrintWriter(file);
					writer.append(allText);
					writer.close();
				System.out.println("Zavrseno");
				
			}
	 }
	}
