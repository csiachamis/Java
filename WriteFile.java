/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.time.Year;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Spyros
 */
public class WriteFile {

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
        
        // Print whats gathered to a file
        System.out.println("printing........");
        String fileName = lastName + "." + name + ".txt";
        String yearOfBirth;
        yearOfBirth = (String) dateOfBirth.subSequence(6, 10);
        int age = Year.now().getValue() - Integer.parseInt(yearOfBirth);
        
            try {
                PrintWriter writer = new PrintWriter(fileName, "UTF-8");
                for (int i = 0; i <3; i++){
                    switch (i) {
                        case 0:
                            writer.println("Line " + (i+1)+": " + lastName + ", " + name + ", " + fathersName);
                            break;
                        case 1:
                            writer.println("Line " + (i+1)+": " + dateOfBirth);
                            break;
                        case 2:
                            writer.println("Line " + (i+1)+": " + age);
                            break;
                        default:
                            break;
                    }
                }   
                writer.close();
                System.out.println("file is ready");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            
    }

}