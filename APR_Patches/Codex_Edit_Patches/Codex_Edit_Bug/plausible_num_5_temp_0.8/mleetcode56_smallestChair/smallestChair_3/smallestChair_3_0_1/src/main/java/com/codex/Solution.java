package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        
        boolean[] chairs = new boolean[times.length];

        for (int[] time : times) {
            chairs[time[0]] = true;
        }

        for (int i = 0; i < chairs.length; i++) {
            if (chairs[i]) {
                targetFriend--;
            }
            if (targetFriend < 1) {
                return i;
            }
        }
        return -1;
    }

    
}