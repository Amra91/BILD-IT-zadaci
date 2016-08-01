package Zadaci_01_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Counter_ArrayList {

	public static void main(String[] args) {

			
		Scanner in = new Scanner(System.in);   			//declaring scanner object for inputs
		
		ArrayList<Integer> list = new ArrayList<>();	//declaring arrayList where we will store elements of array
		System.out.println("Please enter the integer digits. [0 stops inputs]");
		boolean correct_input = false;
		while(!correct_input){
		
			try{											
		int n = in.nextInt();
		
		
		while(n != 0){									//while loops is for adding ellements to our array
			list.add(n);								//until we type '0'
			n = in.nextInt();
			
		}
		correct_input = true;
		}catch(InputMismatchException ex){
			System.out.println("Invalid input.\nYou must enter integer digit.\nPlease enter again:");
			in.next();
		}
		
		}//end of while loop
		
		in.close();
		
		int max = list.get(0);						//this max variable is used for finding the biggest element
												
		for(int i=0; i<list.size(); i++){
			if(list.get(i) > max){
				max = list.get(i);					//here we actually find the biggest element
			}
		}
		
		int counter = 0;							//declaring counter variable  to count how many the biggest 
													//element occurs in the array
		
		
		
		for(int i=0; i<list.size(); i++){
			if(list.get(i) == max){
				counter++;							//here we count how many max element occurs in the array
			}
		}
		
		
		
		//and finnaly we print all the info's to the screen.
		
		System.out.println("The biggest element in the array is: "+max+
				"\nAnd he occurs "+counter+" time.");
		
		
		
		
	
	
	}
}
