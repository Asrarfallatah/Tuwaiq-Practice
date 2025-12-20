package org.example;

public class Square extends Rectangle {

    public Square(){}

    public Square(double side){
            super(  side,
                    side);
    }

    public Square(double side,
                  String color,
                  boolean filled
    ){
        super(   side,
                 side,
                 color,
                 filled );
    }

    //seter
    public void setSide(double side){
            setLength(side);
            setWidth(side);
    }

    //getter
    public double getSide(){
        return getLength();
    }

    public String toString(){
        return "\nA Square with side = " + getSide() +
                ",\n area = " + getArea() +
                ",\n perimeter = " + getPerimeter() +
                ",\n which is a subclass of  Rectangle Class here is it output : \n---\n"+super.toString();
    }

}
