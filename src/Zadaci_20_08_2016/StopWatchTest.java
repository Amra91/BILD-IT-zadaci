package Zadaci_20_08_2016;

public class StopWatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//kreiranje objekta vrijeme
		StopWatch vrijeme = new StopWatch();
		
		//kreiranje niza od 100000 random elemenata od 0 do 20
		int[] niz = new int [100000];
		for (int i=0; i<niz.length;i++){
			niz[i] = (int)(Math.random()*20);
		}
		
		//pozivanje metode za pocetak
		vrijeme.start();
	 
		//sortiranje niza
		for (int i=0; i<niz.length;i++){
			
			for (int j=i; j<niz.length;j++){
				
				if (niz[i]>niz[j]){
					int temp=niz[j];
					niz[j]=niz[i];
					niz[i]=temp;
					}
				}
			} 
	
		//pozivanje metode za stopiranje
		vrijeme.stop();
		
		System.out.println("Vrijeme potrebno za racunanje je " + vrijeme.getElapsedTime());
	}
}
