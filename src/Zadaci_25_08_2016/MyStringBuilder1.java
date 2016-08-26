package Zadaci_25_08_2016;

public class MyStringBuilder1 {
	
	String str;
	
	//konstruktor koji prima string;
	public MyStringBuilder1(String s){
		this.str=s;
	}
	
	//metoda za dodavanje stringa 
	public MyStringBuilder1 append(MyStringBuilder1 s){
		this.str += s.str;
		return new MyStringBuilder1(this.str);
	}
	
	//metoda za dodavanje broja
	public MyStringBuilder1 append(int i){
		return new MyStringBuilder1(this.str += i);
	}
	//metda za vracanje duzine stringa
	public int length(){
		return str.length();
	}
	
	//metoda za vracanje karaktera pod odredjenim indeksom
	public char charAt(int index){
		
		return str.charAt(index);
	}
	//metoda za pretvaranje u mala slova
	public MyStringBuilder1 toLowerCase(){
		return new MyStringBuilder1(str.toLowerCase());
	}
	//metoda za kreiranje substringa
	public MyStringBuilder1 substring(int begin, int end){
		String str = "";
		
		for(int i=begin; i<end; i++){
			str += this.str.charAt(i);
		}
		return new MyStringBuilder1(str);
		
		
	}

	@Override
	public String toString() {
		return this.str;
	}
}