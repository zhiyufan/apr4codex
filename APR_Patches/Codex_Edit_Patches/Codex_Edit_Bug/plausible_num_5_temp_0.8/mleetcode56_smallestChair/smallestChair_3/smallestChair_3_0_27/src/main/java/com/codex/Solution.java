package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        
        int n = times.length;
        boolean[] chairs = new boolean[times.length + 2];

        for (int[] time : times) {
            chairs[time[0]] = true;
            chairs[time[1] + 1] = false;
        }

        for (int i = 0; i < chairs.length + 1; i++) {
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