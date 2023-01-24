package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        
        // The last chair is for the special judge.
        // And we have to use n+1 size of array because input data can be from 0 - n
        // We don't initialize the array to false because the default value is false.
        boolean[] chairs = new boolean[times.length + 2];

        for (int[] time : times) {
            chairs[time[0]] = true;
            chairs[time[1]] = false;
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