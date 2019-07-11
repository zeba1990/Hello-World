/* 
Three numbers

*/

import java.io.*;
import java.util.Scanner;

public class Unique {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner obj1 = new Scanner(System.in);
        int a = obj1.nextInt();
        Scanner obj2 = new Scanner(System.in);
        int b = obj2.nextInt();
        Scanner obj3 = new Scanner(System.in);
        int c = obj3.nextInt();
   
        
            if(a == b){
                System.out.println(3);
            } else if (b==c){
                System.out.println(1);
            } else if(a==c){
                System.out.println(2);
            }
        
    }
}