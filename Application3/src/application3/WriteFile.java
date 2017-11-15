package application3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
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
    private BufferedReader br = null;
    
    public WriteFile(String string, int line){
        this.string = string;
        this.line = line;
    }
    
     public WriteFile(){
         try {
            writer = new PrintWriter("C:\\temp\\temp1\\file.txt","UTF-8");
        } catch (FileNotFoundException | UnsupportedEncodingException ex) {
            Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
        }
         try {
            br = new BufferedReader(new FileReader("C:\\temp\\temp1\\file.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Application3.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    
    public void setLine(int l){
        this.line = l;
    }
    
    public void writeString(){
        writer.println(this.string);
        if(this.line == 2) 
            writer.close();
    }
    
    public String readString() throws IOException{
        String line = br.readLine();
        return line;
    }
    
    
}
