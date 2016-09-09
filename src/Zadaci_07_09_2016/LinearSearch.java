package zadaci_08_09_2016;
/*
 * (Generic linear search) Implement the following generic method for linear search.
 * public static <E extends Comparable<E>> int linearSearch(E[] list, E key)
 */
public class LinearSearch {

	public static void main(String[] args) {
     
		//kreiranje niza sa Integer vrijednostima
	    Integer[] array = new Integer[10];
	     
	    for (int i = 0; i < array.length; i++) {
            //random dodjeljivanje vrijednosti matrici
             array[i] = (int)( Math.random()*20);
            }
	 
	    System.out.println("Lista:");
	   //printanje liste
	    for (int e: array){
	    	System.out.print(e + " ");
	    }
       
	    //uslov ukoliko nema odredjene vrijednosti u listi
	    if (linearSearch(array, 10)==-1){
	    	
	    	System.out.println("\nNema datog elementa u nizu.");
	    }
	    else {
	    	
	    	System.out.println("\nElemenat se nalazi na "+linearSearch(array, 10)+ " poziciji.");
	    }
    }

    public static <E extends Comparable<E>> int linearSearch(E[] list, E value) {

    	/*linerana pretraga krece od pocetnog indeksa u listi,
    	  i provjerava se svaki indeks, 
    	  dok ne dodje do trazene vrijednosti u listi i vraca indeks trazene vrijednosti */
       
    	for (int i = 0; i < list.length; i++) {
        	
        	//poredjenje compare to metodom
            if (list[i].compareTo(value) == 0) {
            	//vracanje pozicije u nizu
                return i;
            }
        }
        //ukoliko nije pronadjena trazena vrijednost u listi, metoda vraca -1
       return -1;
    }
}
