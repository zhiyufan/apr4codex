package com.codex;

import java.util.*;

public class Solution {
/**
Given a list of events, where each event is represented as two integers, the start time and the end time, find the smallest room that could accommodate all the events. 

Example 1:

Input: 
events = [[1, 5], [6, 10], [11, 13], [14, 15], [2, 7], [8, 9], [12, 16], [4, 5], [9, 17]]
Output: 
4
Example 2:

Input: 
events = [[540, 600], [600, 660], [600, 630], [650, 700]]
Output: 
2
    
    */

    public static int smallestChair(int[][] times, int targetFriend) {
        if(times==null || times.length==0)
            return 0;
        Arrays.sort(times, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0]-b[0];
            }
        });

        // stores number of friends at each time

        int[] arr = new int[times.length];
        for (int i = 0; i < times.length; i++) {
            int arrival = times[i][0];
            int leaving = times[i][1];
            arr[arrival]++;
            arr[leaving]--;
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            cnt += arr[i];
            if (cnt - 1 == targetFriend)
                return i;
        }

        return 0;
    }
}