package Zadaci_05_09_2016;
import java.util.Scanner;

public class TestComplex {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Unesite prve kompleksne brojeve: ");
		Complex complex1 = new Complex (in.nextDouble(), in.nextDouble());
		
		System.out.println("Unesite druge kompleksne brojeve:");
		Complex complex2= new Complex (in.nextDouble(),in.nextDouble());
		
		System.out.print( "("+ complex1.toString() + ") + (" + complex2.toString()+ ") = ");
		System.out.print(complex1.add(complex2).toString() + "\n");
		
		System.out.print( "("+ complex1.toString() + ") - (" + complex2.toString()+ ") = ");
		System.out.print(complex1.subtract(complex2).toString()+"\n");
		
		System.out.print( "("+ complex1.toString() + ") * (" + complex2.toString()+ ") = ");
		System.out.print(complex1.multiply(complex2).toString()+ "\n");
		
		System.out.print( "("+ complex1.toString() + ") / (" + complex2.toString()+ ") = ");
		System.out.print(complex1.divide(complex2).toString()+"\n");
		
		System.out.print( "| ("+ complex1.toString() + ") | = ");
		System.out.println(complex1.abs());
		
		in.close();
		
	}
}
