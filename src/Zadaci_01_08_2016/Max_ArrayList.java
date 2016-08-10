package Zadaci_01_08_2016;

import java.util.ArrayList;

public class Max_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> list = new ArrayList <>();
		list.add(-1);
		list.add(-2);
		
		if (max (list)== 0)
			//The method returns null if the list is null or if the list contains 0 elements.
			System.out.println("The list is: \nnull.");
		
		else
			System.out.println("The largest number in the list is "+ max(list)+ ".");
			
		}
		
		public static int max(ArrayList<Integer> list){
			//The method finds the max integer
			int maxInt = list.get(0);
			for (int i = 0; i<list.size(); i++){
				if (maxInt < list.get(i)){
					maxInt = list.get(i);
				}
			}
			return maxInt;
		}


}
