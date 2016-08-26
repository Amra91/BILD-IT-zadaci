package Zadaci_25_08_2016;

public class MyString2 {
	
	// string se sastoji niza karaktera
	char[] chars;
	
	//no args konstruktor
	public MyString2(){
		
	}
	
	//konstruktor koji prima string
	public MyString2(String s){
		
		// od stringa napravit niz oznaka
		this.chars = new char[s.length()];
				
		for (int i=0; i<chars.length; i++){
			chars[i] = s.charAt(i);			
		}
	}

	//konstruktor koji prima karaktere
	public MyString2(char[] chars){
		
		 this.chars = chars;
	}
	
	/*  metoda compare vraæa 0, ako je dati string(niz karaktera) jednak stringu argumenta
	 *  odnosno ako je svaki karakter datog stringa(niz karaktera) jednak karakteru  stringa argumenta
	 *  metoda compare vraca vrijednost vecu od 0, ako dati string(niz karaktera) leksikografski veæi od stringa argumenta
	 *  metoda compare vraca vrijednost manju od 0,ako dati string(niz karaktera) leksikografski manji od struna argument
	 */
	public int compare(String s){
		
		//ukoliko stringovi nisu iste duzine
		if (this.chars.length != s.length()){
			//vraca se vrijednost ili negativna ili pozitivna u zavisnosti od velicine stringa argumenta		
			return this.chars.length - s.length();
			}
		//provjera da li je svaki znak identican
		for (int i = 0; i < chars.length; i++)
			if (this.chars[i] != s.charAt(i)){
				//ukoliko nije, vraca se vrijednost za koliko je neki karakter veci ili manji od datog stringa
					return this.chars[i]-s.charAt(i);
					}
		//ako su stringovi identicni, vraca se 0
			return 0;
	}
	
	//metoda za kreiranje substringa od pocetnog indeksa
	public MyString2 substring(int begin){
		
		//velicina novog niza karaktera je velicina datog stringa umanjena za vrijednost pocetnog indeksa
		char[] substring = new char[this.chars.length-begin];
		
		for (int i=0; i<substring.length; i++){
			// novi niz karakter je krece od datog niza sa indeksom i+ pocetna vrijednost;
			substring[i]= this.chars[i+ begin];
		}
		return new MyString2(substring);
		
		
	}
	
	//metoda za vracanje velikih slova
	public MyString2 toUpperCase(){
		
		for (int i = 0; i < chars.length; i++){
			// ukoliko su znakovi izmedju a i a pretvorit cemo ih u velika slova tako sto cemo na isti oduzet 32
			
			if ((this.chars[i] >= 'a') && (this.chars[i] <= 'z')){
				
				//(65- A, 97-a u ASCII kodu)
				this.chars[i] = (char)(this.chars[i] - 32);
			}
		}
		return this;
	}
	
	//metoda za vracanje niza karaktera
	public char[] toChars(){
		
		//novi niz ima duzinu datog stringa (koji je pretvoren u niz karaktera)
		char[] charNew = new char[chars.length];
			//novi niz poprima vrijednosti datog stringa karaktera
			for (int i=0; i<charNew.length; i++){
				charNew[i]= chars[i];
			}
		return charNew;
	}
	
	//metoda vraca string  koji je postavljen kao boolean vrijednost (true || false)
	public static MyString2 valueOf(boolean b){ 
		if (b) 
			return new MyString2("true");
		else
			return new MyString2("false");
	}

	@Override
	public String toString() {
		String a="";
		for (int i=0; i<chars.length; i++){
			a+=chars[i]+"";
		}
		return a;
	}
		
}
