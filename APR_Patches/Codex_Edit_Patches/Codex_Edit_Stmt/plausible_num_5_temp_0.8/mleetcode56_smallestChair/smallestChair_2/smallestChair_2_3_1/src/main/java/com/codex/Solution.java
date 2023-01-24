package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        
        Arrays.sort(times, (a, b) -> {
            if (a.start != b.start) return a.start - b.start;
            return a.end - b.end;
        });
        
        for (int i = 0; i < times.length; i++) {
            if (times[i][0] <= targetFriend && times[i][1] >= targetFriend) {
                return i;
            }
        }
        
        return -1;
    }

    
}