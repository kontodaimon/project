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
public class Square extends Shape {
    public int side ;

    public Square(int side, String color, Size size) {
        super(color, size);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    
    public int getPerimeter(){
        int x = 4 * side;
        return x;
    }
      public int  getArea(){
        int x = side * side ;
        return x;
    }
 public void printShape(){
        System.out.println("Printing a SIZE " +getColor()+ " $COLOR " +getSize()+ " Square." );
    }
 
 
    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }

   
    

  
    
}
