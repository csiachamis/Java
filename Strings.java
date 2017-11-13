/*
 * A java project finding the last character in a StringBuilder 
 */
package strings;



/**
 *
 * @author Xaris
 */
public class Strings {

    public static int findLastChar(StringBuilder sb, char c){
        boolean b = false;
        int i = sb.toString().length()-1;
        do{
            if (sb.charAt(i) != c) 
                i--;
            else 
                b=true;
            if (i==-1)
                break;
        }while(!b);
        
        return i;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuilder buffer4 = new StringBuilder("hell10lo");
        int j = findLastChar(buffer4, 'l');
        if (j==-1)
            System.out.println("Character not found!");
        else
            System.out.println(j);
    }
    
}
