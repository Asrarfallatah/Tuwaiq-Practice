package org.example;

public class Rectangle extends Shape{

    private double height ;
    private double width ;

    public Rectangle(){}

    public Rectangle(
//            int x,
//            int y,
            double height,
            double width
    ){
//        super( x,
//                y);
        this.height = height;
        this.width = width;
    }

    //setter
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    //getter
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return ((Math.round(( width * height) ) * 100.00  / 100.00)) ;
    }

    @Override
    public double calculateCircumference() { // it is actully the Perimeter
        return ((Math.round(( 2 * (width + height)))  * 100.00 ) / 100.00);
    }
}
