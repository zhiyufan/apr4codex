package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        
        int[][] people = new int[times.length][2];
        for (int i = 0; i < times.length; i++) {
            people[i] = times[i];
        }
        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0] && a[0] <= targetFriend && targetFriend <= a[1]){ //is not necessary
                                                                               //but it is an additioanl optimization
                return a[1] - b[1];
            } else {
                return a[0] - b[0];
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