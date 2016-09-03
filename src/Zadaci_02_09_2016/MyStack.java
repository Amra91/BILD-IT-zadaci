package Zadaci_02_09_2016;
/*
 *  (Revise the MyStackclass)
 *   Rewrite the MyStack class in Listing 11.10 to perform a deep copy of the list field
 */
import java.util.ArrayList; 

public class MyStack implements Cloneable { 
	//data fileds
	private ArrayList<Object> list = new ArrayList<>(); 
	
	//metoda za provjeru da li je lista prazna
	public boolean isEmpty() { 
		return list.isEmpty(); 
		} 
	//metoda koja vraca velicinu ArrayListe
	public int getSize() { 
		return list.size(); 
		}
	//metoda koja vraca zadnji unesen broja
	public Object peek() { 
		return list.get(getSize() - 1); 
		}
	//metoda koja brise iz arrayListe
	 public Object pop() { 
		 Object o = list.get(getSize() - 1); 
		 list.remove(getSize() - 1); 
		 return o; 
		 } 
	 //metoda koja dodaje novi elemenat u listu 
	 public void push(Object o) { 
		 list.add(o);
		 } 
	 @Override 
	 public String toString() { 
		 return "stack: " + list.toString(); 
		 } 
	 
	 @Override
	 //interface
	  protected Object clone() throws CloneNotSupportedException  {
	       
		 	MyStack myStack = null;						//Kreiranje varijable tipa MyStack
		 	
	        myStack = (MyStack) super.clone();			//super.clone() pozivamo kao prvi izraz u kloniranju objekta
	        
	        myStack.list = new ArrayList<>(list);		//kreiranje klonirane arrayListe
	        
	        return myStack;
	    }
	 } 


