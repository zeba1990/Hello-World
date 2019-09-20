/* 
Longest sequence
1. Create a list of numbers.
2. Use the keyboard to add 10 numbers to the list.
3. Display the length of the longest sequence of repeating numbers in the list.
*/


package com.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LongestSequence {
    public static void main(String[] args) throws IOException {
        //write your code here
        ArrayList<Integer> num = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        Scanner obj = new Scanner(System.in);
        for(int i=0; i<10; i++){
            num.add(obj.nextInt());
        }
        
        
        int length=0;
        int j = 0;
        int numTemp = num.get(0);
        for(int i=0; i<num.size(); i++){
            
            
            if(numTemp == num.get(i)){
                length++;
            } else {
                length = 1;
            }
             numTemp = num.get(i);
             list1.add(length);
        }
        
        int finallength = list1.get(0); 
        for(int i=1; i<list1.size(); i++){
            if(finallength<list1.get(i)){
                finallength = list1.get(i);
            }
            
        }
        System.out.println(finallength);
    }
}
