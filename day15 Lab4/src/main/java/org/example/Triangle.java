package org.example;

public  class Triangle extends  Shape{

    private double height ;
    private double base;

    public Triangle(){}

    public Triangle(
//            int x,
//            int y,
            double height,
            double base
    ){
//        super( x,
//                y);
        this.height = height;
        this.base = base;
    }

    //setter
    public void setBase(double base) {
        this.base = base;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    //getter
    public double getBase() {
        return base;
    }
    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return (Math.round(((base * height) / 2) * 100.00) / 100.00) ;
    }

    @Override
    public double calculateCircumference() { // it is actully the Perimeter of equilateral triangle

        return  (Math.round((3 * (Math.sqrt(Math.pow(height, 2) + Math.pow((base / 2), 2)))) * 100.00) / 100.00);
    }


}
