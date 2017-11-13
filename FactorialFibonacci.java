/* Java program calculating factorial and fibonacci of an integer n 
 */
package factorialfibonacci;

import java.util.Scanner;

/**
 *
 * @author Xaris
 */
public class FactorialFibonacci {

    
    private static int Factorial(int n){
        if (n==1)
            return 1;
        
        return n * Factorial(n-1);
    }   
    
    private static int Fibonacci(int n){
        if (n==0) 
            return 0;
        else if (n==1)
            return 1;
        
        return (Fibonacci(n-1)+Fibonacci(n-2));
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Give me an integer");
        n = scanner.nextInt();
        System.out.println("The factorial of number "+n+" is: "+Factorial(n));
        System.out.println("Fibonacci of number "+n+" is: "+Fibonacci(n));
    }
    
}
