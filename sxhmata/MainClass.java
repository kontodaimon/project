/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypacage;

import java.util.ArrayList;
import java.util.List;
import mypacage.sximata.Circle;
import mypacage.sximata.Shape;
import mypacage.sximata.Square;
import mypacage.sximata.Triangle;

/**
 *
 * @author demon
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Shape> sh = new ArrayList();
        Circle k = new Circle(2, "red", Size.SMALL);
        Triangle t = new Triangle(100, 2, 2, 2, "red", Size.MEDIUM);
        Square s = new Square(15, "red", Size.LARGE);
        sh.add(k);
        sh.add(t);
        sh.add(s);

        int max = 0;
        int max2 = sh.get(0).getArea();
        int i = 0;
        int i2 = 0;
        for (Shape jj : sh) {
            jj.printShape();

        }
        for (int y = 0; y < sh.size(); y++) {
            if (max < sh.get(y).getPerimeter()) {
                max = sh.get(y).getPerimeter();
                i = y;
            }
        }
        for (int y = 0; y < sh.size(); y++) {
            if (max < sh.get(y).getArea()) {
                max2 = sh.get(y).getArea();
                i2 = y;
            }
        }

        System.out.println(sh.get(i) + "max perimeter " + max);
        System.out.println(sh.get(i2) + "max area " + max2);

        Square s2 = new Square(5, "red", Size.LARGE);
        Square s3 = new Square(20, "red", Size.LARGE);
        sh.add(s2);
        sh.add(s3);
        
        int p=0 ;
         int max3 = 0 ;
        for (Shape jj : sh) {
            
            if (jj instanceof Square) {
                if (max3 < jj.getPerimeter()) {
                    max3 = jj.getPerimeter();
                    i = p ;
                }
                    
            }
            p ++;
        }
        System.out.println(sh.get(i) + "max perimeter " + max3);
    }
}
