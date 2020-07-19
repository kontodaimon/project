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
public class Triangle extends Shape {
   public int base;
   public int side2;
   public int side3;
   public int height;

  
    public Triangle(int base, int side2, int side3, int height, String color, Size size) {
        super(color, size);
        this.base = base;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public int getPerimeter(){
        int x = base+ side2+ side3;
        return x;
    }
      public int  getArea(){
        int x =( base * height) /2;
        return x;
    }
    
     public void printShape(){
        System.out.println("Printing a SIZE " +getColor()+ " $COLOR " +getSize()+ " Triangle." );
    }

    @Override
    public String toString() {
        return "Triangle{" + "base=" + base + ", side2=" + side2 + ", side3=" + side3 + ", height=" + height + '}';
    }
   
   
   
   
   
   
}
