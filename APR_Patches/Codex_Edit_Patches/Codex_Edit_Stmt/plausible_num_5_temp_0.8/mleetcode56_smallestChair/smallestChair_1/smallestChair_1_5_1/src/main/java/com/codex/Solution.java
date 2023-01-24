package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        


        int[] arr = new int[times.length];
        for (int i = 0; i < times.length; i++) {
            int arrival = times[i][0];
            int leaving = times[i][1];
            arr[arrival]++; // increasing count of friends in the ball
            arr[leaving]--; // decreasing count of friends in the ball
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            cnt += arr[i]; // now we can find out which ball is the least frequent one
            if (cnt - 1 == targetFriend)
                return i;
        }

        return 0;
    }
}