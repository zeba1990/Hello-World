/*Use the keyboard to enter numbers and calculate their sum until the user enters the word "sum".
Display the resulting sum on the screen.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Console-based piggy bank

*/

public class DisplaySum {
    public static void main(String[] args) throws Exception {
        //write your code here
        int sum=0, num=0;
        
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
        	String s = buffer.readLine();
        	
        	if (s.equals("sum"))
        		break;
    		num = Integer.valueOf((String) s);
        	sum += num;
        }
        System.out.println(sum);
        
    }
}
