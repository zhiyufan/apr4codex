package com.codex;

import java.util.*;

public class Solution {
public static int smallestChair(int[][] times, int targetFriend) {
        int startIndex = 0, endIndex = times.length + 2;
        boolean[] chairs = new boolean[times.length + 3];

        for (int[] time : times) {
            chairs[time[0]] = true;
            chairs[time[1] + 1] = false;
        }

        for (int i = startIndex; i < endIndex; i++) {
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