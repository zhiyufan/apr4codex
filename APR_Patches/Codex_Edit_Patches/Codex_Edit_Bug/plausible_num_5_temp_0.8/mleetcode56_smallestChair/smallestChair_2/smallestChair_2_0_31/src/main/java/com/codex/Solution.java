package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        
        int[] arr = new int[times.length];
        for(int i = 0; i < times.length; i++) arr[i] = times[i].start;
        Arrays.sort(arr);
        int chair = -1;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i+1] - arr[i] > 1) {
                chair = i;
                return i;
            }
        }
        return chair == -1 ? arr.length - 1: chair;
    }

    
}