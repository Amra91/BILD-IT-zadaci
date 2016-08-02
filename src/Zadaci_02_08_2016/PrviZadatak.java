package Zadaci_02_08_2016;

import java.util.ArrayList;

/*
 * Napisati program koji ispisuje sve prestupne godine, 10 po liniji, 
 * od godine 101 do 2100, odvojene jednim spaceom. 
 * Takoðer ispisati i ukupan broj prestupnih godina u ovom vremenskom periodu.
 */
public class PrviZadatak {
	
	public static void main(String[] args) {
		// ArrayLista za sve prestupne godine od 101 do 2100 godine
		ArrayList <Integer> listaGodina = new ArrayList<>(); 
		
		for (int i=101; i<2100; i++){
	
			if ((i%4==0 && i% 100 !=0)||(i%400 ==0)){
				//dodavanje prestupne godine u ArrayListu
				listaGodina.add(i);
				}
			}
	
		for (int i =0, j=1; i<listaGodina.size(); i++,j++ ){
			//printanje svake godine
			System.out.print(listaGodina.get(i) + " ");
			
			//printanje u novom redu nakon 10te godine
			if (j%10==0  ){
				System.out.println();
			}
		
		}
		
	}
}
