
/* 
Positive number

*/

import java.io.*;
import java.util.Scanner;

public class PositiveNum {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        Scanner obj1 = new Scanner(System.in);
        int b = obj1.nextInt();
        Scanner obj2 = new Scanner(System.in);
        int c = obj2.nextInt();
        int one = 1, two =2, three = 3, zero = 0;
        
        if (a > 0 && b <= 0 && c <= 0)
        System.out.println(one);
        else if (b > 0 && a <= 0 && c <=0)
        System.out.println(one);
        else if (c > 0 && a <= 0 && b <= 0)
        System.out.println(one);
        else if (a > 0 && b > 0 && c <= 0)
        System.out.println(two);
        else if (a > 0 && c > 0 && b <= 0)
        System.out.println(two);
        else if (c > 0 && b > 0 && a <=0)
        System.out.println(two);
        else if (a > 0 && b > 0 && c > 0)
        System.out.println(three);
        else if (a <= 0 && b <= 0 && c <= 0)
        System.out.println(zero);
    }   
}