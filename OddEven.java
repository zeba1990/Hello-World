/* 
Streets and houses

1. Create an array of 15 integers.
2. Populate it with values ​​from the keyboard.
3. Let the array index represent the house number. The array value at a particular index represents the number of people living in the corresponding house.
Houses with odd numbers are located on one side of the street. Those with even numbers are on the other side. Find out which side of the street has more people living on it.
4. Display the following message: "Odd-numbered houses have more residents." or "Even-numbered houses have more residents."

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddEven {
    public static void main(String[] args) throws Exception {
        //write your code here
        int[] num = new int[15];
        int[] numEven = new int[15];
        int[] numOdd = new int[15];
        int j= 0, k=0, sumEven=0, sumOdd=0;
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i=0; i<num.length; i++){
            String s = obj.readLine();
            num[i] = Integer.parseInt(s);
        }
        for(int i=0; i<num.length; i++){
            if(i%2==0){
                numEven[j]=num[i];
                sumEven+=numEven[j];
                j++;
            } else{
                numOdd[k]=num[i];
                sumOdd+=numOdd[k];
                k++;
            }
            
        }
        if(sumEven>sumOdd){
            System.out.println("Even-numbered houses have more residents.");
        }else{
            System.out.println("Odd-numbered houses have more residents.");
        }
    }
}
