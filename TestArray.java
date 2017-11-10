/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarray;

/**
 *
 * @author Xaris
 */
public class TestArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = new int[10];
        int i,j,k;
        int[][][] counts = new int[3][3][3];
        int sumi=0,sumj=0,sumk=0;
       /* 
        for (i = 0; i<5; i++)
            a[i] = i+1;
        
        for (i = 0; i<a.length; i++)
            //System.out.println(a[i]);
        */
       
        for (i = 0; i<counts.length; i++){
            for (j = 0; j<counts[i].length; j++){
                for (k =0; k < counts[i][j].length; k++){
                    counts[i][j][k] = i+j+k;
                    System.out.println("Counts["+i+"]["+j+"]["+k+"]: "+counts[i][j][k]);
                    sumk += counts[i][j][k];
                }
                sumj += counts[i][j][0];
            }
            sumi += counts[i][0][0];
        }
        /* 
        //2nd way 
        for (i = 0; i<counts.length; i++){
            sumi = sumi + counts[i][0][0];
            for (j = 0; j<counts[i].length; j++){
                sumj = sumj + counts[i][j][0];
                for (k =0; k < counts[i][j].length; k++){
                    sumk = sumk + counts[i][j][k];
                }
            }
        } */
        
        
        
        System.out.println("SumI = "+ sumi+"\nSumJ = "+ sumj+"\nSumK = "+ sumk);
        System.out.println(counts.length+" "+counts[0].length);
    }
    
}
