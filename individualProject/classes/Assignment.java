/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

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
    
      
 

    @Override
    public String toString() {
        return "Assignment{" + "title = " + title + ", duscription = " + duscription + ", subDateTime = " + subDateTime + ", oralMark = " + oralMark + ", totalMark = " + totalMark + '}';
    }
    
    
    
}
