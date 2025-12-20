package org.example;

public class Circle extends Shape{

    private double radius;

    public Circle(){}

    public Circle(
//            int x,
//            int y,
            double radius
    ){
//        super( x,
//               y);
         this.radius=radius;
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
    @Override
    public double calculateArea() {
        return (Math.round(( Math.PI * Math.pow(radius,2) ) * 100.00 ) / 100.00 );
    }

    @Override
    public double calculateCircumference() {
        return (Math.round((2 * Math.PI * radius) * 100.00 ) / 100.00 );
    }

}
