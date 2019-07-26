package com.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
One large array and two small ones

*/

public class ArrayPrac{
    public static void main(String[] args) throws Exception {
        //write your code here
        int[] num = new int[20];
        int[] numFirstHalf = new int[10];
        int[] numSecondHalf = new int[10];
        int j=0;
         BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i=0; i<num.length; i++){
            String s = obj.readLine();
            num[i] = Integer.parseInt(s);
        }
        
        for(int i =0; i<(num.length)/2; i++){
            numFirstHalf[i] = num[i];
        }
        for(int i =(num.length)/2; i<num.length; i++){
            numSecondHalf[j] = num[i];
            System.out.println(numSecondHalf[j]);
            j++;
        }
    }
}
