package com.codegym.task.task06.task0606;

import java.io.*;
import java.io.BufferedReader;

/* 
Even and odd digits

*/

public class EvenOdd1{

        public static void main(String[] args) throws IOException {
        //write your code here
        int evenCount =0, oddCount=0, digit =0;
        
        BufferedReader objNum = new BufferedReader(new InputStreamReader(System.in));
        String inputNum = objNum.readLine();
        int N = Integer.parseInt(inputNum);
        
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        String inputString = obj.readLine();
        int num = Integer.parseInt(inputString);
        
        for(int i=0; i<N; i++){
            digit = num/(int) Math.pow(10,i)%10;
            System.out.println("("+num+"/(10)^("+i+"))%10= "+digit);
            if(digit %2==0){
                evenCount++;
            } else{
                oddCount++;
            }
        }
        
        System.out.println("Even: "+evenCount+" Odd: "+ oddCount);
    }
}
