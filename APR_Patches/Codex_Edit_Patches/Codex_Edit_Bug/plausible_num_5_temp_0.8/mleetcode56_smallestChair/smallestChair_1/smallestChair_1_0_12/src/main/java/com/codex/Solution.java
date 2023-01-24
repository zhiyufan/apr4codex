package com.codex;

import java.util.*;

public class Solution {
public static int smallestChair(int[][] times, int targetFriend) {

        int min = times[0][0];
        int max = times[0][1];
        int[] arr = new int[times.length];
        for (int i = 0; i < times.length; i++) {
            if (times[i][0] < min) {
                min = times[i][0];
            }
            if (times[i][1] > max) {
                max = times[i][1];
            }
        }
        int[] arr2 = new int[max + 1];
        for (int i = 0; i < times.length; i++) {
            int arrival = times[i][0] - min;
            int leaving = times[i][1] - min;
            arr[arrival]++;
            arr[leaving]--;
        }
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            cnt += arr[i];
            if (cnt - 1 == targetFriend) {
                return i + min;
            }
        }

        return 0;
    }
}