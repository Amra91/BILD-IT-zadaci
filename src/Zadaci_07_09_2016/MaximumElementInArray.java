package zadaci_08_09_2016;
/*
 * (Maximum element in an array) 
 * Implement the following method that returns the maximum element in an array.
 * public static <E extends Comparable<E>> E max(E[] list)
 */
public class MaximumElementInArray {

	 public static void main(String[] args) {

		 
		//kreiranje niza sa Integer vrijednostima
	    Integer[] array = new Integer[10];
	     
	    for (int i = 0; i < array.length; i++) {
            //random dodjeljivanje vrijednosti matrici
             array[i] = (int)( Math.random()*20);
            }

	    System.out.println("Max = " + max(array));
	    
	 }

	    public static <E extends Comparable<E>> E max(E[] list) {

	        E max = list[0];	
	        
	        for (int i = 1; i < list.length; i++) {
	            E element = list[i];
	            //uslov za pronalazenje najveceg elementa u listi, poredjenje compareTo metodom
	            if (element.compareTo(max) > 0) {
	                max = element;
	            }
	        }

	        return max;
	    }
	}
