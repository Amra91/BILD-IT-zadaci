package Zadaci_25_08_2016;


/*
 *  (New string split method) 
 *  The split method in the String class returns an array of strings consisting 
 *  of the substrings split by the delimiters. However, the delimiters are not returned. 
 *  Implement the following new method that returns an array of strings consisting of the substrings split 
 *  by the matching delimiters, including the matching delimiters.
 *  public static String[] split(String s, String regex)
 *  
 *  For example, split("ab#12#453", "#") returns ab, #, 12, #, 453 in an array of String, 
 *  and split("a?b?gf#e", "[?#]") returns a, ?, b, gf, #, and e in an array of String. 
 */

public class NewStringSplitMethod {
	
	public static void main(String[] args) {

		//prvi primjer
        String[] a = split("ab#12#453", "#");
        
        for (String str: a){
        	System.out.print(str+ " ");
        }
        System.out.println();
        //drugi primjer
        String[] b = split("a?b?gf#e", "[?#]");
       
        for (String str : b) {
            System.out.print(str + " ");
        }
	}
	
	public static String[] split(String s, String regex){
		char[] arr = new char[regex.length()];
		int i = 0;
		//string split
	    String[] split = new String[s.length()];
	    
	    for(int k = 0; k<regex.length(); k++){
	    	arr[k] = regex.charAt(i);
	    }
	    
	    //glavna petlja
	    mainloop:
	   for(int k=0; k<s.length(); k++){
		   
		   //sporedna petlja
		   secondloop:
		   for(int j=0; j<regex.length(); j++){
			   
			   //if provjerava trenutni karakter glavne petlje u stringu sa svakim izuzetkom koji treba izbaciti
			   //i provjerava sve izuzetke
			   if(s.charAt(k) != regex.charAt(j)){
			   
				   continue secondloop;
			   	}
			   //else blok se izvrsava kada dati karakter stringa jednak regex[izuzetak]
			   else{
				   //if provjerava da li je trenutna pozicija niza null [nista do sada nije dodjeljeno]
				   if(split[i] != null) {
					   //inkrement pozicije niza samo kada nije null
					   i++;
				   }
				   // dodjeljivanje u niz
				   split[i] = Character.toString(s.charAt(k));
				   //prelazak na sljedecu poziciju u nizu
				   i++;
			  
			  continue mainloop;
		   }
		   
		  }
	    //if uslov da bi se izbjeglo pojavljivanje null 
	    if(split[i] == null) {
	   
            split[i] = "";
        }
	    
	    //dodavanje karaktera sve do izuzetka[regex] do trenutnog indeksa i
        split[i] += Character.toString(s.charAt(k));
    }
	    
	   // da bi izbjegli null vrijednosti, napravili smo novi niz sa validnim vrijednostima 
	    String[] splitNew = new String[i+1];
	    int d = 0;
	    do {
	    	
	        splitNew[d] = split[d];
	        d++;
	    } while (d <= i); 
	    
	    return splitNew;
	    
	   }

	   
	    	
	    
}
