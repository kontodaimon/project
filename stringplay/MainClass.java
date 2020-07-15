/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringplay;

import java.util.Locale;

/**
 *
 * @author demon
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      //    4. concat()
      String x = " Jack ";
      String u = "Hello" ;
//        System.out.println(ask4(u,x));
        //    5. toLowerCase(), toUpperCase()
//          System.out.println(ask5(u,x));    
       //    6. trim()
//        System.out.println(x);
//        System.out.println(ask6(x));
///7. split(), contains()
    String y = "Computer, Laptop, Tablet"; // ******den ta katafera
       
//    8. replace()
 // System.out.println(ask8(y));
 
//    9. substring()
String k = "URL=http://peoplecert.com";
        System.out.println(ask9(k));
    }
//    9. substring()
//    Create a method that accepts a url and returns only the domain name.
//    For example: URL=http://peoplecert.com. The returned name will be "peoplecert.com"
    public static String ask9 (String v ){
        v = v.substring(11);
        return v ;
    }
    
    
//    8. replace()
//    Use replace to check for ", " in the previous exercise and replace it with "-"
      public static String ask8(String x){
         x = x.replace(", ", "-");
         return x ;
      }
      
    
//7. split(), contains()
//    Create a method that accepts a string. Use String "Computer, Laptop, Tablet". If String contains "," split it and return it. Then create a method that accepts the array and prints it.
    public static String[] ask7(String x){
        String[] d ;
        d = x.split(",");
        return d;
    }
    
//    6. trim()
//    Create a method that accepts a string and trims it. Use it with input text.
    public static String ask6(String name){
        String x = name.trim();
        return x ;
        
    }
//    5. toLowerCase(), toUpperCase()
//    Update the previous method so that it prints the concatenation in Uppercase
    public static String ask5(String nameA, String nameB){
        String name = nameA.concat(nameB);
        name = name.toUpperCase();
        return name ;
    }
    
//    4. concat()
//    Create a method that accepts two names and returns their concatenation
    public static String ask4(String nameA, String nameB){
       String name = nameA.concat(nameB);
        return name ;
    }
}
