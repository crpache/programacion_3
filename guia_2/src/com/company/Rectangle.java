package com.company;

public class Rectangle {
    private float width;
    private float height;

    public Rectangle(float width, float height){
        this.width = width;
        this.height = height;
    }

    public float getWidth(){
        return width;
    }

    public float getHeight(){
        return height;
    }

    public void setWidth(float width){
        this.width = width;
    }

    public void setHeight(float height){
        this.height = height;
    }

    public float calcPerimeter(){
        return this.width * 2 + this.height * 2;
    }

    public float calcArea(){
        return  this.width * this.height;
    }
}
