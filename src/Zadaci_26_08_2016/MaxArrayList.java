package Zadaci_26_08_2016;
/*
 *  (Maximum element in ArrayList) 

 *  Write the following method that returns the maximum value in an ArrayList of integers. 
 *  The method returns null if the list is null or the list size is 0. 
 *  public static Integer max(ArrayList<Integer> list)
 */
import java.util.ArrayList;

public class MaxArrayList {
	
	public static void main(String[] args) {

	ArrayList <Integer> list = new ArrayList <>();
	
	list.add(7);
	list.add(20);
	
	//uslov ako je velicina niza 0
	if (max (list)==0)
		//The method returns null if the list is null or if the list contains 0 elements.
		System.out.println("The list is: \nnull.");
	
	else
		System.out.println("The largest number in the list is "+ max(list)+ ".");
		
	}
	
	//metoda za pronalazenje najveceg integera u listi
	public static Integer max(ArrayList<Integer> list){
		
		//ukoliko je niz prazan vraca 0
		if (list.isEmpty()){
			return 0;
		}
		//pronalazak najveceg elementa u nizu
		int maxInt = list.get(0);
		
		for (int i = 0; i<list.size(); i++){
			if (maxInt < list.get(i)){
				maxInt = list.get(i);
			}
		}
		return maxInt;
	}
}