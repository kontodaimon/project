/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.text.SimpleDateFormat;
import java.time.LocalDate;


/**
 *
 * @author demon
 */
public class Assignment {
     private String title ; //assignments or projects
     private String duscription ; //individual or team
     private LocalDate subDateTime ;
     private int  oralMark ; 
     private int totalMark ; 
    
//     During the bootcamp the students need to submit five (5) assignments 
//     and two (2) projects, one individual and one team project.
     
      //****constractors ***
    
//    private Assignment(){
//        
//    }
//
//    public Assignment(String title, String duscription) {
//        this.title = title;
//        this.duscription = duscription;
//    }

    public Assignment(String title, String duscription, LocalDate subDateTime) {
        this.title = title;
        this.duscription = duscription;
        this.subDateTime = subDateTime;
    }
    
    
    
//******* get - set ******
    
   
    //****** title ****
    
    public String getTitle(){
        return(this.title );
    }
    
    public void setTitle(String title){
        this.title = title ;
    }
    
    //***** duscription ****
    
    public void setDuscription(String duscription){
        this.duscription = duscription ;
    }
    
    public String getDuscription(){
        return (this.duscription);
    }
     //****** subDateTime ***
     
    public LocalDate getSubDateTime (){
        return (this.subDateTime) ;
    }
    
    public void setSsubDateTime(LocalDate subDateTime){
        this.subDateTime = subDateTime ;
    }
     //****** oral Mark***
     
    public int  getOralMark (){
        return (this.oralMark) ;
    }
    
    public void setOralMark(int  oralMark){
        this.oralMark = oralMark ;
    }
     //****** oral Mark***
     
    public int  geTtotalMark (){
        return (this.totalMark) ;
    }
    
    public void setTotalMark(int  totalMark){
        this.totalMark = totalMark ;
    }
    
      
    
    //****** other method *****    
    //*** format of date
//    public  String format(LocalDate date){
//        SimpleDateFormat ft = new SimpleDateFormat (" dd/MM/yyyy ");
//        String x = ft.format(date);
//        return x ;
//    }

    @Override
    public String toString() {
        return "Assignment{" + "title = " + title + ", duscription = " + duscription + ", subDateTime = " + subDateTime + ", oralMark = " + oralMark + ", totalMark = " + totalMark + '}';
    }
    
    
    
}
