package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        
        Arrays.sort(times, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            } else {
                return b[1] - a[1];
            }
        });
        for (int i = 0; i < times.length; i++) {
            if (times[i][0] <= targetFriend && times[i][1] >= targetFriend) {
                return i;
            }
        }
        return -1;
    }

    
}