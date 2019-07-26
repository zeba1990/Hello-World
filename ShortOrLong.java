/* 
Shortest or longest
1. Create a list of strings.
2. Add 10 strings from the keyboard.
3. Find out which string occurs earlier in the list: the shortest or the longest.
If several strings are shortest or longest, then consider the very first such string encountered.
4. Display the string described in Step 3. One string should be displayed.
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class ShortOrLong {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<10;i++){
            String s = obj.readLine();
            list.add(s);
        }
        String longest = list.get(0);
        String shortest = list.get(0);
        int shortIndex=0, longIndex=0;
        for(int i=0; i<list.size(); i++){
            if(shortest.length()>list.get(i).length()){
                shortest = list.get(i);
                shortIndex = i;
            }
            if(longest.length() < (list.get(i)).length()){
                longest = list.get(i);
                longIndex=i;
            } 
            
        }
        
        if(shortIndex<longIndex){
                System.out.println(list.get(shortIndex));
        }else{
            System.out.println(list.get(longIndex));
           
        }
       
    }
}
