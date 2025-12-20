package org.example;

public class MoveablePoint implements Moveable{

    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MoveablePoint(){}

    public MoveablePoint(
             int x,
             int y,
             int xSpeed,
             int ySpeed
    ){
        this.x= x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    //setter
    public void setX(int x) {
        this.x = x;
    }
    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    //getter
    public int getX() {
        return x;
    }
    public int getxSpeed() {
        return xSpeed;
    }
    public int getY() {
        return y;
    }
    public int getySpeed() {
        return ySpeed;
    }

    @Override
    public void moveUp(){
        y += ySpeed;
    }
    public void moveDown(){
        y -= ySpeed;
    }
    public void moveLeft(){
        x -= xSpeed;
    }
    public void moveRight(){
        x += xSpeed;
    }
}
