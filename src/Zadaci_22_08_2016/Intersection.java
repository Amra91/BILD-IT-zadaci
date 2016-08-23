package Zadaci_22_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Intersection{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Unosimo endpoint za dvije linije
		System.out.println("Enter first end point[x1,y1]");
		double x1 = checkInput();
		double y1 = checkInput();
		System.out.println("Enter first end point[x2,y2]");
		double x2 = checkInput();
		double y2 = checkInput();
		System.out.println("Enter first end point[x3,y3]");
		double x3 = checkInput();
		double y3 = checkInput();
		System.out.println("Enter first end point[x4,y4]");
		double x4 = checkInput();
		double y4 = checkInput();
		
		  
		  double a = y1 - y2;
		  double b = -(x1 - x2);
		  double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		  double c = (y3 - y4);
		  double d = -(x3 - x4);
		  double f = (y3 - y4) * x3 - (x3 - x4) * y3;
		  
		  //Kreiramo i incijaliziramo intersection objekat
		  LinearEquations intersection = new LinearEquations(a, b, c, d, e, f);
		  
		  if(intersection.isSolvable()==false){
				System.out.println(("Two lines are parallel."));
			}
			else{
				//Koristimo metode getX i getY za proracun preklapanja 
				  System.out.println(("Intersection point is: "+"\nX: "+intersection.getX()+"\nY: "+intersection.getY()));
			}
	}
	
	//Metod za provjeru unosa
	public static double checkInput(){
		boolean status = false;
		double num = 0;
		do{
			try{
				num = in.nextDouble();
				status = true;
			}catch(InputMismatchException ex){
				System.out.println("Nepravilan unos.\nUnesite ponovo.");
				in.nextLine();
			}
		}while(status != true);
		return num;
	}
}
