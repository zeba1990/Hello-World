/* 
Remove and insert
1. Create a list of strings.
2. Add 5 strings from the keyboard.
3. Do the following 13 times: remove the last string and insert it at the beginning.
4. Use a loop to display the resulting list, each value on a new line.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class RemovePrac {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> list= new ArrayList<String>();
        BufferedReader obj= new  BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<5;i++){
            String s=obj.readLine();
            list.add(s);
            
        }  
        String a="";
        for(int j=0; j<13; j++){
             a =list.get(4);
            list.remove(4);
            list.add(0,a);
            
        }
        for(int k=0; k<list.size(); k++){
            System.out.println(list.get(k));
        }
       
        
        
        
    }
}
