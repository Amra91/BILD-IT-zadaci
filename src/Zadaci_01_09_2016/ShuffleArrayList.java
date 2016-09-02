package Zadaci_01_09_2016;

import java.util.ArrayList;

/*
 *  (Shuffle ArrayList) Write the following method that shuffles an ArrayList of numbers:
 *  public static void shuffle(ArrayList<Number> list) 
 */
public class ShuffleArrayList {
	
	public static void main(String[] args) {
		
		//kreiranje ArrayListe za apstarktnu klasu Number
		ArrayList<Number> list = new ArrayList<>();
	
		//unos 10 random brojeva
		for (int i=0; i<10; i++){
			int j= (int)(Math.random()*20);
			list.add(j);
			}
		
		//printanje listi
		System.out.println("List is:");
		System.out.println(list);
		shuffle(list);
		System.out.println("\nShuffle list is:");
		System.out.println(list);
}
	 public static void shuffle(ArrayList<Number> list) {
  
	      for (int i = 0; i < list.size(); i++) {
	    	  // random indeks
	            int rand = (int) (Math.random() * list.size());
	         
	            //Number randNum postaje broj sa random indeksom
	            Number randNum = list.get(rand);
	          
	            //random indeks ide na  i-tu poziciju
	            list.set(rand, list.get(i));
	           
	            //a i-ta pozicija dobiva vrijednost Number random vrijednosti
	            list.set(i, randNum);
	           // System.out.println(list+"\n");
	        }

	    }
	}
