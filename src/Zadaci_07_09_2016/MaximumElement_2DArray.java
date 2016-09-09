package zadaci_08_09_2016;
/*
 * (Maximum element in a two-dimensional array) 
 * Write a generic method that returns the maximum element in a two-dimensional array.
 * public static <E extends Comparable<E>> E max(E[][] list)
 */
public class MaximumElement_2DArray {

	 public static void main(String[] args) {

		 //kreiranje 2D matrice sa Integer vrijednostima
	        Integer [][] matrix = new Integer[3][3];
	        
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[i].length; j++) {
	            	//random dodjeljivanje vrijednosti matrici
	                matrix[i][j] = (int)( Math.random()*20);
	            }
	        }

	        System.out.println("Max = " + max(matrix));
	    }

	    public static <E extends Comparable<E>> E max(E[][] list) {

	        E max = list[0][0];
	        for (E[] elements : list) {
	            for (E element : elements) { 	
	            	
	            	//compare to metodom provjeravamo elemente, za pronalazak najveceg u matrici
	                if (element.compareTo(max) > 0) {
	                    max = element;
	                }
	            }
	        }

	        return max;
	    }
	}
