package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        
        int currMax = 0; 
        for (int[] time : times) {   // finding the max time when all the friends are there
            currMax = Math.max(currMax, time[0]);
            currMax = Math.max(currMax, time[1]);
        }
        int[] chairs = new int[currMax+1];   // storing frequency where a chair is assigned to a friend
        for (int[] time : times) {
            for (int i = time[0]; i < time[1]; i++) chairs[i]++;   //checking for the given time a chair is assigned to a friend 
        }
        for (int i = 0; i < chairs.length; i++) {
            if (chairs[i] == targetFriend) return i;
        }
        return -1;
    }

    
}