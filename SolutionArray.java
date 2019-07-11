package com.codegym.task.task04.task0420;

/* 
Sorting three numbers

*/

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
public class SolutionArray {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        Scanner obj1 = new Scanner(System.in);
        int b = obj1.nextInt();
        Scanner obj2 = new Scanner(System.in);
        int c = obj2.nextInt();
        
        int [] arr = {a,b,c};
        
        Arrays.sort(arr);
          for(int i = arr.length - 1 ; i >= 0; i--){
            System.out.println(arr[i]);
        }
        
    }
}
