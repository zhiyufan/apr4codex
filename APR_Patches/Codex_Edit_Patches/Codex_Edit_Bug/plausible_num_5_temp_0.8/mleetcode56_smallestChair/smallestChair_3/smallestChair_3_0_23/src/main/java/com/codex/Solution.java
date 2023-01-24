package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        if (times.length == 0) {
            return 1;
        }
        
        boolean[] chairs = new boolean[times[times.length - 1][1] + 1];

        for (int[] time : times) {
            chairs[time[0]] = true;
            chairs[time[1]] = true;
        }

        for (int i = 0; i < chairs.length; i++) {
            if (!chairs[i]) {
                targetFriend--;
            }
            if (targetFriend < 0) {
                return i;
            }
        }
        return -1;
    }

    
}