package Zadaci_02_09_2016;
/*
 *  (The Colorable interface) 
 *  Design an interface named Colorable with a void method named howToColor(). 
 *  Every class of a colorable object must implement the Colorable interface. 
 *  Design a class named Square that extends GeometricObject and implements Colorable. 
 *  Implement howToColor to display the message Color all four sides.  
 *  Draw a UML diagram that involves Colorable, Square, and GeometricObject. 
 *  Write a test program that creates an array of five GeometricObjects. 
 *  For each object in the array, display its area and invoke its howToColor method if it is colorable. 
 */
class Square extends GeometricObject implements Colorable {
	
	//data fields
    private double x;
    private double y;
    private double side;

    //no args konstruktor
    Square() {
        this(0,0,10);
    }
    //konstruktor
    Square(double x, double y, double side) {
        this.x = x;
        this.y = y;
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }
    // metoda iz interface
    @Override
    public String howToColor() {
        return "Color all four sides.";
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getSide() {
        return side;  
    }
    public void setSide(double side) {
        this.side = side;
    }
	
    
}
//interface
interface Colorable {

    String howToColor();
}
