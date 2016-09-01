package Zadaci_31_08_2016;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/* (Add package statement) 
 * Suppose you have Java source files under the directories chapter1, chapter2, . . . , chapter34. 
 * Write a program to insert the statementpackage chapteri;
 *  as the first line for each Java source file under the directory chapteri. 
 *  Suppose chapter1, chapter2, . . . , chapter34 are under the root directory srcRootDirectory. 
 *  The root directory and chapteri directory may contain other folders and files. 
 *  Use the following command to run the program:
 *  java Exercise12_18 srcRootDirectory 
 */
public class AddPackageStatement {

	public static void main(String[] args) throws Exception {
		// Provjera command argumenta
		if (args.length != 1) {
			System.out.println("Upotrijebi pravilan java direktorij");
			System.exit(1);
		}

		//Prosljedjujemo unijeti direktorij iz command prompt u file
		File rootDir = new File(args[0]);
		//Provjera da li unijeti direktorij postoji
		if (rootDir.isDirectory() == false) {
			System.out.println("Direktorij " + args[0] + " ne postoji");
			System.exit(2);
		}
		
		
		// Kreiranje liste koja sadrzi direktorije
		ArrayList<File> packages = getDirectories(rootDir);
		
		while (packages.isEmpty() == false) {
			
			ArrayList<File> files = getFiles(packages);
			
			addPackageStatement(files, packages.get(0));
			
			//Brisemo fajl koji smo spremili na prvu poziciju
			packages.remove(0); 
		}
	}

	// Ubacujemo string za svaki fajl u listi
	public static void addPackageStatement(ArrayList<File> list, File dir) throws Exception {
		
		
		for (int i = 0; i < list.size(); i++) {
			
			ArrayList<String> str = new ArrayList<>();
			str.add("package " + dir.getName() + ";");
			
			try (
				//Kreiramo scanner prosljedjemo file koji se nalazi u ArrayList
				Scanner input = new Scanner(list.get(i));
				) {
				
				while (input.hasNext()) {
					//Spremamo svaku liniju u ArrayList kao string
					str.add(input.nextLine());
					
				}
				
			}

			try (
				//Kreiramo PrintWriter objekat, prosljedjujemo mu fajl i upisujemo
				//string iz ArrayList str
				PrintWriter output = new PrintWriter(list.get(i));
			) {
				for (int j = 0; j < str.size(); j++) {
					output.println(str.get(j));
					
				}
				
			}
		}
	}

	// Dodajemo sve fajlove u arrayList tipa File koji se nalaze u folderu 
	public static ArrayList<File> getFiles(ArrayList<File> dir) {
		
		//provjera direktorija 
		if (dir.get(0).isDirectory() == false) {
			System.exit(0);
		}
		
		ArrayList<File> list = new ArrayList<>(Arrays.asList(dir.get(0).listFiles()));
		
		//Metoda koja brise sve fajlove koje nemaju ekstenziju .java
		provjeraJavaFajlova(list);	
		return list;
	}

	//Provjeravamo i brisemo sve file-ove koji nemaju ekstenziju .java 
	public static void provjeraJavaFajlova(ArrayList<File> list) {
		for (int i = 0; i < list.size(); i++) {
			//Uzimamo ime file objekta u string
			String str = list.get(i).getName();	
			boolean isjavaCode = str.substring(str.lastIndexOf('.')).equals(".java");
			//Ako String koji sadrzi ime fajla nema ekstenziju .java brisemo iz liste
			if (isjavaCode == false)
				list.remove(i);
		}
		
	}

	//Dodajemo file objekte u listu
	public static ArrayList<File> getDirectories(File root) {
		ArrayList<File> direktorij = new ArrayList<>();
		for (int i = 1; i < 34; i++) {
			//dodajemo u listu novi fajl objekat od parent  pathname i child string pathname
			direktorij.add(new File(root, "chapter" + i));
		}
		
		return direktorij;
	}
}