/*
 * A java project finding the last character in a StringBuilder 
 */
package strings;



/**
 *
 * @author Xaris
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuilder buffer4 = new StringBuilder("hellohghhg");
        int j = findLastChar(buffer4, 'e');
        System.out.println(j);
    }
    
    public static int findLastChar(StringBuilder sb, char c){
        boolean b = false;
        int i = sb.toString().length()-1;
        do{
            if (sb.charAt(i) == c)
                b=true;
            else 
                i--;
        }while(b);
        
        return i;
    }
    
}
