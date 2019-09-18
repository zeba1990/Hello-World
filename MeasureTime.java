/* Measure how long it takes to perform 10,000 get and set calls on each list.
The getGetTimeInMs method must return its execution time in milliseconds. */


package com.codegym.task.task08.task0810;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
Time for 10,000 get calls

*/

public class MeasureTime {
    public static void main(String[] args) {
        System.out.println(getGetTimeInMs(fill(new ArrayList())));
        System.out.println(getGetTimeInMs(fill(new LinkedList())));
    }

    public static List fill(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getGetTimeInMs(List list) {
        // write your code here
        Date obj1 = new Date();
        
        long startTime = obj1.getTime();
        get10000(list);
        Date obj2 = new Date();
        long endTime = obj2.getTime();
        long timeTaken = endTime - startTime;
        
        return timeTaken;
    }

    public static void get10000(List list) {
        if (list.isEmpty()) return;
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}
