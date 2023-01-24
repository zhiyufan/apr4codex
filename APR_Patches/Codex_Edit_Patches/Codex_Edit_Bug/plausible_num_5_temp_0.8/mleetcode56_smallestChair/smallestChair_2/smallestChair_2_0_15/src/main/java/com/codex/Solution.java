package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, float targetFriend) {
        
        int[][] people = new int[times.length][2];
        float[] time = new float[times.length];
        for (int i = 0; i < times.length; i++) {
            people[i] = times[i];
            time[i] = (float)people[i][0];
        }
        targetFriend += 0.00000001;
        int index = Arrays.binarySearch(time, targetFriend);
        while (index >= 0 && targetFriend - time[index] < 0.0000001) {
            index--;
        }
        index++;
        Arrays.sort(people, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
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