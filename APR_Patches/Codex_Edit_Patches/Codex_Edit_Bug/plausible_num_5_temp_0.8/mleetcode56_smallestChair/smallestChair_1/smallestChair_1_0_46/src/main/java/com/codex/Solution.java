package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        



        for (int i = 0; i < arr.length; i++)
            arr[i] = Integer.MIN_VALUE;

        int[] arr = new int[times.length];
        for (int i = 0; i < times.length; i++) {
            int arrival = times[i][0];
            int leaving = times[i][1];
            arr[arrival]++;

            arr[leaving]--;
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != Integer.MIN_VALUE)
            cnt += arr[i];

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != Integer.MIN_VALUE) {
                cnt -= arr[i];
                if (cnt == targetFriend)
                    return i;
        }

        return 0;
    }
}