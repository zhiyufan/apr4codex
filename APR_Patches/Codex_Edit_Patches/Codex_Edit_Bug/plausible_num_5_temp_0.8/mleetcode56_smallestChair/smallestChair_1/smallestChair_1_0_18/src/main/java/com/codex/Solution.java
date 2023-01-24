package com.codex;

import java.util.*;

public class Solution {
public static int smallestChair(int[][] times, int targetFriend) {

        int start = Integer.MAX_VALUE, end = Integer.MIN_VALUE;

        for (int i = 0; i < times.length; i++) {

            start = Math.min(start, times[i][0]);
            end = Math.max(end, times[i][1]);

        }


        int[] arr = new int[end - start + 1];

        for (int i = 0; i < times.length; i++) {
            int arrival = times[i][0];
            int leaving = times[i][1];
            arr[arrival]++;
            arr[leaving]--;
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            cnt += arr[i];
            if (cnt - 1 == targetFriend)
                return i;
        }

        return 0;
    }
}