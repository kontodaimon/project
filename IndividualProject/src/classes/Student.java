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
public class Student {
     private String firstName ;
     private String lastName ;
     private LocalDate dateOfBirth ;
     private int tuitionFees ; 
 
    //****constractors ***
    
//    public Student(){
//        
//    }
//
//    public Student(String firstName, String lastName, Date dateOfBirth) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.dateOfBirth = dateOfBirth;
//    }

    public Student(String firstName, String lastName, LocalDate dateOfBirth, int tuitionFees) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.tuitionFees = tuitionFees;
    }
    
    
    
//******* get - set ******
    
    //***** first name ****
    
    public void setFirstName(String firstName){
        this.firstName = firstName ;
    }
    
    public String getFirstName(){
        return (this.firstName);
    }
    
    //*****last name ****
    
    public void setLastName(String lastName){
        this.lastName = lastName ;
    }
    
    public String getLastName(){
        return (this.lastName);
    }
     //****** dateOfBirth ***
     
    public LocalDate getDateOfBirth (){
        return (this.dateOfBirth) ;
    }
    
    public void setDateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth ;
    }
     //****** tuitionFees***
     
    public int getTuitionFees (){
        return (this.tuitionFees) ;
    }
    
    public void setTuitionFees(int tuitionFees){
        this.tuitionFees = tuitionFees ;
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
        return "Student{" + "firstName = " + firstName + ", lastName = " + lastName + ", dateOfBirth = " + dateOfBirth + ", tuitionFees = " + tuitionFees + '}';
    }
    
    @Override
    public boolean equals(Object o){
        if (o instanceof Student){
            Student s = (Student) o;
            return this.lastName.equalsIgnoreCase(s.getLastName()) && this.firstName.equalsIgnoreCase(s.getFirstName());
        }
        else 
            return false;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
