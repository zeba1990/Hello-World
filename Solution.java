package com.codegym.task.task04.task0415;

/* 
Rule of the triangle

*/

import java.io.*;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
    
        Scanner obj1 = new Scanner(System.in);
        int a = obj1.nextInt();
        Scanner obj2 = new Scanner(System.in);
        int b = obj2.nextInt();
        Scanner obj3 = new Scanner(System.in);
        int c = obj3.nextInt();
        
        if((a+b > c) && (b+c > a) && (a+c > b)){
            System.out.println("The triangle is possible.");
        } else {
            System.out.println("The triangle is not possible.");
        }
    }
}