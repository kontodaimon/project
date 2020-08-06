/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author demon
 */
public class Trainer {
    private String firstName ;
    private String lastName ;
    private String subject ;
    
    //******* constractors ******
    
    public Trainer(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
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
    
    //****** other method *****

    @Override
    public String toString() {
        return "Trainer{" + "firstName=" + firstName + ", lastName=" + lastName + ", subject=" + subject + '}';
    }
    
    
}
