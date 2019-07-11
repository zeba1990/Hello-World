/* 
Jen or Jen?

*/

import java.io.*;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner obj = new Scanner(System.in);
        String name1 = obj.nextLine();
         Scanner obj2 = new Scanner(System.in);
        String name2 = obj2.nextLine();
        
        if(name1.equals(name2)){
            System.out.println("The names are identical");
        } else if(name1.length() == name2.length()){
            System.out.println("The names are the same length");
        } else {}
        
    }
}
