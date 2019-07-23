
/* 
Even and odd digits

Use the keyboard to enter a number. Determine the number of even digits and odd digits in the entered number.
If a number is divisible by 2 without a remainder (i.e. the remainder is zero), then it is even.
And we'll increase the even digit counter (static variable even) by 1.
Otherwise, the number is odd, so we'll increase the odd digit counter (static variable odd).
Display the following message: "Even: a Odd: b", where a is the number of even digits and b is the number of odd digits.

*/

import java.io.*;
import java.io.BufferedReader;


public class EvenOddNum {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //write your code here
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        
        if(input<0){
            input *= -1;
        }
        while(input >= 1) {
            if (input % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            input /= 10;
        }
         br.close();
       
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
