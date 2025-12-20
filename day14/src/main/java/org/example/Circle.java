package org.example;

public class Circle extends Shape{

    private double radius = 1.0;

    public Circle ( ){         }

    public Circle (double radius){
        this.radius = radius;
    }

    public Circle (   double radius,
                      String color,
                      boolean filled
    ){
        super(
                  color,
                  filled
        );
        this.radius = radius;
    }

    //setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //getter
    public double getRadius() {
        return radius;
    }

    //methods
    public double getArea(){
        return ( (Math.PI) * (Math.pow(radius,2)) );
    }

    public double getPerimeter(){
        return  ( 2 * (Math.PI) * (radius) ) ;
    }

    public String toString(){
        return "\nA Circle with radius = " + radius +
                ",\n area = " + getArea() +
                ",\n perimeter = " + getPerimeter() +
                ",\n which is a subclass of Shape here is it output : \n---\n" + super.toString();
    }

}
