package numbers;

import java.util.*;

/**
 *
 * @author Xaris
 */
public class Numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        //Concatenates 2 values, 1 string and 1 integer and then it prints them
       
        
        String s,i;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a string: ");
        s = scanner.next();
        System.out.println("Give me an integer: ");
        i = scanner.next();
        System.out.println(s+i);
        
      
      //Input 3 numbers, the second must be at least triple than the first and the third must be bigger than the sum of the remaining two.
      
        while (!done){
            System.out.println("Give me the first integer: ");
            x = scanner.nextInt();
            System.out.println("Give me the second integer: ");
            y = scanner.nextInt();
            System.out.println("Give me the third integer: "); 
            z = scanner.nextInt();
            
            if ((y>=3*x) && (z>x+y)){
                done = true;
                System.out.println("Numbers meet the requirements!");
            } else 
                System.out.println("Numbers don't meet the requirements!\nStart again:");
        }
        
       
              
    }
    
}
    