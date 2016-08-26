package Zadaci_25_08_2016;

public class MyString1 {
	
	//String se sastoji od niza karaktera
	char[] chars;


	//no args konstruktor;
	public MyString1(){
	
	}
	
	//konstruktor koji prima string
	public MyString1(String str){
	
		// od stringa napravit niz oznaka
		this.chars = new char[str.length()];
		
		for (int i=0; i<chars.length; i++){
			chars[i] = str.charAt(i);
			
		}
	}
	//konstruktor koji prima karaktere
	public MyString1(char[] chars){
	
		 this.chars = chars;
	}

	//metoda za pronalazak odredjenog karaktera pod datim indeksom
	public char charAt(int index){
		
		return chars[index];
	}
	
	//metoda koja vraca velicinu
	public int length(){
		// vraca velicinu niza karaktera
		return chars.length;
	}	
	
	//metoda koja pravi substring od datog stringa, substring pocinje od begin indeksa i zavrsava na end-1 indeksom
	public MyString1 substring(int begin, int end){
		
		// napravit cemo novi niz karaktera substringa
		char[] substring = new char[end-begin];
        
        for(int i = begin; i < end; i++) {
            substring[i-begin] = this.charAt(i);
        }
        
        return new MyString1(substring);
		
	}
	
	//metoda za vracanje malih slova
	public MyString1 toLowerCase(){
		
		for (int i = 0; i < chars.length; i++){
			// ukoliko su znakovi izmedju A i Z pretvorit cemo ih u mala slova tako sto cemo na isti dodat 32
			
			if ((this.chars[i] >= 'A') && (this.chars[i] <= 'Z')){
				
				//(65- A, 97-a u ASCII kodu)
				this.chars[i] = (char)(this.chars[i] + 32);
			}
		}
		return this;
	}
	
	//provjera da li je dati string jednak stringu s
	public boolean equals(MyString1 s){
		 
		//uslov ako duzine nisu iste
		if(this.length() != s.length()) {
	            return false;
	        }
	        
	    for(int i = 0; i < this.length(); i++) {
	          //ukoliko svaki indeks ne odgovara indeksu drugog stringa
	    	if(this.charAt(i) != s.charAt(i)) {
	             return false;
	            }
	        }
	        
	        return true;
	}
	
	//static meoda koja vraca i u string vrijednost
	public static MyString1 valueOf(int i){
	
		return new MyString1(Integer.toString(i).toCharArray());
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
