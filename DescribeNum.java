/* 
Describing numbers

*/

import java.io.*;
import java.util.Scanner;

public class DescribeNum {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int count=0;
        int num = n;
        while (n != 0) {
            n = n/10;
            count++;
        }
        
        if (num >= 1 && num <=999){
            if(num%2 == 0){
                if(count == 1) {
                    System.out.println("even single-digit number");
                } else if (count == 2) {
                    System.out.println("even two-digit number"); 
                } else {
                    System.out.println("even three-digit number");
                }
            }else {
                if (count == 1) {
                    System.out.println("odd single-digit number");
                } else if (count == 2) {
                    System.out.println("odd two-digit number"); 
                } else {
                    System.out.println("odd three-digit number" );
                }
        }
        }

    }
}
