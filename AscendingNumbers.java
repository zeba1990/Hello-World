/* 
Ascending numbers
 Write a program that reads 5 numbers from the keyboard and displays them in ascending order.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;



public class AscendingNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num[]=new int[5]; 
        for(int i =0; i<5; i++){
            String s = reader.readLine();
            num[i] = Integer.parseInt(s);
        }
        Arrays.sort(num);
        for(int i =0; i<5; i++){
            System.out.println(num[i]);
        }
        //write your code here
    }
}
