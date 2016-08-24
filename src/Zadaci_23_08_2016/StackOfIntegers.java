package Zadaci_23_08_2016;

public class StackOfIntegers {
	 
	//data files
	private int[] elements;
	  private int size;
	  public static final int MAX_SIZE = 16;

	  //konstruktor sa defa size od 16
	  public StackOfIntegers() {
	    this(MAX_SIZE);
	  }

	  // Konstruktor sa specificnom velicinom niza
	  public StackOfIntegers(int capacity) {
	    elements = new int[capacity];
	  }

	  //ubacivanje integera na vrh steka
	  public int push(int value) {
	   
		  if (size >= elements.length) {
			  //zamjena niza novim nizom uvecanim duplo
			  int[] temp = new int[elements.length * 2];
			  //kopiranje niza
	      System.arraycopy(elements, 0, temp, 0, elements.length);
	      //elements se mijenja sa temp nizom
	      elements = temp;
	    }
		  //dodavanje elementa u niz
	    return elements[size++] = value;
	  }

	  //vracanje i brisanje elemenata iz niza
	  public int pop() {
	    return elements[--size];
	  }

	  //povratak na vrh steka
	  public int peek() {
	    return elements[size - 1];
	  }

	  //boolean provjera da li je prazan niz
	  public boolean empty() {
	    return size == 0;
	  }

	  //provjera koliko je velicina niza
	  public int getSize() {
	    return size;
	  }
	}