package org.example;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(){}

    public Rectangle(
            double width,
            double length
    ){
        this.length = length;
        this.width = width;
    }

    public Rectangle(
            double width,
            double length,
            String color,
            boolean filled
    ){
        super(  color,
                filled);
        this.width = width;
        this.length = length;
    }

    //setter
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    //getter
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    //methods
    public double getArea(){
        return (length * width);
    }
    public double getPerimeter(){
        return (2 * (length + width));
    }
    public String toString(){
        return "\nA Rectangle with width = " + width +
                "\n and length = " + length +
                ",\n area = " + getArea() +
                ",\n perimeter = " + getPerimeter() +
                ",\n which is a subclass of Shape here is it output : \n---\n"+super.toString();
    }
}
