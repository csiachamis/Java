/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Xaris
 */
public class Person {
    private String lastName;
    private String firstName;
    private String fathersName;
    private String dateOfBirth;
    
    
    public Person(String lastName, String firstName, String fathersName, String dateOfBirth){
        this.lastName = lastName;
        this.firstName = firstName;
        this.fathersName = fathersName;
        this.dateOfBirth = dateOfBirth;
    }
    
    
    public String getLastName(){
        return lastName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getFathersName(){
        return fathersName;
    }
    
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setFathersName(String fathersName){
        this.fathersName = fathersName;
    }
    
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    
    public void writeString(String s){
        try {
            PrintWriter writer = new PrintWriter("filename.txt", "UTF-8");
            writer.println(s);
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
