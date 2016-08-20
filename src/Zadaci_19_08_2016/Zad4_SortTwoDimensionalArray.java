package Zadaci_19_08_2016;

/*
 * (Sort two-dimensional array) Write a method to sort a two-dimensional array using the following header:
public static void sort(int m[][])
  The method performs a primary sort on rows and a secondary sort on columns. For example, the following array 
{{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}
will be sorted to 
{{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}. 
 */
public class Zad4_SortTwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] array2d =  {{4, 2},			
							{1, 7},			
							{4, 5},
							{1, 2},
							{1, 1},
							{4, 1}};
		sort(array2d);
		print(array2d);
	}
	
	//metoda za sortiranje primarno redova, sekundarno kolona
	public static void sort(int[][] m){

		int[]temp = new int[1]; 	//niz koji sluzi kao zamjena
	
		// prvo ide sortiranje redova
		for (int i = 0; i < m.length-1; i++) {
			
			for (int j = 0; j < m.length-i-1; j++) {
				
				//if ukoliko je suma j veca od sume susjednog reda
				//tada se izvrsi zamjena
				if (sum(m[j]) > sum(m[j + 1])) {
					
					temp = m[j];
					m[j] = m[j + 1];
					m[j + 1] = temp;
					
				}
			}
		}
		
		//sekundarno je sortiranje kolona
		for (int i = 0; i < m.length-1; i++) {
			
			for (int j = 0; j < m.length-i-1; j++) {
				
				//if ukoliko je suma j veca od sume susjedne kolone
				//tada se izvrsi zamjena
				if (m[j][0] > m[j + 1][0]) {
					
					temp = m[j];
					m[j] = m[j + 1];
					m[j + 1] = temp;
					
				}
			}
		}

	}
	
	// vraca se suma niza 
	public static int sum(int[] m) {
		int sum = 0;
		for (int i : m) {
			sum += i;
		}
		
		return sum;
	}

	public static void print(int[][] m){
		//printanje matrice
		for(int i=0; i<m.length;i++){
			for(int j=0; j<m[0].length;j++){
				System.out.print(m[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
}