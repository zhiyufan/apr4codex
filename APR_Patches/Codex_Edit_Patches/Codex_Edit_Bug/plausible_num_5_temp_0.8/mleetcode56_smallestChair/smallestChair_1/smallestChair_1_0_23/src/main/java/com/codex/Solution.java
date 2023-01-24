package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        


        int[] arr = new int[times.length];
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
    /**
     * this is a function
     * @param a
     * @param b
     * @param target
     * @return 
     */
    public static boolean findNumber(int[] a, int[] b, int target) {
        int i = 0, j = b.length - 1;
        while (i < a.length && j >= 0) {
            if (a[i] + b[j] == target) {
                return true;
            } else if (a[i] + b[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}