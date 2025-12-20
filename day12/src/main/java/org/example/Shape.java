package org.example;

public class Shape {
    private String color;
    private boolean filled;

    public Shape(){}

    public Shape(
            String color,
            boolean filled
    ){
       this.color = color;
       this.filled = filled;
    }

    // setter
    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    // getter
    public String getColor() {
        return color;
    }
    public boolean isFilled() {
        return filled;
    }

    //method
    public String toString() {
        return "\nA Shape with color of " + color +
                "\n and it is " + filled ;
    }

}
