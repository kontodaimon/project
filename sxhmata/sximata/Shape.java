/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypacage.sximata;

import mypacage.Size;

/**
 *
 * @author demon
 */
public class Shape {
    private String color;
    private Size size;

    public Shape(String color, Size size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
    
    public void printShape(){
        System.out.println("Printing a SIZE " + size+ " $COLOR " +color+ " $SHAPE." );
    }
    
    public int getPerimeter(){
       int x = 0 ;
       return x; 
    }
    
    public int  getArea(){
        int x = 0 ;
        return x;
    }

    @Override
    public String toString() {
        return "Shape{" + "color=" + color + ", size=" + size + '}';
    }
 
    
    
    
}
