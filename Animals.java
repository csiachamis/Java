/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author Xaris
 */
public class Animals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      /*    Simple java code which prints all animals of an array baginning with "p"  
        using 3 different ways 
        */
        String[] animals = {"cat","dog","pig","bear","bird","parrot","rabbit"};
        //1st way
        for (String an : animals){
            if (an.startsWith("p"))
                System.out.println(an);
        }
        //2nd way
        for (String an : animals){
            if (an.charAt(0) == 'p')
                System.out.println(an);
        }
        //3rd way
        for (String an : animals) {
            if (an.indexOf(112) == 0) {
                System.out.println(an);
            }
        }
      
     
    }
    
}
