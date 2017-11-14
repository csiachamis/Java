package application2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xaris
 */
public class WriteFile {
    private String string;
    private int line;
    private static PrintWriter writer = null;
    
    public WriteFile(String string, int line){
        this.string = string;
        this.line = line;
    }
    
     public WriteFile(){
     }
    
    public String getString(){
        return this.string;
    }
    
    public int getLine(){
        return this.line;
    }
    
    public void setString(String s){
        this.string = s;
    }
    
    public void setString(int l){
        this.line = l;
    }
    
    public void createFile(String s1, String s2){
        try {
            writer = new PrintWriter(s1 + "." + s2 + ".txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void writeString(){
        writer.println(this.string);
        if(this.line == 2) 
            writer.close();
    }
}
