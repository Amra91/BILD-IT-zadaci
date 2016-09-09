package zadaci_08_09_2016;

import java.util.ArrayList;

/*
 * (Distinct elements in ArrayList) 
 * Write the following method that returns a new ArrayList. The new list contains the non-duplicate elements from the original list.
 * public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
 */
public class RemoveDuplicates {

	 public static void main(String[] args) {

		 ArrayList<String> list = new ArrayList<>();
	        list.add("am");
	        list.add("ra");
	        list.add("am");
	        list.add("ra");
	        
	    //lista bez duplikata
	    list = removeDuplicates(list);
	  
	    //printanje
	    for (int i=0; i<list.size(); i++){
	            System.out.println(list.get(i));
	      }
	 }

	 public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {

		 //kreiranje nove arrayListe
	    ArrayList<E> newList = new ArrayList<>(list.size());
	     
	       for (E aList : list) {
	    	   
	    	   //metoda provjerava listu za odredjeni element
	            if (!newList.contains(aList)) {
	            	//ubacivanje elemenata u novu listu
	            	newList.add(aList);
	            }
	        }
	        
	        return newList;
	    }
	}
