/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application2;

import java.util.Scanner;

/**
 *
 * @author Xaris
 */
public class Application2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your last name?");
        String lastName = scanner.nextLine();
        System.out.println("Hello " + lastName);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Whats your father's name?");
        String fathersName = scanner.nextLine();
        System.out.println("Whats your date of birth (DD/MM/YYYY);");
        String dateOfBirth = scanner.next();
        scanner.close();
        
        Person person = new Person(lastName,name,fathersName,dateOfBirth);
        WriteFile writefile = new WriteFile();
        writefile.createFile(person.getString(0), person.getString(1));
        
        for (int i = 0; i <3; i++){
                    switch (i) {
                        case 0:
                            //person.writeString(i, "Line " + (i+1)+": " + person.getString(0) + ", " + person.getString(1) + ", " + person.getString(2));
                            //writefile = new WriteFile("Line " + (i+1)+": " + person.getString(0) + ", " + person.getString(1) + ", " + person.getString(2),i);
                            writefile.setString("Line " + (i+1)+": " + person.getString(0) + ", " + person.getString(1) + ", " + person.getString(2)); 
                            writefile.setLine(i);
                            writefile.writeString();
                            break;
                        case 1:
                            //person.writeString(i, "Line " + (i+1)+": " + person.getString(3));
                            //writefile = new WriteFile("Line " + (i+1)+": " + person.getString(3),i);
                            writefile.setString("Line " + (i+1)+": " + person.getString(3));
                            writefile.setLine(i);
                            writefile.writeString();
                            break;
                        case 2:
                            //person.writeString(i, "Line " + (i+1)+": " + person.returnAge(person.getString(3)));
                            //writefile = new WriteFile("Line " + (i+1)+": " + person.returnAge(person.getString(3)),i);
                            writefile.setString("Line " + (i+1)+": " + person.returnAge(person.getString(3)));
                            writefile.setLine(i);
                            writefile.writeString();
                            break;
                        default:
                            break;
                    }
                }   
        
    }
    
}
