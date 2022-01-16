package com.company;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {

    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void setxSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }

    public float getxSpeed(){
        return this.xSpeed;
    }

    public void setySpeed(float ySpeed){
        this.ySpeed = ySpeed;
    }

    public float getySpeed(){
        return this.ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        return new float[]{getxSpeed(), getySpeed()};
    }

    public String toString(){
        return String.format("Point(%.2f, %.2f), speed: (%.2f, %.2f)",getX(),getY(),getxSpeed(),getySpeed());
    }

    public MovablePoint move(){
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
}
