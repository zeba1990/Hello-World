/* 
Labels and numbers

*/

import java.io.*;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        
        if((n < 0) && (n%2 == 0)) {
            System.out.println("Negative even number");
        } else if ((n < 0)) {
            System.out.println("Negative odd number");
        } else if((n > 0) && (n%2 == 0)) {
            System.out.println("Positive even number" );
        } else if((n>0)  ) {
             System.out.println("Positive odd number"); 
        } else {
            System.out.println("Zero");
        }
        
    }
}
