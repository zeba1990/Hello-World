/* Measure how long it takes to perform 10,000 insertions on each list.
The getInsertTimeInMs method must return its execution time in milliseconds */

package com.codegym.task.task08.task0809;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
Time for 10,000 insertions

*/

public class MeasureTimeOfAdd {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        // write your code here
        Date dateobj = new Date();
        long msStartTime = dateobj.getTime();
        insert10000(list);
        Date obj = new Date();
        long msEndTime = obj.getTime();
        long totalTime =  msEndTime - msStartTime;
        // write your code here
        return totalTime;
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
