package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        
        int currMax = 0;
        for (int[] time : times) {
            currMax = Math.max(currMax, time[0]);
            currMax = Math.max(currMax, time[1]);
        }
        int[] chairs = new int[currMax+1];
        for (int[] time : times) {
            for (int i = time[0]; i < time[1]; i++) chairs[i]++;
        }
        int[] temp = Arrays.copyOf(chairs, chairs.length);
        Arrays.sort(temp);
        int currFriend = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == currFriend) currFriend++;
            if (currFriend == targetFriend) return i;
        }
        return -1;
    }

    
}