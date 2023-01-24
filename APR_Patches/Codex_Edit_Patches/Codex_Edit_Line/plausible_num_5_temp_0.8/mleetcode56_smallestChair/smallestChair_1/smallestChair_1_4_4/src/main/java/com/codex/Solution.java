package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        


        int[] arr = new int[times.length+1];
        for (int i = 0; i < times.length+1; i++) {
            int arrival = times[i][0];
            int leaving = times[i][1];
            arr[arrival]++;
            arr[leaving]--;
        }

        int cnt = 0;
        for (int i = 0; i < arr.length+1; i++) {
            cnt += arr[i];
            if (cnt - 1 == targetFriend)
                return i;
        }

        return 0;
    }
}