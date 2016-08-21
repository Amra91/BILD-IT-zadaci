package Zadaci_20_08_2016;
/*
 * Stopwatch) Design a class named StopWatch. The class contains:
 * Private data fields startTime and endTime with getter methods. 
 * A no-arg constructor that initializes startTime with the current time. 
 *  A method named start() that resets the startTime to the current time. 
 *  A method named stop() that sets the endTime to the current time. 
 * A method named getElapsedTime() that returns the elapsed time for the stopwatch in milliseconds.  
 * 
 * Draw the UML diagram for the class and then implement the class. 
 * Write a test program that measures the execution time of sorting 100,000 numbers using selection sort. 
 */
public class StopWatch {

	//  data fileds
	private long startTime;
	private long endTime;
	
	
	//no-arg konstruktor
	StopWatch(){
		
	}
	
	//geter metoda za startTime
	public long getStartTime() {
		return startTime;
	}
	//geter metoda za endTime
	public long getEndTime() {
		return endTime;
	}
	
	//metoda za pokretanje
	void start(){
	 startTime= System.currentTimeMillis();
	}
	
	//metoda za stopiranje
	void stop(){
		endTime = System.currentTimeMillis();
	}
	
	//metoda za vracanje proteklog vremena
	long getElapsedTime(){
		return endTime-startTime;
	}
	
}
