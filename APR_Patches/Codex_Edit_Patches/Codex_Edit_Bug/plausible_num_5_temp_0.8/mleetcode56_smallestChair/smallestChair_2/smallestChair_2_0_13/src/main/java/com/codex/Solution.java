package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        
        int[][] people = new int[times.length][4];
        for (int i = 0; i < times.length; i++) {
            people[i] = times[i];
            people[i][2] = times[i][0];
            people[i][3] = times[i][1];
        }
        Arrays.sort(people, (a, b) -> {
            if (a[2] != b[2]) {
                return a[2] - b[2];
            } else {
                return b[3] - a[3];
            }
        });
        for (int i = 0; i < people.length; i++) {
            if (people[i][2] <= targetFriend && people[i][3] >= targetFriend) {
                return i;
            }
        }
        return -1;
    }

    
}