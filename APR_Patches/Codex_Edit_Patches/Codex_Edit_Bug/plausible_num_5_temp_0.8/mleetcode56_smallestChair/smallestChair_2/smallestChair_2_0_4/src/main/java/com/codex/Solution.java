package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        
        int[][] guests = new int[times.length][2];
        for (int i = 0; i < times.length; i++) {             //Copy the values of times into guests
            guests[i] = times[i];
        }                                                    //Sort the guests according to the time they arrive
        Arrays.sort(guests, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            } else {
                return b[1] - a[1];
            }
        });
        for (int i = 0; i < guests.length; i++) {
            if (guests[i][0] <= targetFriend && guests[i][1] >= targetFriend) {
                return i;
            }
        }
        for (int i = 0; i < times.length; i++) {             //If there is no guest whose arrival is before the targetFriend
            if (times[i][1] < targetFriend) {                //and departure is after the arrival, return -1
                return -1;
            }
            return i;                                       //else return the index of the first guest who arrives after the
        }                                                    //targetFriend
        }
        return -1;
    }

    
}