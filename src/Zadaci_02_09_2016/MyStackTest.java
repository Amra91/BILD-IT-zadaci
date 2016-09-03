package Zadaci_02_09_2016;
/*
 *  (Revise the MyStackclass)
 *   Rewrite the MyStack class in Listing 11.10 to perform a deep copy of the list field
 */
public class MyStackTest {

	 public static void main(String[] args) throws CloneNotSupportedException {

	        MyStack stack1 = new MyStack();	//kreiranje objekata stack1
	        //Ubacivanje u ArrayList
	        stack1.push(2);
	        stack1.push(22);
	        stack1.push(5);
	        stack1.push(7);
	        
	        //Kreiranje stack2 objekta kloniranjem stack1
	        MyStack stack2 = (MyStack) stack1.clone();
	       
	        // printanje velicina stack1 objekta i stack2 objekta
	        System.out.println("stack1 size = " + stack1.getSize());
	        System.out.println("stack2 size = " + stack2.getSize());
	        
	        stack1.pop();	
	        
	       
	        // printanje velicina stack1 objekta i stack2 objekta
	        System.out.println("\nstack1 size = " + stack1.getSize());
	        System.out.println("stack2 size = " + stack2.getSize());

	    }
}
