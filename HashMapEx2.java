//There is a HashMap<String, Object>. 10 different object pairs have been added to it.
//Display the contents of the collection, each element on a new line.

package com.codegym.task.task08.task0806;

import java.util.HashMap;
import java.util.Map;

/* 
HashMap of Objects

*/

public class HashMapEx2 {
    public static void main(String[] args) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        //write your code here
        for(Map.Entry<String, Object> pair : map.entrySet()){
            String key = pair.getKey();
            Object value = pair.getValue();
            System.out.println(key + " - " + value);
        }

    }
}
