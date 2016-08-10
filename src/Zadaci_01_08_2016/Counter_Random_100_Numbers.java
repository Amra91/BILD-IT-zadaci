package Zadaci_01_08_2016;

import java.util.Arrays;

public class Counter_Random_100_Numbers {
public static void main(String[] args) {
		
		int[] array = new int[100];					//declaring an array of 100  elements
		
		//this "for loop" generate 100 integers [0,9 digits ]
		for(int i=0; i<array.length; i++){
			array[i] = (int)(Math.random()*10);
			
		}
		
		int counter = 0;									//counter for matching elements in the array
		
		
		Arrays.sort(array);									
					
		int[] array_of_counter = new int[array.length];		//declaring an array where we will store how many 
															//some element occur in the array
		
		
		
		//this loop count and store in the array_of_counter array.
		for(int i=0; i<array.length; i++){					
			for(int j = 0; j<array.length; j++){
				if(array[i] == array[j]){
					counter++;
					
				}
			}
			array_of_counter[i] = counter;		//this line store 'counts' into  array
			counter = 0;						//counter sets to zero for next iteration
		}
		
		
		//this loop change those element who occurs more than 
		//one time in an array
		for(int i=0; i<array.length-1; i++){
			if(array[i] == array[i+1]){
				array[i] = -1;
			}
				
		}
		
		//and finnaly this loop print all elements. 
		for(int i=0; i<array.length; i++){
			if(array[i] != -1){
				System.out.println(array[i] +" se pojavljuje: "+array_of_counter[i]);
			}
		}
		
	
	
	}

}
	