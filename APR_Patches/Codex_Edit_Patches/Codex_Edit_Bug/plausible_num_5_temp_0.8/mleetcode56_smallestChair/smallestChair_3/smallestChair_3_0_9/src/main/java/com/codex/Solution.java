package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        
        boolean[] chairs = new boolean[times.length + 2];

        for (int[] time : times) {
            chairs[time[0]] = true; // add friend's start time
            chairs[time[1] + 1] = false; // subtract friend's end time
        }

        for (int i = 0; i < chairs.length; i++) {
            if (chairs[i]) {
                targetFriend--;
            }
            if (targetFriend < 0) {
                return i;
            }
        }
        return -1;
    }

    
}