package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        
        int[][] people = new int[times.length][2];
        for (int i = 0; i < times.length; i++) {
            people[i] = times[i];
        }
        Arrays.sort(people, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            } else {
                return b[1] - a[1];
            }
        });
        // for (int i = 0; i < people.length; i++) {
        //     if (people[i][0] <= targetFriend && people[i][1] >= targetFriend) {
        //         return i;
        //     }
        // }
        // return -1;

        int i = 0;
        for (i = 0; i < people.length && people[i][0] <= targetFriend; i++)
            if (people[i][1] >= targetFriend)
                return i;
        return -1;
    }

    public static int smallestChair_other(int[][] times, int targetFriend) {
        // sort the time intervals by end time
        Arrays.sort(times,(a,b)->a[0]-b[0]);

        // find the first interval that contains targetFriend
        int left = 0;
        int right = times.length-1;
        while (left <= right) {
            int mid = left + (right-left) / 2;
            if (times[mid][0] <= targetFriend && times[mid][1] >= targetFriend) {
                return mid;
            } else if (times[mid][0] > targetFriend) {  // all intervals in [left,mid] do not contain targetFriend
                right = mid - 1;
            } else {  // all intervals in [mid,right] do not contain targetFriend
                left = mid + 1;
            }
        }
        
        return -1;
    }

    
    
}