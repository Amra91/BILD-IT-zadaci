package Mini_Projekat_Kalendar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Remainder {
	String ime_podsjetnika;
	int dan;
	int godina;
	int mjesec;
	File file;
	
	public Remainder(){
		
	}
	
	public Remainder(String ime,int dan,File file,int godina,int mjesec) {
		this.ime_podsjetnika = ime;
		this.dan = dan;
		this.file = file;
		this.mjesec = mjesec;
	}
	
	public int getMjesec() {
		return mjesec;
	}
	
	public void setMjesec(int mjesec) {
		this.mjesec = mjesec;
	}
	
	public int getGodina() {
		return godina;
	}
	
	public void setGodina(int godina){
		this.godina = godina;
	}
	
	public int getDan() {
		return dan;
	}
	
	public void setDan(int dan) {
		this.dan = dan;
	}
	
	public String getIme_podsjetnika() {
		return ime_podsjetnika;
	}
	
	public void setIme_podsjetnika(String ime_podsjetnika) {
		this.ime_podsjetnika = ime_podsjetnika;
	}
	
	public File getFile(){
		return file;
	}
	
	public void setFile (File file){
		this.file = file;
	}
		
	
	//Metoda kreira novi fajl pod imenom koji je korisnik unio
	public void doTheLogicOfRemainder(int year, int day, String ime_podsjetnika, ArrayList<Remainder> list) throws IOException{
		
		File file = new File(getIme_podsjetnika()+".txt");
		PrintWriter writer = new PrintWriter(file);
		Scanner in = new Scanner(System.in);
		
		//metoda koja unosi text u fajl[podsjetnik]
		insertTextIntoFile(writer, in);
		setFile(file);
	}
	
	//Metoda upisu text kojeg korisnik kuca u konzoli
	//Nakon unosenja teksta metoda vraca file
	public File insertTextIntoFile(PrintWriter writer, Scanner in) throws IOException{
		
		//Maksimalan broj linija koji se moze unijeti u fajl je 50
		//varijabla i broji linije koje smo unijeli u podsjetnik
		//takodjer smo stavili uslov da nula prekida uslov
		//unos teksta se prekida samo kada je 0 sama u liniji
		int i=0;
		while(i != 50){
			String str = in.nextLine();
			i++;
			writer.println(str);
			if(str.equals("0")){
				break;
			}
			
		}
		writer.close();
		return file;
	}
	
	//Metoda pronalazi fajl i printa sadrzaj fajl-a[podsjetnika]
	
	public void printRemainder(ArrayList<Remainder> list, String str) throws FileNotFoundException{
		
			//for petljom pronalazimo file kojeg je korisnik zahtjevao
			//za moguce greske imamo metode koje provjeravaju ime podsjetnike
			//prije nego sto smo ovdje dosli
			
			for(int i=0; i<list.size(); i++){
				if(list.get(i).getIme_podsjetnika().equals(str)){
					
					//Koristimo klasu FileReader za citanje fajla
					//prosljedjujemo fajl iz arrayListe pod imenom kojeg korisnik unese
					FileReader file_reader = new FileReader(list.get(i).file);
					Scanner input = new Scanner(file_reader);
					//while petlja cita dokument liniju po liniju
					while(input.hasNextLine()){
						//ono sto smo procitali u liniji spremamo u String
						String strs = input.nextLine();
						
						//Uslov koji pronalazi liniju koja sadrzi samo nulu [0 je za prekid unosa teksta]
						//kada je pronadje nulu izlazi iz while petlje i 0 se ne printa
						
						if(strs.equals("0")){
							break;
						}
						
						System.out.print(strs+"\n");
					}
					input.close();
					break;
				}
			}
		}
	
	//Metoda provjerava ime podsjetnika kojeg korisnik zeli da kreira
	//ako podsjetnik vec postoji trazi se da se unese drugo ime
	//Metoda se koristi kod kreiranja novog podsjetnika
	public boolean checkNameOfRemainder(ArrayList<Remainder> list, String str){
		for(int i=0; i<list.size(); i++){
			if(list.get(i).getIme_podsjetnika().equals(str)){
				System.out.println("Ime vec postoji.\nUkucajte ponovo.");
				
				return true;
				
			}
			
		}
		return false;
	}
	
	//Metoda koja provjerava da li ime postoji..
	//Metoda je tu kao osiguranje da budemo sigurni je li korisnik unio tacno ime 
	//podsjetnika za printanje
	//Metoda se koristi kod printanja vec postojecih podsjetnika u bazi
	public boolean checkIfNameExist(ArrayList<Remainder> list, String str){
		
		for(int i=0; i<list.size(); i++){
			if(list.get(i).ime_podsjetnika.equals(str)){
				return true;
			}
		}
		System.out.print("Nepravilan unos.\nMolimo unesite ponovo.");
			
		return false;
	}
}

