package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        
        int[][] people = new int[times.length][2];
        for (int i = 0; i < times.length; i++) {
            people[i] = times[i];
        }
        Arrays.sort(people, (c, d) -> {
            if (c[0] != d[0]) {
                return c[0] - d[0];
            } else {
                return b[1] - a[1];
            }
        });
        for (int i = 0; i < people.length; i++) {
            if (people[i][0] <= targetFriend && people[i][1] >= targetFriend) {
                return i;
            }
        }
        return -1;
    }

    
}