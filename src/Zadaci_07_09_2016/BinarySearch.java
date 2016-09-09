package zadaci_08_09_2016;
/*
 * (Generic binary search) 
 * Implement the following method using binary search.
 * public static <E extends Comparable<E>>  int binarySearch(E[] list, E key)
 */
public class BinarySearch {

	 public static void main(String[] args) {

		//kreiranje niza sa Integer vrijednostima
		    Integer[] array = new Integer[10];
		     
		    for (int i = 0; i < array.length; i++) {
	            //random dodjeljivanje vrijednosti matrici
	             array[i] = (int)( Math.random()*20);
	            }
		    
		    java.util.Arrays.sort(array);
		    
		    System.out.println("Lista:");
		    for (int e: array){
		    	System.out.print(e + " ");
		    }

		    //uslov ukoliko nema odredjene vrijednosti u listi
		    if (binarySearch(array, 10)==-1){
		    	
		    	System.out.println("\nNema datog elementa u nizu.");
		    }
		    else {
		    	
		    	System.out.println("\nElemenat se nalazi na "+binarySearch(array, 10)+ " poziciji.");
		    }
	    }

	    public static <E extends Comparable<E>> int binarySearch(E[] list, E value) {
	    	
	    	//binarna pretraga se izvrsava tako sto prepolovimu datu listu, 
	    	//uporedimo da li je elemenat jednak srednjoj poziciji, ako jest vracamo srednji indeks
	    	//ukoliko je trazena vrijednost veca od srednjeg indeksa, pretraga se nastavlja u drugoj polovici niza i obratno
	  
	        int low = 0;
	        int high = list.length - 1;
	        
	        while (high >= low) {
	            
	        	int mid = (high - low) / 2 + low;
	            
	        	if (list[mid].compareTo(value) == 0) {
	            	
	            	return mid;
	            }

	            if (list[mid].compareTo(value) < 0){
	             
	            	low = mid + 1;
	            }
	            else{
	            	
	                high = mid - 1;
	            }
	        }
	        
	        //ukoliko trazena vrijednost nije pronadjena u listi vraca se -1
	        return -1; 
	        
	 
	    }
	}
