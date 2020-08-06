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
public class Course {
    private String title ;
    private String stream ; // java or c#
    private String type ; // part or full
    private LocalDate startDate ;
    private LocalDate endDate ;
    
    // ******* constractors ******
    


    public Course(String title, String stream, String type, LocalDate startDate, LocalDate endDate) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    
    
    //******* get - set ******
    
    //****** title ****
    
    public String getTitle(){
        return(this.title );
    }
    
    public void setTitle(String title){
        this.title = title ;
    }
    
    //***** stream *****
    public String getStream() {
        return (this.stream);
    }
    
    public void setStream(String stream){
        this.stream = stream ;
    }
    
    //***** type *******
    
    public String getType(){
        return (this.type); 
    }
    
    public void setTupe(String type){
        this.type = type ;
    }
    
    //****** start date ***
     
    public LocalDate getStartDate (){
        return (this.startDate) ;
    }
    
    public void setStartDte(LocalDate startDate){
        this.startDate = startDate ;
    }
    
    //****** end date ****
    
    public LocalDate getEndDate(){
        return (this.endDate);
    }
    
    public void setEndDate(LocalDate endDate){
        this.endDate = endDate ;
    }
    
    
    //********* other methods******
    
    
 

    @Override
    public String toString() {
        return "Course{" + "title=" + title + ", stream=" + stream + ", type=" + type + ", startDate=" + startDate + ", endDate=" +endDate + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
 