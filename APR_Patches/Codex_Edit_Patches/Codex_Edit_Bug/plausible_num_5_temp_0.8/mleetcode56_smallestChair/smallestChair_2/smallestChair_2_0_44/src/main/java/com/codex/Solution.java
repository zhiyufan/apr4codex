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
        int smallestChairIndex = -1;
        int seatCapacity = 0;
        for (int i = 0; i < times.length; i++) {
            int start = times[i][0];
            int end = times[i][1];
            if (start <= targetFriend && end >= targetFriend) {
                smallestChairIndex = i;
                seatCapacity = end - start;
                break;
            }
        }
        for (int i = smallestChairIndex; i < times.length; i++) {
            int start = times[i][0];
            int end = times[i][1];
            if (targetFriend < start) {
                break;
            }
            if (start <= targetFriend && end >= targetFriend && end - start < seatCapacity) {
                smallestChairIndex = i;
                seatCapacity = end - start;
            }
        }
        return smallestChairIndex;
    }

    
}