/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application2;

import java.time.Year;

/**
 *
 * @author Xaris
 */
public class Person {
    private String lastName;
    private String firstName;
    private String fathersName;
    private String dateOfBirth;
   // private static PrintWriter writer = null;
    
    
    public Person(String lastName, String firstName, String fathersName, String dateOfBirth){
        this.lastName = lastName;
        this.firstName = firstName;
        this.fathersName = fathersName;
        this.dateOfBirth = dateOfBirth;
    }
    
    public String getString(int x){
        switch (x) {
            case 0:
                return this.lastName;  
            case 1:
                return this.firstName;
            case 2:
                return this.fathersName;
            case 3:
                return this.dateOfBirth;
            default:
                break;
        }
        return null;
    }
    /*
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
    */
    public void setString(int x, String s){
        switch (x) {
            case 0:
                this.lastName = s;
                break;
            case 1:
                this.firstName = s;
                break;
            case 2:
                this.fathersName = s;
                break;
            case 3:
                this.dateOfBirth = s;
                break;
            default:
                break;
        }
    }
    /*
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
    
    public void writeString(int i, String s){
        
        if(i == 0) {
            try {
                writer = new PrintWriter(this.lastName + "." + this.firstName + ".txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        writer.println("Line " + i + ": " + s);
        if(i == 2) 
            writer.close();
    }
    */
    
    public int returnAge(String dateOfBirth){
        String yearOfBirth;
        yearOfBirth = (String) dateOfBirth.subSequence(6, 10);
        int age = Year.now().getValue() - Integer.parseInt(yearOfBirth);
        return age;
    }
    
}
