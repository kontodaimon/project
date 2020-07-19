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
public class Circle extends Shape {
    public int radius;

    public Circle(int radius, String color, Size size) {
        super(color, size);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
   
    public int getPerimeter(){
        int x = 2* 4* radius;
        return x;
    }
      public int  getArea(){
        int x = (int)(2* 4 * Math.sqrt(radius)) ;
        return x;
    }

    public void printShape(){
        System.out.println("Printing a SIZE " +getColor()+ " $COLOR " +getSize()+ " Circle." );
    }
    
    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }

    
    
    
    
  
}
