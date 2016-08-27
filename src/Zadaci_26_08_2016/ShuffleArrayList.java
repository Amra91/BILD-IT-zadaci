package Zadaci_26_08_2016;

import java.util.ArrayList;
/*
 * (Shuffle ArrayList) 
 * Write the following method that shuffles the elements in an ArrayList of integers. 
	public static void shuffle(ArrayList<Integer> list) 
 */
public class ShuffleArrayList {

	public static void main(String[] args) {
		
		// kreiranje ArrayListe lis
		ArrayList<Integer> list = new ArrayList<>();
		//dodavanje brojeva
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(69);
		
		//poziv metode
		shuffle(list);
		
	}
	
	public static void shuffle(ArrayList<Integer>list){
		
		//kreiranje nove liste integera
		ArrayList<Integer> newList = new ArrayList<>();
		
		System.out.println("Array after shuffle:");
		if (list.isEmpty()){
			System.out.println("ArrayLista je prazna.");
		}
		
		//uslov dok ArrayLista list ne bude prazna
		while(!list.isEmpty()){
			
			//random broj indeksa ArrayListe
			int k=(int)(Math.random()*list.size());
			
			//ubacivanje broja sa tim ideksom u novu listu
			newList.add(list.get(k));
			
			//izbacivanje broja sa tim indeksom iz stare liste
			list.remove(list.get(k));
			
		}
		
		//printanje
		for (int i=0; i<newList.size(); i++){
			System.out.println(newList.get(i));
		}


	}
}
