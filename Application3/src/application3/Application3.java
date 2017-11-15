/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Xaris
 */
public class Application3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your last name?");
        String lastName = scanner.nextLine();
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Whats your father's name?");
        String fathersName = scanner.nextLine();
        System.out.println("Whats your date of birth (DD/MM/YYYY);");
        String dateOfBirth = scanner.next();
        scanner.close();
        
        Person person = new Person(lastName,name,fathersName,dateOfBirth);
        
        String path1 = "C:\\temp";
        String path2 = "\\temp1";
        String file = "file.txt";
        
       
        File f = new File(path1+path2);
        boolean check = f.isDirectory();
        if (check)
            System.out.println("exists");
        else{
            System.out.println("not exists");
            if (f.mkdirs())
                System.out.println("created");
        }
        WriteFile writefile = new WriteFile();
        
        
        for (int i = 0; i <3; i++){
                    switch (i) {
                        case 0:
                            writefile.setString(person.getString(0) + "," + person.getString(1) + "," + person.getString(2)); 
                            writefile.setLine(i);
                            writefile.writeString();
                            break;
                        case 1:
                            writefile.setString(person.getString(3));
                            writefile.setLine(i);
                            writefile.writeString();
                            break;
                        case 2:
                            writefile.setString("" + person.returnAge(person.getString(3)));
                            writefile.setLine(i);
                            writefile.writeString();
                            break;
                        default:
                            break;
                    }
                }   
        
        String lines[];
        String line1, line2, line3;
        
        line1 = writefile.readString();
        line2 = writefile.readString();
        line3 = writefile.readString();
        
        lines = line1.split(",", 3);
        Person newPerson = new Person(lines[0],lines[1],lines[2],line2);
        System.out.println("\n\nNewPerson's data: \n"+newPerson.getString(0)+"\n"+newPerson.getString(1)+"\n"+newPerson.getString(2)+"\n"+newPerson.getString(3));
    }
    
}
