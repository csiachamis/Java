/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application3;

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
    
    
    public int returnAge(String dateOfBirth){
        String yearOfBirth;
        yearOfBirth = (String) dateOfBirth.subSequence(6, 10);
        int age = Year.now().getValue() - Integer.parseInt(yearOfBirth);
        return age;
    }
    
}

