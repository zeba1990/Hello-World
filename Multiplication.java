/* 
Multiplication table

*/

import java.io.*;

public class Multiplication {
    public static void main(String[] args) throws Exception {
        //write your code here
        int i=1, j=1, k=1;
        while(i<=10){
            while(j<=10){
                System.out.print(i*j+" ");
                j++;
            }
            System.out.println();
            j=1;
            i++;
        }
            

    }
}
