package Zadaci_23_08_2016;
/*
 *  (The Time class) Design a class named Time. The class contains:
 *    The data fields hour, minute, and second that represent a time. 
 *     A no-arg constructor that creates a Time object for the current time. (The values of the data fields will represent the current time.) 
 *     A constructor that constructs a Time object with a specified elapsed time since midnight, January 1, 1970, in milliseconds. 
 *       (The values of the data fields will represent this time.) 
 *     A constructor that constructs a Time object with the specified hour, minute, and second. 
 *     Three getter methods for the data fields hour, minute, and second, respectively.
 *     A method named setTime(long elapseTime) that sets a new time for the object using the elapsed time. 
 *     
 *      For example, if the elapsed time is 555550000 milliseconds,   the hour is 10, the minute is 19, and the second is 10. 
 *      
 *      Draw the UML diagram for the class and then implement the class.
 *      
 *       Write a test program that creates two Time objects 
      (using new Time() and new Time(555550000)) and displays their hour, minute, and second in the format hour:minute:second. 
      (Hint: The first two constructors will extract the hour, minute, and second from the elapsed time. 
      For the no-arg constructor, the current time can be obtained using System.currentTimeMillis(), 
     
 */
public class Time {
	long hours;
	long minutes;
	long seconds;

	
	Time(){
		seconds = System.currentTimeMillis();
		minutes =  System.currentTimeMillis();
		hours =  System.currentTimeMillis();
		}
	Time(long sek){
		seconds = sek;
	}
	
	public void setHours(long hours){
		this.hours = hours;
	}
	public void setMinutes(long minutes){
		this.minutes = minutes;
		
	}
	public void setSeconds(long seconds){
		this.seconds = seconds;
	}
	long getHours(){
		long sat = ((seconds /1000)/60)/60;
		 
		 sat = sat % 24;
		 return sat;
		
	}
	long getMinutes(){
		long min = (seconds / 1000)/60;
		min = min%60;
		return min;
	}
	long getSecond(){
		seconds = seconds/1000;
		seconds = seconds % 60;
		return seconds;
	}

}
