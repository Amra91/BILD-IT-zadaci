package Zadaci_06_09_2016;

/*
 * Write a recursive method to compute the following series:
 * m(i) = 1/3 + 2/5 +3/7 +... +  i/ (2*i+1)
 * m(i) for i = 1, 2, . . ., 10
 */
public class Zadatak_18_5_SumSeries {

	public static void main(String[] args) {

		// for petlja za brojeve od 1,2,..10
        for (int i = 1; i <= 10; i++) {
           
        	System.out.println(m(i));
        }

    }

    public static double m(int i) {
     
    	//uslov zaustavljanja rekurzije, osnovni slucaj
        if (i == 1){
        	
            return 1/3.0;
        }
        else{
        	// i/(2*i+1) + rekurzivni poziv
            return i / (2* i+ 1.0) + m(i-1);
        }
    }
}

