/* 
Longest string
 Initialize the list of strings.
2. Read 5 strings from the keyboard and add them to this list.
3. Using a loop, find the longest string in the list.
4. Display the string. If there is more than one, display each on a new line.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Longest {
    private static List<String> strings;
    
    
    public static void main(String[] args) throws Exception {
        //write your code here
       
        
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();
        for (int i = 0; i<5; i++){
            String s = obj.readLine();
            strings.add(s);
        }
       
        String longest = strings.get(0);
        
        for(int i=0; i<strings.size(); i++){
            if(longest.length() <= (strings.get(i)).length()){
                longest = strings.get(i);
            } 
        }
         for(String s : strings)
        {
            if(s.length() == longest.length())
            {
                System.out.println(s);
            }
        }
       
    }
}
